package br.edu.univas.si3.chamado;

public class Gerente {

	private String nome;
	private float salarioBase;
	private float valorDaComissao;

	public Gerente(String nome, float salarioBase, float valorDaComissao) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.valorDaComissao = valorDaComissao;
	}

	public float calcularSalario() {
		return salarioBase + valorDaComissao;
	}

	public void aumentarComissao(int valorDeAumento) {
		this.valorDaComissao += valorDeAumento;
	}

	public void reduzirComissao(int valorDeReducao) {
		this.valorDaComissao -= valorDeReducao;
	}
}
