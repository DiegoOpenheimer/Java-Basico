package exercicio;

import java.util.ArrayList;

public class Conta {
	private int numero;
	private String cliente;
	private float saldo = 0f;
	private ArrayList<Movimento> movimentos = new ArrayList<>();

	public Conta(int numero, String cliente) {
		this.cliente = cliente;
		this.numero = numero;
	}

	public boolean sacar(float valor) {
		if (saldo >= valor) {
			saldo -= valor;
			Movimento m1 = new Movimento();
			m1.descricao = "sacar";
			m1.valor = valor;
			movimentos.add(m1);
			return true;

		}
		return false;
	}

	public boolean depositar(float valor) {
		saldo += valor;
		Movimento m1 = new Movimento();
		m1.descricao = "depositar";
		m1.valor = valor;
		movimentos.add(m1);
		return true;

	}

	public boolean transferirPara(Conta c, float valor) {
		if (this.saldo < valor) {
			return false;
		}
		Movimento m1 = new Movimento();
		m1.descricao = "transferência";
		m1.valor = valor;
		movimentos.add(m1);
		
		c.saldo += valor;
		this.saldo -= valor;
		return true;
	}

	public ArrayList<Movimento> getUltimosMovimentos(int qtd) {
		ArrayList<Movimento> run = new ArrayList<>();
		int controlador = (movimentos.size() - qtd);
		
		for (int i = 0;i < movimentos.size();i++) {
			if(i < controlador)
				continue;
			else
			{
				run.add(movimentos.get(i));
			}
		}
		
		
		return run;
	}
	
	public float getSaldo(){
		return this.saldo;
	}
	
	public int getNumero(){
		return this.numero;
	}

}
