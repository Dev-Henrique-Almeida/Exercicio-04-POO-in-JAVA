package br.com.ufape.poo;

public class Banco {
	private String nome;
	private Agencia[] agencias;
	private Cliente[] clientes;
	private int indiceAgencia;
	private int indiceCliente;
	
	public Banco(String n) {
		n = nome;
		indiceAgencia = 0;
		indiceCliente = 0;
		agencias = new Agencia[100];
		clientes = new Cliente[100];
	}
	
	public void cadastrarAgencia(Agencia agencia) {
		agencias[indiceAgencia++] = agencia;
	}
	
	public Agencia procurarAgenciaNome(String nome) {
		for(Agencia agencia : agencias) {
			if(agencia.getNome() == nome) {
				return agencia;
			}
		}
		return null;
	}
	
	public void adicionarCliente(Cliente c) {
		clientes[indiceCliente++] = c;
	}

	public String getNome() {
		return nome;
	}
	
	public Agencia[] getAgencias() {
		return agencias;
	}
	
	public Cliente[] getClientes() {
		return clientes;
	}

}

