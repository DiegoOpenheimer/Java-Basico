package br.edu.univas.si3.chamado;

import java.util.ArrayList;

public class ControleChamados {

	private ArrayList<Chamado> todosChamados = new ArrayList<Chamado>();

	public void adicionarChamado(Chamado ch) {
		todosChamados.add(ch);
	}

	public void atenderChamado(Atendente at, Chamado ch) {
		at.atenderChamado(ch);
		todosChamados.add(ch);
	}

	public ArrayList<Chamado> getTodosChamados() {
		return todosChamados;
	}

	public ArrayList<Chamado> getChamadosAbertos() {
		ArrayList<Chamado> abertos = new ArrayList<>();
		for (Chamado chamado : todosChamados) {
			if (chamado.getAberto())
				abertos.add(chamado);
		}
		return abertos;
	}

}
