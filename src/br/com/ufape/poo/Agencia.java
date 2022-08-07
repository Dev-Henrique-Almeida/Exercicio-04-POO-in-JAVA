package br.com.ufape.poo;

public class Agencia {
	private String nome;
	private String numero;
	private Endereco endereco;
	private Conta[] contas;
	private Funcionario[] funcionarios;
	private int indiceConta;
	private int indiceFuncionario;
	
	
	
	public Agencia(String nome, String numero, Endereco endereco) {
		this.nome = nome;
		this.numero = numero;
		this.endereco = endereco;
		this.contas = new Conta[100];
		this.funcionarios = new Funcionario[4000];

	}

	public void adicionarConta(Conta c) {
		contas[indiceConta++] = c;

	}
	
	public Conta procurarConta(String numero) {
		for(Conta c : contas) {
			if(c.getNumero() == numero) {
				return c;
			}
		}
		return null;
	}
	
	public void adicionarFuncionario(Funcionario f) {
		funcionarios[indiceFuncionario++] = f;
	}
	
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public String toString() {
		return "" + this.nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public Conta[] getContas() {
		return contas;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	
	
}
