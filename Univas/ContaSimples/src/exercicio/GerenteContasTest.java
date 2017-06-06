package exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteContasTest {

	@Test
	public void test() {
		ContaCorrente cc = new ContaCorrente(01, "Diego", 11);
		ContaPoupanca cp = new ContaPoupanca(01, "Diego", 1);
		
		
		cc.depositar(200);
		
		cc.transferirPara(cp.getConta(), 100);
		assertEquals(100,cc.getSaldo(),0.01);
		assertEquals(2,cc.getUltimosMovimentos(20).size());
		cp.transferir(cc.getConta(), 50);
		assertEquals(1,cp.getUltimosMovimentos(20).size());
		
		
		//fail("Not yet implemented");
	}

}
