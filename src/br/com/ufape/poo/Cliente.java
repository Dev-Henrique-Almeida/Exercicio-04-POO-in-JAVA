package br.com.ufape.poo;

import java.util.Date;

public class Cliente extends Pessoa {
	private Login login;
	private Conta[] contas;

	public Cliente(String nome, Date nascimento, String cpf, Endereco endereco) {
		super(nome, nascimento, cpf, endereco);
		this.setLogin(login);
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Conta[] getContas() {
		return contas;
	}
	

}
