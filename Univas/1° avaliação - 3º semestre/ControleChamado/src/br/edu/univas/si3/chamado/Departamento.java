package br.edu.univas.si3.chamado;

import java.util.ArrayList;

import sun.text.resources.cldr.chr.FormatData_chr;

public class Departamento {

	private Gerente gerente;
	private ArrayList<Atendente> atendentes = new ArrayList<Atendente>();

	public Departamento(Gerente gerente) {
		this.gerente = gerente;
	}

	public void adicionarAtendente(Atendente at) {
		atendentes.add(at);
	}

	public void trocarGerente(Gerente novoGerente) {
		this.gerente = novoGerente;
	}

	public float calcularAvaliacaoMedia() {
		float soma = 0f;
		int qtd = 0;
		for (Atendente atendente : atendentes) {
			for (Chamado chamado : atendente.getChamadosAtendidos()) {
				soma += chamado.getAvaliacao();
				qtd++;
			}

		}
		if (qtd == 0)
			return 0;
		return soma / qtd;
	}

	public float calcularSalarioTotal() {
		float salaAt = 0f;
		for (Atendente atendente : atendentes) {
			salaAt += atendente.calcularSalario();
		}
		return salaAt + this.gerente.calcularSalario();
	}

	public Gerente getGerente() {
		return gerente;
	}

	public ArrayList<Atendente> getAtendentes() {
		return atendentes;
	}
}
