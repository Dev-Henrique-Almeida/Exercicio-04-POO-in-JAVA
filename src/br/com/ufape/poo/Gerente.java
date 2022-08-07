package br.com.ufape.poo;

import java.util.Date;

public class Gerente extends Funcionario {
	private Login login;

	public Gerente(String nome, Date nascimento, float salario, String cpf, Endereco endereco) {
		super(nome, nascimento, salario, cpf, endereco);
	
	}

	public Login getLoginGerente() {
		return login;
	}

	public void setLoginGerente(Login loginGerente) {
		this.login = loginGerente;
	}

}
