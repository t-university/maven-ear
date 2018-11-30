package com.tsystems.tu.negocio.objetos;

/**
 * Clase de vehículo Motocicleta.
 * @author krequena
 *
 */
public class Motocicleta extends AbstractVehiculo {

	// Constantes.
	private final static int PUERTAS_MOTOCICLETA = 0;
	private final static int RUEDAS_MOTOCICLETA = 2;
	
	/**
	 * Constructor.
	 */
	public Motocicleta() {
		super.setPuertas(Motocicleta.PUERTAS_MOTOCICLETA);
		super.setRuedas(Motocicleta.RUEDAS_MOTOCICLETA);
	}

}
