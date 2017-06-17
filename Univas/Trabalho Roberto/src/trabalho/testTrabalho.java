package trabalho;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

public class testTrabalho {

	@Test
	public void test() {
		Medicamento m1 = new Medicamento(01, "remedio1", 10, 2);
		Medicamento m2 = new Medicamento(02, "remedio2", 10, 4);
		Medicamento m3 = new Medicamento(03, "remedio3", 10, 6);
		Estoque e1 = new Estoque();
		try {
			e1.guardar(m1);
			e1.guardar(m2);
		} catch (ProdutoRepetidoException e2) {
			System.out.println(e2.getMessage());
		}
		Pedido p1 = new Pedido(324324, e1);
		try {
			p1.addProduto("remedio1", 01, 2);
		} catch (QuantidadeInsuficienteException | MedicamentoInexistenteException e) {
			System.out.println(e.getMessage());
		}
		assertEquals(4, p1.calcPedido(), 0.01);
		try {
			p1.addProduto("remedio2", 02, 2);
		} catch (QuantidadeInsuficienteException | MedicamentoInexistenteException e) {
			System.out.println(e.getMessage());
		}

		assertEquals(2, p1.itens.size());
		
		assertEquals(12, p1.calcPedido(), 0.01);
		// fail("Not yet implemented");
	}
	
	@Test
	public void testCliente() {
		Medicamento m1 = new Medicamento(01, "remedio1", 10, 2);
		Medicamento m2 = new Medicamento(02, "remedio2", 10, 4);
		Medicamento m3 = new Medicamento(03, "remedio3", 10, 6);
		Estoque e1 = new Estoque();
		Clientes c1 = new Clientes("Diego");
		
		try {
			e1.guardar(m1);
		} catch (ProdutoRepetidoException e2) {
			System.out.println(e2.getMessage());
		}
		Pedido p1 = new Pedido(123, e1);
		Pedido p2 = new Pedido(124, e1);
		
		try {
			p1.addProduto("remedio1", 01, 2);
			p1.addProduto("remedio1", 01, 2);
		
			p2.addProduto("remedio1", 01, 2);
			
			
			
		} catch (QuantidadeInsuficienteException | MedicamentoInexistenteException e) {
				System.out.println(e.getMessage());
		}
		
		try {
			c1.addPedido(p1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			c1.addPedido(p2);
		} catch (Exception e) {
				System.out.println(e.getMessage());
		}
		assertEquals(2, c1.pedidos.size());
		c1.atualizar();
		assertEquals(12, c1.getValorGasto(),0.01);
		
		
	}
	@Test
	public void TestGerencia() {
		
		Medicamento m1 = new Medicamento(01, "remedio1", 10, 2);
		Medicamento m2 = new Medicamento(02, "remedio2", 10, 4);
		Medicamento m3 = new Medicamento(03, "remedio3", 10, 6);
		Estoque e1 = new Estoque();
		Clientes c1 = new Clientes("Diego");
		Clientes c2 = new Clientes("Julio");
		Clientes c3 = new Clientes("Luan");
		
		try {
			e1.guardar(m1);
			e1.guardar(m2);
			e1.guardar(m3);
			
		} catch (ProdutoRepetidoException e2) {
			System.out.println(e2.getMessage());
		}
		Pedido p1 = new Pedido(123, e1);
		Pedido p2 = new Pedido(124, e1);
		Pedido p3 = new Pedido(125, e1);
		Pedido p4 = new Pedido(126, e1);
		Pedido p5 = new Pedido(127, e1);
		Pedido p6 = new Pedido(128, e1);
		Pedido p7 = new Pedido(129, e1);
		
		try {
			p1.addProduto("remedio1", 01, 2); //esse try deveria ser feito para cada chamada de função
			p1.addProduto("remedio1", 01, 2);	
			p2.addProduto("remedio1", 01, 2);
			p3.addProduto("remedio2", 02, 2);
			p4.addProduto("remedio3", 03, 2);
			p5.addProduto("remedio3", 03, 2);
			p6.addProduto("remedio1", 01, 2);
			p7.addProduto("remedio3", 03, 2);
				
			
		} catch (QuantidadeInsuficienteException | MedicamentoInexistenteException e) {
				System.out.println(e.getMessage());
		}
		
		try {
			c1.addPedido(p1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			c1.addPedido(p2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(2, c1.pedidos.size());
		c1.atualizar();
		assertEquals(12, c1.getValorGasto(),0.01);
		try {
			c2.addPedido(p3);
			c2.addPedido(p5);
			c3.addPedido(p4);
			c3.addPedido(p7);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		ControleGerencia gerente = new ControleGerencia();
		gerente.adicionar(c1);
		gerente.adicionar(c2);
		gerente.adicionar(c3);
		assertEquals(3, gerente.relatorios.size());
		
		gerente.imprimirRelatorio();
		JOptionPane.showMessageDialog(null, e1.veriQuantidade());
		
		
	}

}
