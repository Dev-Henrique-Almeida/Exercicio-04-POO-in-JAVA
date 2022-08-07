package br.com.ufape.poo;

import java.util.Date;

public class ServicosGerais extends Funcionario {
	private String funcao;
	
	public ServicosGerais(String nome, Date nascimento, float salario, String cpf, Endereco endereco, String funcao) {
		super(nome, nascimento, salario, cpf, endereco);
		this.funcao = funcao;
	}



	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	
}
