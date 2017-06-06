package br.edu.univas.si3.chamado;

public class Chamado {
	private int codigo;
	private String descricao;
	private int avaliacao;
	private boolean aberto = true;

	public Chamado(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public void fecharChamado() {
		this.aberto = false;
	}

	public void avaliarChamado(int novoValor) {
		this.avaliacao = novoValor;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public boolean getAberto() {
		return this.aberto;
	}

}
