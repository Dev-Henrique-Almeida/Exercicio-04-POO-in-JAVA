package br.com.ufape.poo;


public class ContaPoupanca extends Conta {
	
	
	public ContaPoupanca(String numero) {
		super(numero);
	}

	
	public ContaPoupanca(String numero, float saldo, boolean ativo) {
		super(numero, saldo, ativo);
	}
	
	public boolean debitarPoupanca(float valor) {
		return (this.debitar(valor));
	}
	
	public void rendimentoMensal(float taxa){
		float saldo = this.consultarSaldo();
		if (saldo > 0) {
			creditar(taxa);
			registrarMovimentacao(new RegistroOperacao("rendimento", saldo * taxa / 100, getDataOp()));
		}
	}
/* setSaldo(getSaldo() + getSaldo()*taxa); */

}
