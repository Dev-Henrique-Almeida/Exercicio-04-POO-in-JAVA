package br.com.ufape.poo;

import java.util.Date;

public class ContaCorrente extends Conta {
	
	private float tarifa;
	private float limiteCredito;
	
	public ContaCorrente(String numero, float saldo, boolean ativo) {
		super(numero, saldo, ativo);
		this.tarifa = 0;
		this.limiteCredito = 0;
		
	}
	
	public boolean pagamento(float valor, String codigo, Date dataOp) {
		if(codigo != null) {
			if(this.debitar(valor) == true) {
				this.registrarMovimentacao(new RegistroOperacao("Pagamento efetuado", valor, getDataOp()));
				return true;
			}
		}
		return false;
	}

	public boolean debitarCorrente(float valor, Date dataOp) {
		if(this.debitar(valor) == true) {
			this.registrarMovimentacao(new RegistroOperacao("debitar", valor, getDataOp()));
			return true;
		}else if (this.limiteCredito >= valor) {
			this.limiteCredito -= valor;
			
			this.registrarMovimentacao(new RegistroOperacao("debitar limite de credito", valor, getDataOp()));
			return true;
		}else {
			return false;
		}

	}

	public float getTarifa() {
		return tarifa;
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	
	
}
