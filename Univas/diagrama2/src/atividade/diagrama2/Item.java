package atividade.diagrama2;

public abstract class Item {
	private int codigo;
	private String titulo;
	protected boolean emprestado;

	
	public Item(int codigo, String titulo) {
	
		this.codigo = codigo;
		this.titulo = titulo;
		
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public abstract void emprestar();

	public String obterDadosStr() {
		return "Dados: \n" + "Codigo: " + this.codigo + "\nTítulo: " + this.titulo + "\nEmprestado: " + this.emprestado;
	}
}
