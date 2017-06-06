package exercicio;

import java.util.ArrayList;

public class GerenteContas {
	private ArrayList<ContaCorrente> contasCorrente = new ArrayList<>();
	private ArrayList<ContaPoupanca> contasPoupanca = new ArrayList<>();
	
	public void atualizarTodasContas(){
		for (ContaCorrente run : contasCorrente) {
			run.atualizarSaldo();
		}
		for (ContaPoupanca run : contasPoupanca) {
			run.atualizarSaldo();
		}
	}
	
	public void adicionar(ContaPoupanca a){
		contasPoupanca.add(a);
	}
	public void adicionar(ContaCorrente a){
		contasCorrente.add(a);
	}
	public void removerConta(int numero){
		for (int i = 0; i < contasCorrente.size(); i++) {
			ContaCorrente confere = contasCorrente.get(i);
			if(numero == confere.getNumero())
				contasCorrente.remove(i);
		}
		for (int i = 0; i < contasPoupanca.size(); i++) {
			ContaPoupanca confere = contasPoupanca.get(i);
			if(numero == confere.getNumero())
				contasPoupanca.remove(i);
		}
		
	}
	

}
