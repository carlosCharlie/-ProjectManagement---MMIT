/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.presentacion.controlador;

/**
 *
 * @author crash
 */

public abstract class Controlador {
	private static Controlador instancia;

	public static Controlador obtenerInstancia() {
		if (instancia == null) {
			instancia = new ControladorImp();
		}

		return instancia;
	}

	public abstract void accion(Contexto contexto);
}