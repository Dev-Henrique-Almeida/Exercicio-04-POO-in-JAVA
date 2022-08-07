package br.com.ufape.poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

public class Sistema {

	public static void main(String[] args) throws ParseException {
		
		String dtNasicmentoGerente = "17/07/1977";
		String dtNasicmentoCaixa = "05/03/1989";
		String dtNascimentoSeguranca = "05/07/1988";

		
		Endereco enderecoGerente = new Endereco("Estrada Deputado José Rui da Silveira Lino", "300", "69911-108", "Aeroporto Velho", "Rio Branco", 
				"AC");
		Endereco enderecoCaixa = new Endereco("Rua das Gaivotas", "417", "78121-163", "Parque do Lago", "Várzea Grande", "MT");
		
		Endereco enderecoSeguranca = new Endereco("Rua Sete de Junho 150", "851", "29102-922", "Coqueiral de Itaparica", "Vila Velha", "ES");

		
	     Funcionario gerente = new Gerente("Flávia Isis Fátima Moreira", new Date(dtNasicmentoGerente), 100f, "762.663.615-58", 
	    		 enderecoGerente);
	     Funcionario caixa = new Caixa("Diego Miguel Silva", new Date(dtNasicmentoCaixa), 100f, "006.624.672-56",
	    		 enderecoGerente);
	     Funcionario seguranca = new Seguranca("Clara Mirella Luzia Nascimento", new Date(dtNascimentoSeguranca), 100f, "546.404.043-95", enderecoSeguranca, false);
	     
	     Cliente c1 = new Cliente(gerente.getNome(), gerente.getNascimento(), gerente.getCpf(), gerente.getEndereco());
	     Cliente c2 = new Cliente(caixa.getNome(), caixa.getNascimento(), caixa.getCpf(), caixa.getEndereco());
	     Cliente c3 = new Cliente(seguranca.getNome(), seguranca.getNascimento(), seguranca.getCpf(), seguranca.getEndereco());
	     
	     
	     
	     gerente.setSalario(18599.25f);
	     caixa.setSalario(1525.00f);
	     seguranca.setSalario(2453.25f);
	     
	     ContaCorrente cc1 = new ContaCorrente("281431-5", 1850.58f, true); 
	     ContaCorrente cc2 = new ContaCorrente("281431-5", 1000f, true); 
	     
	     Banco banco = new Banco("Banco do Brasil");
	     Agencia agencia = new Agencia("Banco do Brasil - Rio Branco", "281431-56", enderecoGerente);
	     
	     agencia.adicionarFuncionario(gerente);
	     agencia.adicionarFuncionario(caixa);
	     agencia.adicionarFuncionario(seguranca);
	     
	     banco.cadastrarAgencia(agencia);
	     
	     Titularidade titularidadeCliente1 = new Titularidade(cc1, c1);
	     Titularidade titularidadeCliente2 = new Titularidade(cc1, c1);
	     
	     Titularidade titularidadeCliente3 = new Titularidade(cc2, c1);
	   
	     // Valor incial de cc1 antes de creditar o valor
	     System.out.println(titularidadeCliente1.getConta().getSaldo());
	     
	     // Creditou o valor em cc1
	     titularidadeCliente1.getConta().creditar(150.25f);
	     
	     System.out.println(titularidadeCliente1.getConta().getSaldo());
	     
	     // debitou o valor de cc1
	     titularidadeCliente1.getConta().debitar(550.25f);
	     System.out.println(titularidadeCliente2.getConta().getSaldo());
	     
	     // Valor inicial de cc2 antes de receber uma transferência
	     System.out.println(titularidadeCliente3.getConta().getSaldo());
	     
	     // Valor de cc2 depois de receber uma transferência de cc1 de 1000 reais
	     titularidadeCliente2.getConta().transferir(1000, cc2);
	     System.out.println(titularidadeCliente3.getConta().getSaldo());
	     
	     // Valor que restou de cc1 apos ter transferido 1000 reais para cc2
	     System.out.println(titularidadeCliente2.getConta().getSaldo());
	     
	     
	}
}
