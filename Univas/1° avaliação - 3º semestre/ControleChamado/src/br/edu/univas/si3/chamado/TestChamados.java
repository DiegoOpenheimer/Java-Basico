package br.edu.univas.si3.chamado;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestChamados {

	@Test
	public void test01() { // Estrutura básica do Chamado
		Chamado ch1 = new Chamado(1, "ch 1");
		ch1.fecharChamado();
		ch1.getAvaliacao();
		ch1.getCodigo();
		ch1.getAberto();
	}

	@Test
	public void test02() { // Estrutura básica do Atendente
		Atendente at1 = new Atendente("At 1", 1600, 2);
		at1.acrescentarHorasExtras(2);
		Chamado ch1 = new Chamado(1, "ch 1");
		at1.atenderChamado(ch1);
		at1.calcularSalario();
	}

	@Test
	public void test03() { // Estrutura básica do Gerente
		Gerente g1 = new Gerente("Ge1", 2000, 200);
		g1.aumentarComissao(10);
		g1.reduzirComissao(10);
		g1.calcularSalario();
	}

	@Test
	public void test04() { // Estrutura básica do Departamento
		Gerente g1 = new Gerente("Ge1", 2000, 200);
		Gerente g2 = new Gerente("Ge2", 5000, 500);
		Atendente at1 = new Atendente("At 1", 1600, 2);

		Departamento d1 = new Departamento(g1);
		d1.adicionarAtendente(at1);
		d1.calcularAvaliacaoMedia();
		d1.calcularSalarioTotal();
		d1.trocarGerente(g2);
	}

	@Test
	public void test05() { // Estrutura básica do ControdeChamados
		ControleChamados cc1 = new ControleChamados();
		Chamado ch1 = new Chamado(1, "ch 1");
		Atendente at1 = new Atendente("At 1", 1600, 2);

		cc1.atenderChamado(at1, ch1);
		cc1.getChamadosAbertos();
		cc1.getTodosChamados();
	}

	@Test
	public void test06() { // teste dos construtores (parte 1)
		Chamado ch1 = new Chamado(1, "ch 1");
		Gerente g1 = new Gerente("Ge1", 2000, 200);
		Departamento d1 = new Departamento(g1);

		assertEquals(1, ch1.getCodigo());
		assertEquals(0, ch1.getAvaliacao());
		assertTrue(ch1.getAberto());
		assertNotNull(d1.getGerente());
	}

	@Test
	public void test07() { // teste dos construtores (parte 2)
		Atendente at1 = new Atendente("At 1", 1600, 2);
		ControleChamados cc1 = new ControleChamados();

		assertNotNull(at1.getChamadosAtendidos());
		assertNotNull(cc1.getTodosChamados());
	}

	// teste na classe Atendente
	@Test
	public void test08() { // calcularSalario
		Atendente at1 = new Atendente("At 1", 1600, 2);
		assertEquals(1620, at1.calcularSalario(), 0.01);

		Atendente at2 = new Atendente("At 2", 1000, 0);
		assertEquals(1000, at2.calcularSalario(), 0.01);
	}

	@Test
	public void test09() { // acrescentarHorasExtras
		Atendente at1 = new Atendente("At 1", 1600, 2);
		at1.acrescentarHorasExtras(2);
		assertEquals(1640, at1.calcularSalario(), 0.01);
		at1.acrescentarHorasExtras(3);
		assertEquals(1670, at1.calcularSalario(), 0.01);
	}

	@Test
	public void test10() { // atenderChamado
		Atendente at1 = new Atendente("At 1", 1600, 2);
		Chamado ch1 = new Chamado(1, "ch 1");
		Chamado ch2 = new Chamado(2, "ch 2");
		assertEquals(0, at1.getChamadosAtendidos().size());
		at1.atenderChamado(ch1);
		assertEquals(1, at1.getChamadosAtendidos().size());
		at1.atenderChamado(ch2);
		assertEquals(2, at1.getChamadosAtendidos().size());
	}

	// teste na classe Chamado
	@Test
	public void test11() { // fecharChamado
		Chamado ch1 = new Chamado(1, "ch 1");
		assertTrue(ch1.getAberto());
		ch1.fecharChamado();
		assertFalse(ch1.getAberto());
		ch1.fecharChamado();
		assertFalse(ch1.getAberto());
	}

	@Test
	public void test12() { // avaliarChamado
		Chamado ch1 = new Chamado(1, "ch 1");
		assertEquals(0, ch1.getAvaliacao());
		ch1.avaliarChamado(3);
		assertEquals(3, ch1.getAvaliacao());
	}

	// teste na classe ControleChamados
	@Test
	public void test13() { // adicionarChamado
		Chamado ch1 = new Chamado(1, "ch 1");
		Chamado ch2 = new Chamado(2, "ch 2");
		ControleChamados cc1 = new ControleChamados();

		assertEquals(0, cc1.getTodosChamados().size());
		cc1.adicionarChamado(ch1);
		assertEquals(1, cc1.getTodosChamados().size());
		cc1.adicionarChamado(ch2);
		assertEquals(2, cc1.getTodosChamados().size());
	}

	@Test
	public void test14() { // atenderChamado
		Chamado ch1 = new Chamado(1, "ch 1");
		Chamado ch2 = new Chamado(2, "ch 2");
		Chamado ch3 = new Chamado(3, "ch 3");
		Atendente at1 = new Atendente("At 1", 1600, 2);
		Atendente at2 = new Atendente("At 2", 3200, 0);
		ControleChamados cc1 = new ControleChamados();

		cc1.atenderChamado(at1, ch1);
		assertEquals(1, cc1.getTodosChamados().size());
		assertEquals(1, at1.getChamadosAtendidos().size());
		assertEquals(1, at1.getChamadosAtendidos().get(0).getCodigo());

		cc1.atenderChamado(at1, ch2);
		assertEquals(2, cc1.getTodosChamados().size());
		assertEquals(2, at1.getChamadosAtendidos().size());
		assertEquals(2, at1.getChamadosAtendidos().get(1).getCodigo());

		cc1.atenderChamado(at2, ch3);
		assertEquals(3, cc1.getTodosChamados().size());
		assertEquals(1, at2.getChamadosAtendidos().size());
		assertEquals(3, at2.getChamadosAtendidos().get(0).getCodigo());
	}

	@Test
	public void test15() { // getChamadosAbertos
		Chamado ch1 = new Chamado(1, "ch 1");
		Chamado ch2 = new Chamado(2, "ch 2");
		Chamado ch3 = new Chamado(3, "ch 3");
		ControleChamados cc1 = new ControleChamados();

		assertEquals(0, cc1.getChamadosAbertos().size());
		cc1.adicionarChamado(ch1);
		assertEquals(1, cc1.getChamadosAbertos().size());
		cc1.adicionarChamado(ch2);
		assertEquals(2, cc1.getChamadosAbertos().size());
		cc1.adicionarChamado(ch3);
		assertEquals(3, cc1.getChamadosAbertos().size());

		ch1.fecharChamado();
		assertEquals(2, cc1.getChamadosAbertos().size());
		ch3.fecharChamado();
		assertEquals(1, cc1.getChamadosAbertos().size());
	}

	// teste na classe Departamento
	@Test
	public void test16() { // adicionarAtendente
		Atendente at1 = new Atendente("At 1", 1600, 2);
		Atendente at2 = new Atendente("At 2", 3200, 0);
		Gerente g1 = new Gerente("Ge1", 2000, 200);
		Departamento d1 = new Departamento(g1);
		
		assertEquals(0, d1.getAtendentes().size());
		d1.adicionarAtendente(at1);
		assertEquals(1, d1.getAtendentes().size());
		d1.adicionarAtendente(at2);
		assertEquals(2, d1.getAtendentes().size());
	}

	@Test
	public void test17() { // trocarGerente
		Gerente g1 = new Gerente("Ge1", 2000, 200);
		Gerente g2 = new Gerente("Ge2", 3000, 300);
		Departamento d1 = new Departamento(g1);
		
		assertNotNull(d1.getGerente());
		assertEquals(g1, d1.getGerente());
		d1.trocarGerente(g2);
		assertEquals(g2, d1.getGerente());
	}

	@Test
	public void test18() { // calcularSalarioTotal
		Atendente at1 = new Atendente("At 1", 1600, 2);
		Gerente g1 = new Gerente("Ge1", 2000, 200);
		Departamento d1 = new Departamento(g1);

		assertEquals(2200, d1.calcularSalarioTotal(), 0.01);
		d1.adicionarAtendente(at1);
		assertEquals(3820, d1.calcularSalarioTotal(), 0.01);
	}

	@Test
	public void test19() { // calcularAvaliacaoMedia
		Atendente at1 = new Atendente("At 1", 1600, 2);
		Atendente at2 = new Atendente("At 2", 3200, 0);
		Chamado ch1 = new Chamado(1, "ch 1");
		Chamado ch2 = new Chamado(2, "ch 2");
		Chamado ch3 = new Chamado(3, "ch 3");

		Gerente g1 = new Gerente("Ge1", 2000, 200);
		Departamento d1 = new Departamento(g1);
		
		d1.adicionarAtendente(at1);
		assertEquals(0, d1.calcularAvaliacaoMedia(), 0.01);
		at1.atenderChamado(ch1);
		ch1.avaliarChamado(4);
		assertEquals(4, d1.calcularAvaliacaoMedia(), 0.01);

		at1.atenderChamado(ch2);
		ch2.avaliarChamado(8);
		assertEquals(6, d1.calcularAvaliacaoMedia(), 0.01);

		d1.adicionarAtendente(at2);
		at2.atenderChamado(ch3);
		ch3.avaliarChamado(3);
		assertEquals(5, d1.calcularAvaliacaoMedia(), 0.01);
	}

	// teste na classe Gerente
	@Test
	public void test20() { // aumentarComissao e reduzirComissao
		Gerente g1 = new Gerente("Ge1", 2000, 200);
		g1.aumentarComissao(100);
		assertEquals(2300, g1.calcularSalario(), 0.01);
		g1.aumentarComissao(200);
		assertEquals(2500, g1.calcularSalario(), 0.01);

		g1.reduzirComissao(100);
		assertEquals(2400, g1.calcularSalario(), 0.01);
		g1.reduzirComissao(100);
		assertEquals(2300, g1.calcularSalario(), 0.01);
	}
}
