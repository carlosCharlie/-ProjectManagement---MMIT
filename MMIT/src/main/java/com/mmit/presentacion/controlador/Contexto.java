package com.mmit.presentacion.controlador;

import com.mmit.presentacion.Evento;

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
	
        public void setEvento(Evento evento){
            this.evento = evento;
        }
        
	public Evento getEvento() {
		return evento;	
	}
}
