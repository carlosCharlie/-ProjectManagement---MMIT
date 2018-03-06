package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public abstract class Controlador {
	private static Controlador controlador;
	
	public static Controlador getInstancia() {
		if (controlador == null) {
			controlador = new ControladorImp();
		}
		return controlador;
	}
	
	public abstract void accion(Eventos evento, String datos);
}