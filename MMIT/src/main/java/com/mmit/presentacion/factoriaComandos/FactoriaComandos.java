package com.mmit.presentacion.factoriaComandos;

import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;

public abstract class FactoriaComandos {
	private static FactoriaComandos instancia;
	
	public static FactoriaComandos obtenerInstancia() {
		if (instancia == null){
                    instancia = new FactoriaComandosImp();
                }
                return instancia;
	}

	public abstract Comando obtenerComando(Evento evento);
}