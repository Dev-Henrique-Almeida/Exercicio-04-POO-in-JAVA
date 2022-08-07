package br.com.ufape.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestContaCorrente {
	private ContaCorrente cc; //, cc1;
	
	
	@BeforeEach
	void setUp() throws Exception{
		cc = new ContaCorrente("1000", 100, true);
		//cc1 = new ContaCorrente("1001", 110, true);
		
	}
	
	@Test
	void testDebitarCorrente() {
		assertTrue(cc.debitarCorrente(100, null));
		assertEquals(0, cc.getSaldo());
		
		assertFalse(cc.debitarCorrente(150, null));
		assertEquals(0, cc.getSaldo());
	}
	
	@Test
	void testPagamento() {
		
		System.out.println("Teste antes do pagamento: " + cc.consultarSaldo());
		cc.pagamento(100, "123", null);
		System.out.println("Teste depois do pagamento: " + cc.consultarSaldo());
		
		//assertTrue();
	}
	//public boolean pagamento(float valor, String codigo, Date dataOp) {
	//	if(codigo != null) {
	//		if(this.debitar(valor) == true) {
	//			this.registrarMovimentacao(new RegistroOperacao("Pagamento efetuado", valor, dataOp));
	//			return true;
	//		}
	//	}
	//	return false;
	//}
//	
//	public boolean debitar(float valor) {
//		if(this.saldo >= valor) {
//			saldo -= valor;
//			return true;
//		}
//		return false;
//	}
//	
}
