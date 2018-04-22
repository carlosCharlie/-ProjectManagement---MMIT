package com.mmit.presentacion.comando.usuarios;

import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.usuarios.Login;
import com.mmit.negocio.usuarios.UsuarioTrans;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoCerrarSesion implements Comando {

    @Override
    public Contexto execute(Object datos) {
	return new Contexto(Evento.CerrarSesion, null);
    }
}
