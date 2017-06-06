package exercicio;

import java.util.ArrayList;

public class ContaCorrente {
	private float manutencaoMensal;
	private Conta contaBase;

	public ContaCorrente(int numero, String cliente, float manutMensal) {
		contaBase = new Conta(numero, cliente);
		this.manutencaoMensal = manutMensal;
	}

	public void atualizarSaldo() {
		float numero = contaBase.getSaldo();
		if (contaBase.getSaldo() >= this.manutencaoMensal) {
			contaBase.sacar(manutencaoMensal);
		}
		if (numero < this.manutencaoMensal)
			contaBase.sacar(contaBase.getSaldo());
	}

	public boolean sacar(float valor) {
		return contaBase.sacar(valor);
	}

	public boolean depositar(float valor) {
		return contaBase.depositar(valor);
	}

	public boolean transferirPara(Conta c, float valor) {
		return contaBase.transferirPara(c, valor);
	}

	public ArrayList<Movimento> getUltimosMovimentos(int qtd) {
		return contaBase.getUltimosMovimentos(qtd);
	}

	public float getSaldo() {
		return this.contaBase.getSaldo();
	}

	public int getNumero() {
		return this.contaBase.getNumero();
	}

	public Conta getConta() {
		return this.contaBase;
	}
}
