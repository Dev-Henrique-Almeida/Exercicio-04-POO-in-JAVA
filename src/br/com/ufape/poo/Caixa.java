package br.com.ufape.poo;

import java.util.Date;

public class Caixa extends Funcionario {
	private Login loginCaixa;

	public Caixa(String nome, Date nascimento, float salario, String cpf, Endereco endereco) {
		super(nome, nascimento, salario, cpf, endereco);

	}

	public Login getLoginCaixa() {
		return loginCaixa;
	}

	public void setLoginCaixa(Login loginCaixa) {
		this.loginCaixa = loginCaixa;
	}


}
