package br.com.civitt.receita.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AtributosReceita {

	@SerializedName("atividade_principal")
	@Expose
	private List<AtividadePrincipal> atividadePrincipal = null;
	@SerializedName("data_situacao")
	@Expose
	private String dataSituacao;
	@SerializedName("complemento")
	@Expose
	private String complemento;
	@SerializedName("tipo")
	@Expose
	private String tipo;
	@SerializedName("nome")
	@Expose
	private String nome;
	@SerializedName("telefone")
	@Expose
	private String telefone;
	@SerializedName("email")
	@Expose
	private String email;
	@SerializedName("atividades_secundarias")
	@Expose
	private List<AtividadesSecundaria> atividadesSecundarias = null;
	@SerializedName("qsa")
	@Expose
	private List<Object> qsa = null;
	@SerializedName("situacao")
	@Expose
	private String situacao;
	@SerializedName("bairro")
	@Expose
	private String bairro;
	@SerializedName("logradouro")
	@Expose
	private String logradouro;
	@SerializedName("numero")
	@Expose
	private String numero;
	@SerializedName("cep")
	@Expose
	private String cep;
	@SerializedName("municipio")
	@Expose
	private String municipio;
	@SerializedName("porte")
	@Expose
	private String porte;
	@SerializedName("abertura")
	@Expose
	private String abertura;
	@SerializedName("natureza_juridica")
	@Expose
	private String naturezaJuridica;
	@SerializedName("uf")
	@Expose
	private String uf;
	@SerializedName("cnpj")
	@Expose
	private String cnpj;
	@SerializedName("ultima_atualizacao")
	@Expose
	private String ultimaAtualizacao;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("message")
	@Expose
	private String mensagem;
	@SerializedName("fantasia")
	@Expose
	private String fantasia;
	@SerializedName("efr")
	@Expose
	private String efr;
	@SerializedName("motivo_situacao")
	@Expose
	private String motivoSituacao;
	@SerializedName("situacao_especial")
	@Expose
	private String situacaoEspecial;
	@SerializedName("data_situacao_especial")
	@Expose
	private String dataSituacaoEspecial;
	@SerializedName("capital_social")
	@Expose
	private String capitalSocial;
	@SerializedName("extra")
	@Expose
	private Extra extra;
	@SerializedName("billing")
	@Expose
	private Billing billing;

	public List<AtividadePrincipal> getAtividadePrincipal() {
		return atividadePrincipal;
	}

	public void setAtividadePrincipal(List<AtividadePrincipal> atividadePrincipal) {
		this.atividadePrincipal = atividadePrincipal;
	}

	public String getDataSituacao() {
		return dataSituacao;
	}

	public void setDataSituacao(String dataSituacao) {
		this.dataSituacao = dataSituacao;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<AtividadesSecundaria> getAtividadesSecundarias() {
		return atividadesSecundarias;
	}

	public void setAtividadesSecundarias(List<AtividadesSecundaria> atividadesSecundarias) {
		this.atividadesSecundarias = atividadesSecundarias;
	}

	public List<Object> getQsa() {
		return qsa;
	}

	public void setQsa(List<Object> qsa) {
		this.qsa = qsa;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getAbertura() {
		return abertura;
	}

	public void setAbertura(String abertura) {
		this.abertura = abertura;
	}

	public String getNaturezaJuridica() {
		return naturezaJuridica;
	}

	public void setNaturezaJuridica(String naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(String ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getEfr() {
		return efr;
	}

	public void setEfr(String efr) {
		this.efr = efr;
	}

	public String getMotivoSituacao() {
		return motivoSituacao;
	}

	public void setMotivoSituacao(String motivoSituacao) {
		this.motivoSituacao = motivoSituacao;
	}

	public String getSituacaoEspecial() {
		return situacaoEspecial;
	}

	public void setSituacaoEspecial(String situacaoEspecial) {
		this.situacaoEspecial = situacaoEspecial;
	}

	public String getDataSituacaoEspecial() {
		return dataSituacaoEspecial;
	}

	public void setDataSituacaoEspecial(String dataSituacaoEspecial) {
		this.dataSituacaoEspecial = dataSituacaoEspecial;
	}

	public String getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(String capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public Extra getExtra() {
		return extra;
	}

	public void setExtra(Extra extra) {
		this.extra = extra;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


}