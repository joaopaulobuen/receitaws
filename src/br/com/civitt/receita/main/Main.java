package br.com.civitt.receita.main;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.gson.Gson;


import br.com.civitt.connection.ConexaoBancoDados;
import br.com.civitt.receita.models.AtributosReceita;
import br.com.civitt.util.Util;

public class Main {

	// Endereço correto
	// static String webService = "https://receitaws.com.br/v1/cnpj/46507316000175";

	static String cnpj = null;
	static String webService = "https://receitaws.com.br/v1/cnpj/";

	static int codigoSucesso = 200;
	static String statusError = "ERROR";

	public static void main(String[] args) throws IOException, SQLException {

		//Chamar método aqui para que o algorítimo faça alguma coisa
		
		/* ATIVIDADES
		 * 1. Conectar no banco de dados
		 * 2. Retornar 50 CNPJ's da tabela TGFPAR
		 * 3. Passar CNPJ via parametro no método ConsultaCnpj();
		 * */
		
		//Variavel que receberá os CNPJ's a serem consultados
		//cnpj = "1237816237";
		
		//Método para consultar CNPJ
		//ConsultaCnpj(cnpj);
		
		ConexaoBancoDados con = new ConexaoBancoDados();
		Connection conexao = con.conexaoBanco();
		Statement statement = conexao.createStatement();
		String query = "SELECT CGC_CPF 		  "
					 + "  FROM TGFPAR  		  "
					 + " WHERE ATIVO = 'S' 	  "
					 + "   AND ROWNUM <= 50   "
					 + "   AND TIPPESSOA = 'J'";

        ResultSet resultSet = statement.executeQuery(query);
        
        while (resultSet.next()) {
			ConsultaCnpj(resultSet.getString("CGC_CPF"));
        	System.out.println("----------------------------------------------------------------");
		}
		
	}
	
	public static void ConsultaCnpj(String cnpj) throws IOException {
		
		AtributosReceita resultado = chamaApi(cnpj);

		String text = null;
		String code = null;

		if (resultado.getStatus() != null && resultado.getStatus() != statusError
				&& resultado.getAtividadePrincipal() != null && resultado.getAtividadePrincipal().get(0) != null) {

			text = resultado.getAtividadePrincipal().get(0).getText();
			code = resultado.getAtividadePrincipal().get(0).getCode();

			System.out.println("CNPJ: " + resultado.getCnpj());
			System.out.println("Status: " + resultado.getStatus());

			System.out.println("Atividade Principal: " + text);
			System.out.println("Código: " + code);

		} else {
			System.out.println("Status: " + resultado.getStatus());
			System.out.println("Mensagem: " + resultado.getMensagem());
		}

	}

	public static AtributosReceita chamaApi(String cnpj) throws IOException {

		URL url = new URL(webService + cnpj);

		HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

		if (conexao.getResponseCode() != codigoSucesso) {
			throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
		}

		BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
		String jsonEmString = Util.converteJsonEmString(resposta);

		// System.out.println(jsonEmString);

		Gson gson = new Gson();

		AtributosReceita atributosReceita = gson.fromJson(jsonEmString, AtributosReceita.class);

		return atributosReceita;

	}

}
