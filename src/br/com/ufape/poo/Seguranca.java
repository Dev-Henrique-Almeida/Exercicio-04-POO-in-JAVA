package br.com.ufape.poo;

import java.util.Date;

public class Seguranca extends Funcionario {
	private boolean noturno;	
	

	public Seguranca(String nome, Date nascimento, float salario, String cpf, Endereco endereco, boolean noturno) {
		super(nome, nascimento, salario, cpf, endereco);
		this.noturno = noturno;
	}


	public boolean isNoturno() {
		return noturno;
	}

	
	
}
