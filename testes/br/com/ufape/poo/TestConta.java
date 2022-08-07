package br.com.ufape.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConta {

	private ContaCorrente cc, cc1;
	private Date dataMes1, dataMes2;

//	private Cliente c1;

	private RegistroOperacao r1;

	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() throws Exception {
		cc = new ContaCorrente("1000", 100, true);
		cc1 = new ContaCorrente("1001", 100, true);

	//	Endereco endereco = new Endereco(null, null, null, null, null, null);

		r1 = new RegistroOperacao("creditar", 100, null);

	//	c1 = new Cliente("Henrique", null, "123", endereco);
		
		dataMes1 = new Date(2021 - 1900, 7, 06);
		//System.out.println(dataMes1);
		
		dataMes2 = new Date(2022 - 1900, 7, 10);
		//System.out.println(dataMes2);

	}

	@Test
	void testCreditar() {
		cc = new ContaCorrente("1000", 100, true);
		cc.consultarSaldo();
		cc.creditar(10);
		cc.consultarSaldo();

	}

	@Test
	void testRegistrarMovimentacao() {
		
		cc.registrarMovimentacao(r1);
		assertEquals(r1, cc.getRegistros()[0]);
		

	}

	@Test
	void testConsultarSaldo() {
		cc.consultarSaldo();
	}

	@Test
	void testTransferir() {

		//System.out.println("Antes cc - " + cc.getSaldo());

		//System.out.println("Antes cc1 - " + cc1.getSaldo());
		assertTrue(cc.transferir(10, cc1));
		//System.out.println();
		//System.out.println("Depois cc - " + cc.getSaldo());
		//System.out.println("Depois cc1 - " + cc1.getSaldo());

	}
	
	@Test
	void testExtratoMensal() { // falta
		cc.creditar(10f);
		cc.debitar(10f);
		assertEquals(1, cc.extratoMensal(7 + 1).length);
		//cc.extratoMensal(7);
		
		//public RegistroOperacao[] extratoMensal(int mes) {		
		//	RegistroOperacao registroAtual;
			
		//	RegistroOperacao[] extratoMes = new RegistroOperacao[100]; //  criando um novo objeto 
		//	int prox = 0;
		//	for(int k = 0; k < registros.length; k++) { //  percorri o historico de registros e no meu registro na posicao k
		//		registroAtual = registros[k];
		//		if(registroAtual.consultarMes() == mes) {  // se o meu registro em forma de mes em uma certa posicao k, for igual ao mes inserido
		//			extratoMes[prox++] = registroAtual; // o extrato do mes incrementado vai ser igual aos registros em uma certa posicao
		//		}
		//	} return extratoMes; // e tera como retorno o extrato mensal
		//}
	}

	@Test
	void testExtratoPeriodo() {// falta
		cc.creditar(10f);

		assertEquals(1, cc.extratoPeriodo(dataMes1, dataMes2).length);
		assertEquals(0, cc.extratoPeriodo(dataMes2, dataMes1).length);
		
	}
	
	
}
