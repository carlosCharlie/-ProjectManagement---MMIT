package com.mmit.presentacion.controlador;

import javafx.concurrent.Task;

public abstract class Controlador{
	private static Controlador instancia;

	public static Controlador obtenerInstancia() {
		if (instancia == null) {
			instancia = new ControladorImp();
		}

		return instancia;
	}

	public abstract void accion(Contexto contexto);
}