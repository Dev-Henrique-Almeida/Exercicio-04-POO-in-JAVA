package br.com.ufape.poo;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBanco {
	private Banco b1;
	private Agencia a1, a2;
	private Cliente c1;
	
	@BeforeEach
	void setUp() throws Exception{
		b1 = new Banco("Banco do Brasil");
		Endereco endereco = new Endereco(null, null, null, null, null, null);
		a1 = new Agencia("Banco do Brasil", "1", endereco);
		a2 = new Agencia("Banco do Brasil - São Paulo", "2", endereco);
		c1 = new Cliente("Henrique", null, "123", endereco);
	}
	
	@Test
	void testCadastrarAgencia() {
		b1.cadastrarAgencia(a1);
		b1.cadastrarAgencia(a2);
		assertEquals(a1, b1.getAgencias()[0]);
	}

	@Test
	void testProcurarAgenciaNome() { // falta
		b1.cadastrarAgencia(a1);
		//Assert.assertNotNull(b1.procurarAgenciaNome("Banco do Brasil - Pernambuco"));
		assertEquals(b1.procurarAgenciaNome("Banco do Brasil"), a1);
		//System.out.println(a1);
		//System.out.println(b1.procurarAgenciaNome("Banco do Brasil"));
		
	}
	
	@Test
	void voidAdicionarCliente() {
		b1.adicionarCliente(c1);
		assertEquals(c1, b1.getClientes()[0]);
	}
}
