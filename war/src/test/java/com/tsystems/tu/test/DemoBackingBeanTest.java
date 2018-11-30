package com.tsystems.tu.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tsystems.tu.DemoBackingBean;

/**
 * Clase de test del BackingBean.
 * @author crequena
 *
 */
public class DemoBackingBeanTest {
	
	private static final int PUERTAS_1 = 5;
	private static final int PUERTAS_2 = 2;

	/**
	 * Método de prueba de un setter.
	 */
	@Test
	public void setCocheTest() {
		DemoBackingBean demoBackingBean = new DemoBackingBean();
		demoBackingBean.setPuertas1(PUERTAS_1);
		demoBackingBean.setPuertas2(PUERTAS_2);

		// Test de igualdad.
		assertEquals(demoBackingBean.getPuertas1(), PUERTAS_1);
		assertEquals(demoBackingBean.getPuertas2(), PUERTAS_2);
	}

}
