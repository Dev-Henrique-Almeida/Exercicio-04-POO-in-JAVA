package br.com.ufape.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFuncionario {
	private Caixa caixa;
	
	
	@BeforeEach
	void setUp() throws Exception{
		
		Endereco endereco = new Endereco(null, null, null, null, null, null);
		caixa = new Caixa("Henrique", null, 100f, "123", endereco);
	}
	
	@Test
	void testFuncionario() {
		//System.out.println(caixa.getSalario());
		caixa.reajustarSalario(10);
		//System.out.println(caixa.getSalario());
		
		//a.adicionarFuncionario(caixa);		
		//System.out.println(a.getFuncionarios()[0].getSalario());
		//a.getFuncionarios()[0].reajustarSalario(10f);
		//System.out.println(a.getFuncionarios()[0].getSalario());
		
		
		//public void reajustarSalario(float taxa) {
		//	float novoSalario = getSalario() + taxa;
		//	this.setSalario(novoSalario);
		
	}

}
