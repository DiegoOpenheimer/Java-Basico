package atividade.diagrama2;

public class Midia extends Item {

	private String produtora;
	public Midia(int codigo, String titulo,String prod) {
		super(codigo, titulo);
		this.produtora = prod;
	}

	
	
	@Override
	public void emprestar() {
		this.emprestado = true;
		
	}

}
