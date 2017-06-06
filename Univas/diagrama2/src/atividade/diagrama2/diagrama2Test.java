package atividade.diagrama2;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

public class diagrama2Test {

	@Test
	public void test() {
		Livro l1 = new Livro(01, "hehe", "DIEGO");
		Livro l2 = new Livro(02, "ahah", "Alves");
		ControleEmprestimo em = new ControleEmprestimo();

		em.emprestar(l1);
		em.emprestar(l2);
		for(int i = 0;i < 3;i++){
		try {
			em.renovar(l1);
		} catch (RenovacaoInvalidaException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
	
		JOptionPane.showMessageDialog(null, em.gerarRelatorio());
	
	
	}

}
