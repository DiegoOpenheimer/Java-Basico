package atividade.diagrama2;

public class Livro extends Item implements Renovavel {

	private int qtdRenovacoes;
	private String autor;

	public Livro(int codigo, String titulo, String autor) {
		super(codigo, titulo);
		this.autor = autor;

	}

	@Override
	public String obterDadosStr() {
		String str = "";
		str += super.obterDadosStr();
		str += "\nAuto: " + this.autor + "\nQtdRenovacoes: " + this.qtdRenovacoes;
		return str;
	}

	@Override
	public void renovar() throws RenovacaoInvalidaException {
		if (this.qtdRenovacoes > 2) {
			throw new RenovacaoInvalidaException("Número máximo de renovações");
		}

		this.qtdRenovacoes++;

	}

	@Override
	public void emprestar() {
		this.emprestado = true;
		this.qtdRenovacoes = 0;

	}

}
