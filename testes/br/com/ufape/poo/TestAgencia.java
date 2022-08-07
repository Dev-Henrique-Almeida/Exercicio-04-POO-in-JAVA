package br.com.ufape.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAgencia {
	private Agencia a;
	private ContaCorrente cc;
	private Caixa caixa;
	
	@BeforeEach
	void setUp() throws Exception{
		String nome = " Bradesco";
		String numeroA = " 51";
		Endereco endereco = new Endereco(null, null, null, null, null, null);
		a = new Agencia(nome, numeroA, endereco);
		
		String numero = "1000";
		float saldo = 0;
		boolean ativo = true;
		
		cc = new ContaCorrente(numero, saldo, ativo);
		
		caixa = new Caixa("Henrique", null, 100, "123", endereco);
	}
	
	
	@Test
	void testAdicionarConta() {
		a.adicionarConta(cc);
		assertEquals(cc, a.getContas()[0]);
		
		
	}
	
	@Test
	void testProcurarConta() {
		
		a.adicionarConta(cc);
		Assert.assertNotNull(a.procurarConta("1000"));
		assertEquals(cc, a.procurarConta("1000"));

	}
	
	@Test
	void testAdicionarFuncionario() {
		a.adicionarFuncionario(caixa);
		assertEquals(caixa, a.getFuncionarios()[0]);

	}

}
