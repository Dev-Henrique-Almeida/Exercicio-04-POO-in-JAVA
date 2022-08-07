package br.com.ufape.poo;
import java.util.Date;

public class RegistroOperacao {
	private String operacao;
	private float valor;
	private Date data;
	
	public RegistroOperacao(String op, float v, Date data) {
		this.operacao = op;
		this.valor = v;
		this.data = data;
	}
	
	public String exibir() {
		return operacao + " R$ " + valor + "   " +  data;
	}
	
	@SuppressWarnings("deprecation")
	public int consultarMes() {
		return data.getMonth() + 1;
	}

	public Date getData() {
		return data;
	}


}


