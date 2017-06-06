package exercicio;

import java.util.ArrayList;

public class ContaPoupanca {
	private float taxaDeJuros;
	private Conta contaBase;

	public ContaPoupanca(int numero, String cliente, float taxaJuros) {
		contaBase = new Conta(numero, cliente);
		this.taxaDeJuros = taxaJuros;
	}

	public void atualizarSaldo() {
		float ganho;
		ganho = contaBase.getSaldo() + (contaBase.getSaldo() * this.taxaDeJuros);
		contaBase.depositar(ganho);
	}

	public boolean sacar(float valor) {
		return contaBase.sacar(valor);
	}

	public boolean depositar(float valor) {
		return this.contaBase.depositar(valor);
	}

	public boolean transferir(Conta c, float valor) {
		return this.contaBase.transferirPara(c, valor);
	}

	public ArrayList<Movimento> getUltimosMovimentos(int qtd) {
		return this.contaBase.getUltimosMovimentos(qtd);
	}

	public float getSaldo() {
		return this.contaBase.getSaldo();
	}

	public int getNumero() {
		return this.contaBase.getNumero();
	}
	
	public Conta getConta(){
		return this.contaBase;
	}
}
