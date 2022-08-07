package br.com.ufape.poo;
import java.util.Arrays;
import java.util.Date;


public abstract class Conta {
	private String numero;
	protected float saldo;
	private boolean ativo;
	private int indiceRegistro;
	private RegistroOperacao[] registros;
	private Date dataOp;

	public Conta(String numero, float saldo, boolean ativo) {
		this.numero = numero;
		this.saldo = saldo;
		this.ativo = ativo;
		this.registros = new RegistroOperacao[10000];
		this.dataOp = new Date();
		

	}
	
	public Conta(String n, float s) {
		this(n);
		saldo = s;
	}
	
	public Conta(String n) {
		this.numero = n;
		this.saldo = 0;
		this.indiceRegistro = 0;
		this.registros = new RegistroOperacao[10000];
	}
	
	public void creditar(float valor) {
		registrarMovimentacao(new RegistroOperacao("creditar", valor, dataOp));
		this.saldo += valor;
	}
	
	public void registrarMovimentacao(RegistroOperacao reg) {
		registros[indiceRegistro++] = reg;
	} 


	protected boolean debitar(float valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(float valor, Conta c) {
		if(debitar(valor)) {
			registrarMovimentacao(new RegistroOperacao("transferencia para " + c.numero, valor, dataOp));
			c.creditar(valor);
			return true;
		} 
		return false;
	}
	
	public float consultarSaldo() {
		//System.out.println(saldo); usada para ver o valor do saldo atual
		return saldo;
	}
	
	public RegistroOperacao[] extratoPeriodo(Date de, Date ate) {
		return Arrays.stream(registros).limit(indiceRegistro)
				.filter(r -> r.getData().compareTo(de) >= 0 && r.getData().compareTo(ate) <= 0)
				.toArray(RegistroOperacao[]::new);		
	}
	
	public RegistroOperacao[] extratoMensal(int mes) {		
		
		return Arrays.stream(registros).limit(indiceRegistro)
				.filter(r -> r.consultarMes() == mes)
				.toArray(RegistroOperacao[]::new);	
		
		
		//public RegistroOperacao[] extratoMensal(int mes) {
	    //    RegistroOperacao registroAtual;
	    //    RegistroOperacao[] extratoMes = new RegistroOperacao[1000];

	    //    int proxOp = 0;
	    //    for (int i = 0; i < indiceRegistro ; i++) {
	    //        registroAtual = historicoOperacoes[i];
	    //        if (registroAtual.getMesOperacao() == mes) {
	    //            extratoMes[proxOp++] = registroAtual;
	    //       }
	    //    }
	    //    return extratoMes;
	   // }
	
	}

	public float getSaldo() {
		return this.saldo;
	}

	public int getIndiceRegistro() {
		return this.indiceRegistro;
	}

	public RegistroOperacao[] getRegistros() {
		return this.registros;
	}
	
	public Date getDataOp() {
		return this.dataOp;
	}

	public String getNumero() {
		return this.numero;
	}

	public boolean isAtivo() {
		return this.ativo;
	}

//	@Override
//	public String toString() {
//		return "Conta [numero=" + numero + ", saldo=" + saldo + ", ativo=" + ativo + ", indiceRegistro="
//				+ indiceRegistro + ", registros=" + Arrays.toString(registros) +  "]";
//	}

	
}
