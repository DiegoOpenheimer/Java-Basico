package trabalho;

import java.util.ArrayList;

public class ControleGerencia {
	
	ArrayList<Relatorio> relatorios = new ArrayList<>();
	
	public void adicionar(Relatorio relatorio) {
		relatorios.add(relatorio);
	}

	public void imprimirRelatorio() {
		for (Relatorio relatorio : relatorios) {
			System.out.println(relatorio.gerarRelatorio());
		}
	}
}
