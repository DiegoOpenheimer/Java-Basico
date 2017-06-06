package br.edu.univas.lab4.si3;

import java.util.ArrayList;

public class Impressora {
	
	private ArrayList<ImprimeExtrato> itens = new ArrayList<>();
	
	public void enfileirar(ImprimeExtrato aux) {
		itens.add(aux);
	}
	
	public String gerarRelatorio() {
		String imprime = null;
		for (ImprimeExtrato imprimeExtrato : itens) {
			imprime += imprimeExtrato.gerarExtrato();
		}
		return imprime;
	}

}
