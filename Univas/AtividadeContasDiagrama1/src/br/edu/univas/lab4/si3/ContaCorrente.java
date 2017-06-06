package br.edu.univas.lab4.si3;

public class ContaCorrente extends Conta {

	private float manutencaoPorMes;

	@Override
	public void atualizarSaldo() {
		try {
			this.sacar(super.getSaldo() - this.manutencaoPorMes);
		} catch (SaldoInsuficienteException ex) {
			try {
				this.sacar(super.getSaldo());
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
		}
	}
}
