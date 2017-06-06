package br.edu.univas.lab4.si3;

import java.util.Date;

public class Movimento {
	private String descricao;
	private float valor;
	private Date data;

	public Movimento(String descricao, float valor, Date data) {

		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}

	@Override
	public String toString() {
		return "\nMovimento [descricao=" + descricao + ", valor=" + valor + ", data=" + data + "]";
	}

}
