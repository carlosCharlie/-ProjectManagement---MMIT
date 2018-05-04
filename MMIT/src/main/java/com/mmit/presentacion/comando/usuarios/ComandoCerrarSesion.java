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
        int respuesta = FactoriaNegocio.getInstancia().crearBracketSA().crearBracket(Login.getBracket(), Login.getUsuario().getId());
        switch (respuesta){
            case 0:
                Login.cerrarSesion();
                return new Contexto(Evento.CerrarSesion, null);
            case -5:
                return new Contexto(Evento.ErrorSQL, null);
            default:
                return null;
        }       
	
    }
}
