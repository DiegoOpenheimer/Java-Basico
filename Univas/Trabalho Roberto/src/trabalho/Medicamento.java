package trabalho;

public class Medicamento {

	private int codigo;
	private String nome;
	private int qtd;
	private float preco;

	public Medicamento(int codigo, String nome, int qtd, float preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}

	public void reduzirQuantidade(int quantidade) throws QuantidadeInsuficienteException {

		if (this.qtd < quantidade) {
			throw new QuantidadeInsuficienteException("Quantidade Insuciente\n" + "Quantidade Estoque: " + this.qtd
					+ "\nQuantidade para retirar: " + quantidade);
		}

		this.qtd -= quantidade;

	}

	public void aumentarQuantidade(int quantidade) {
		this.qtd += quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getQtd() {
		return qtd;
	}

	public float getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Medicamento [codigo=" + codigo + ", nome=" + nome + ", qtd=" + qtd + ", preco=" + preco + "]\n\n";
	}

}
