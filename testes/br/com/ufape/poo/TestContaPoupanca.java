package br.com.ufape.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestContaPoupanca {

private ContaPoupanca cc; //,cc1;
	
	
	@BeforeEach
	void setUp() throws Exception{
		cc = new ContaPoupanca("1000", 100, true);
		//cc1 = new ContaPoupanca("1001", 110, true);
		
	}
	
	
	@Test
	void testDebitarPoupanca() {
		assertTrue(cc.debitarPoupanca(100));
		assertEquals(0, cc.getSaldo());
		
		assertFalse(cc.debitarPoupanca(100));
		assertEquals(0, cc.getSaldo());
	}

	@Test
	void testRendimentoMensal(){
		//System.out.println(cc.getSaldo());
		cc.rendimentoMensal(10);
		//System.out.println(cc.getSaldo());
		
	}
		//public void rendimentoMensal(float taxa){
		//	float saldo = this.consultarSaldo();
		//	if (saldo > 0) {
		//		creditar(taxa);
		//		registrarMovimentacao(new RegistroOperacao("rendimento", saldo * taxa / 100, dataOperacao));
		//	}
		//}

}
