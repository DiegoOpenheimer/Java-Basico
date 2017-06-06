package br.edu.univas.si3.chamado;

import java.util.ArrayList;

public class Atendente {

	private String nome;
	private float salarioBase;
	private int horasExtras;
	private ArrayList<Chamado> chamadosAtendidos = new ArrayList<Chamado>();

	public Atendente(String nome, float salarioBase, int horasExtras) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.horasExtras = horasExtras;
	}

	public float calcularSalario() {
		return salarioBase + (salarioBase / 160) * horasExtras;
	}

	public void acrescentarHorasExtras(int qtd) {
		horasExtras += qtd;
		
	}

	public void atenderChamado(Chamado ch) {
		ch.fecharChamado();
		chamadosAtendidos.add(ch);
	}

	public ArrayList<Chamado> getChamadosAtendidos() {
		return chamadosAtendidos;
	}
}
