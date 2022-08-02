package br.com.civitt.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBancoDados 
{
	public static Connection conexaoBanco() {
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String serverName = "192.168.1.246";
		      String portNumber = "1521";
		      String service = "orcl";
		      String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + service;
		      String username = "teste";
		      String password = "tecsis";
		      
		      conexao = DriverManager.getConnection(url , username, password);
			
			// conexao = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.246:1521:orcl", "teste", "tecsis");
			}
	        catch (ClassNotFoundException e) {
	            System.out.println("Erro de conexão: ");
	            e.printStackTrace();
	        }
	        catch (SQLException e2) {
	            e2.printStackTrace();
	        }
		
		return conexao;
	}
	
	
	
}
