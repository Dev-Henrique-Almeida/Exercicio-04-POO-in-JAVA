package br.com.ufape.poo;
import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date nascimento;
	private String cpf;
	private Endereco endereco;
	
	public Pessoa(String nome, Date nascimento, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public Date getNascimento() {
		return this.nascimento;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}




	

	
	
}
