package br.com.ufape.poo;

public class Endereco {
	private String logradouro;
	private String numero;
	private String cep;
	private String bairro;
	private String municipio;
	private String uf;
	
	public Endereco(String logradouro, String numero, String cep, String bairro, String municipio, String uf) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getUf() {
		return uf;
	}


	
}
