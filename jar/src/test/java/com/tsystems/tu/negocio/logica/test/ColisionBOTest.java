package com.tsystems.tu.negocio.logica.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tsystems.tu.negocio.logica.ColisionBO;
import com.tsystems.tu.negocio.objetos.AbstractVehiculo;
import com.tsystems.tu.negocio.objetos.Coche;
import com.tsystems.tu.negocio.objetos.Motocicleta;

/**
 * Clase de test de la clase ColisionBO.
 * @author krequena
 *
 */
public class ColisionBOTest {

	// Objeto de negocio a testear.
	public ColisionBO colisionBO;

	/**
	 * Método de inicialización.
	 */
	@Before
	public void inicializacion() {
		// Creación de datos de test.
		AbstractVehiculo coche1 = new Coche(5);
		AbstractVehiculo coche2 = new Coche(2);
		AbstractVehiculo motocicleta1 = new Motocicleta();
		AbstractVehiculo motocicleta2 = new Motocicleta();
		List<AbstractVehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(coche1);
		vehiculos.add(coche2);
		vehiculos.add(motocicleta1);
		vehiculos.add(motocicleta2);

		// Inicialización de clase de negocio.
		this.colisionBO = new ColisionBO(vehiculos);
	}

	/**
	 * Método de destrucción.
	 */
	@After
	public void destruccion() {
		this.colisionBO = null;
	}

	/**
	 * Método de test de la operación getPuertas().
	 */
	@Test
	public void testGetPuertas() {
		assertEquals(7, this.colisionBO.contarPuertas());
	}

	/**
	 * Método de test de la operación getRuedas().
	 */
	@Test
	public void testGetRuedas() {
		assertEquals(12, this.colisionBO.contarRuedas());
	}
}
