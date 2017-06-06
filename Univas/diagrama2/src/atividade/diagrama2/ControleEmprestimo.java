package atividade.diagrama2;

import java.util.ArrayList;

public class ControleEmprestimo {
	private ArrayList<Item> itens = new ArrayList<>();

	public void emprestar(Item i) {
		if (i.emprestado)
			System.out.println("Já está emprestado");
		else {
			itens.add(i);
			i.emprestar();
		}

	}
	
	public String gerarRelatorio() {
		 String relatorio = "";
			for (Item run : itens) {
				relatorio += run.obterDadosStr();
				relatorio += "\n\n";
			}
		return relatorio;	
	}

	public void renovar(Renovavel i) throws RenovacaoInvalidaException {
		i.renovar();
	}
}
