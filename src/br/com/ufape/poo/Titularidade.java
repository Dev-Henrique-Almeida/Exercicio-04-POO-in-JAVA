package br.com.ufape.poo;

public class Titularidade {
	private int ordem;
	private Conta conta;
	private Cliente clientes;

	
	public Titularidade(Conta conta, Cliente clientes) {
		this.conta = conta;
		this.clientes = clientes;
		this.ordem = 0;
	}


	public int getOrdem() {
		return ordem;
	}

	public Conta getConta() {
		return conta;
	}

	public Cliente getClientes() {
		return clientes;
	}

	
}
