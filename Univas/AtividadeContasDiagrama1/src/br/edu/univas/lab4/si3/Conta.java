package br.edu.univas.lab4.si3;

import java.util.ArrayList;
import java.util.Date;

public abstract class Conta implements ImprimeExtrato {

	protected int numero;
	protected String nome;
	private float saldo;
	private ArrayList<Movimento> movimentos = new ArrayList<>();

	@Override
	public String gerarExtrato() {
		String str =  "Nome Cliente: " + this.nome + "\nNúmero Conta: " + this.numero + "\nSaldo: " + this.saldo;
		
		for (Movimento movimento : movimentos) {
			str += movimento.toString();
		}
		str += "\n\n\n";
		return str;
	}

	public void sacar(float valor) throws SaldoInsuficienteException {
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException("Valor Insuficente para saque\n" + "Valor atual: " + this.saldo
					+ "\nValor requerido para saque: " + valor);
		}

		this.saldo -= valor;
		setMovimentos("Saque", valor);

	}

	public void depositar(float valor) {
		this.saldo += valor;
		setMovimentos("Depósito", valor);
	}

	public void transferirPara(Conta c, float valor) throws SaldoInsuficienteException {

		if (this.saldo >= valor) {
			this.sacar(valor);
			c.depositar(valor);
			setMovimentos("Transfência", valor);
		}

	}

	private void setMovimentos(String nome, float valor) {
		Date data = new Date();
		Movimento newMovimento = new Movimento(nome, valor, data);
		movimentos.add(newMovimento);
	}

	public float getSaldo() {
		return saldo;
	}

	public abstract void atualizarSaldo();
	
	
}
