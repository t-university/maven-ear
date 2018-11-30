package com.tsystems.tu.negocio.objetos;

/**
 * Clase abstracta de vehículos.
 * 
 * @author krequena
 *
 */
public abstract class AbstractVehiculo {

	private int ruedas;
	private int puertas;

	/**
	 * @return the ruedas
	 */
	public final int getRuedas() {
		return ruedas;
	}

	/**
	 * @param ruedas the ruedas to set
	 */
	public final void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	/**
	 * @return the puertas
	 */
	public final int getPuertas() {
		return puertas;
	}

	/**
	 * @param puertas the puertas to set
	 */
	public final void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
}
