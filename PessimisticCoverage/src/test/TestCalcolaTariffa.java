package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import logic.CalcolaTariffa;
import logic.Controllore;

public class TestCalcolaTariffa {
	@Test
	public void testCalcola() {
		CalcolaTariffa ct=new CalcolaTariffa();
		ct.setTariffa(20);
		Controllore ctrl=new Controllore();
		ctrl.setGiorni();
		int prezzo=ct.calcola();
		assertEquals(100,prezzo);		
	}
}
