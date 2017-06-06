package br.edu.univas.lab4.si3;

public class ContaPoupanca extends Conta{
	private float taxaDeJuros;
	
	@Override
	public void atualizarSaldo(){
		
		this.depositar((super.getSaldo() * this.taxaDeJuros) + super.getSaldo());
		
	}
}
