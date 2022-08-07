package br.com.ufape.poo;

import java.util.Date;

public abstract class Funcionario extends Pessoa {
	private float salario;
	
	public Funcionario(String nome, Date nascimento, float salario, String cpf, Endereco endereco) {
		super(nome, nascimento, cpf, endereco);
		this.salario = salario;
	}
	
	public void reajustarSalario(float taxa) {
		float novoSalario = getSalario() + taxa;
		setSalario(novoSalario);
	}
	

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}


	


}
