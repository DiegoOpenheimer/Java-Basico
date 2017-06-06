package br.edu.univas.lab4.si3;

import java.util.ArrayList;

public class GerenteContas {
	
	private ArrayList<Conta> contas = new ArrayList<>();
	
	
	public void adicionarConta(Conta nova) {
		contas.add(nova);
	}
	
	public void atualizarTodasContas() {
		
		for (Conta conta : contas) {
			conta.atualizarSaldo();
		}
		
		
	}

}
