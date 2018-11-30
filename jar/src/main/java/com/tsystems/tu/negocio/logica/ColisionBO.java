package com.tsystems.tu.negocio.logica;

import java.util.List;

import com.tsystems.tu.negocio.objetos.AbstractVehiculo;

/**
 * Clase de negocio de gestión de colisiones.
 * 
 * @author krequena
 *
 */
public class ColisionBO {

	private List<AbstractVehiculo> implicados;

	/**
	 * Constructor de la clase de negocio.
	 * 
	 * @param implicados Lista de vehículos implicados.
	 */
	public ColisionBO(final List<AbstractVehiculo> implicados) {
		this.implicados = implicados;
	}

	/**
	 * Método que obtiene la cantidad total de ruedas de los vehículos implicados en
	 * una colisión.
	 * 
	 * @return Cantidad de ruedas.
	 */
	public int contarRuedas() {
		// Acumulador.
		int ruedas = 0;

		// Precondición.
		if (this.implicados != null) {
			// Iteración de conteo.
			for (AbstractVehiculo implicado : implicados) {
				ruedas = ruedas + implicado.getRuedas();
			}
		}

		return ruedas;
	}

	/**
	 * Método que obtiene la cantidad total de puertas de los vehículos implicados
	 * en una colisión.
	 * 
	 * @return Cantidad de puertas.
	 */
	public int contarPuertas() {
		// Precondición.
		if (this.implicados != null) {
			return this.implicados.stream().mapToInt(implicado -> implicado.getPuertas()).sum();
		} else {
			return 0;
		}
	}

}
