package trabalho;

import java.util.ArrayList;

public class Pedido {

	private int codigo;
	private float precoTotal;
	ArrayList<Medicamento> itens = new ArrayList<>();
	private Estoque estoque;
	private boolean status = false;

	public Pedido(int codigo, Estoque estoque) {
		this.codigo = codigo;
		this.estoque = estoque;
	}

	public void addProduto(String nome, int cod, int qtd)
			throws QuantidadeInsuficienteException, MedicamentoInexistenteException {
		float preco = estoque.retirar(nome, cod, qtd);
	
		Medicamento novo = new Medicamento(cod, nome, qtd, preco);
		itens.add(novo);
	}

	public float calcPedido() {
		float preco = 0f;

		for (Medicamento medicamento : itens) {
			preco += (medicamento.getPreco() * medicamento.getQtd());

		}

		this.precoTotal = preco;
		return preco;
	}

	public float getValorTotal() {
		return this.precoTotal;
	}

	public String relatorioPedido() {
		String rel = "";

		for (Medicamento medicamento : itens) {
			rel += medicamento.toString();
		}
		return rel;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean verdadeiro) {
		this.status = verdadeiro;
	}
}
