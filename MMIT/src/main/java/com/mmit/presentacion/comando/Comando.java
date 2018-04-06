package com.mmit.presentacion.comando;

import com.mmit.presentacion.controlador.Contexto;

public interface Comando {
	Contexto execute(Object datos);
}