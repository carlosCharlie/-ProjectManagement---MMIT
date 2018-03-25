/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.presentacion.controlador;

import com.mmit.presentacion.Evento;

/**
 *
 * @author crash
 */
public class Contexto {
	private Object datos;
	private Evento evento;
	
	public Contexto (Evento evento, Object datos) {
		this.datos = datos;
		this.evento = evento;
	}
	
	public Object getDatos() {
		return datos;
	}
        
        public void setDatos(Object datos) {
		this.datos = datos;
	}
	
	public Evento getEvento() {
		return evento;	
	}
}
