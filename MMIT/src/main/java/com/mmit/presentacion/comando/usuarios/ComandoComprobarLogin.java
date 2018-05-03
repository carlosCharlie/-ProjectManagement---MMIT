package com.mmit.presentacion.comando.usuarios;

import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.usuarios.Login;
import com.mmit.negocio.usuarios.UsuarioTrans;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoComprobarLogin implements Comando {

    @Override
    public Contexto execute(Object datos) {
	int respuesta = FactoriaNegocio.getInstancia().crearUsuariosSA().comprobarLogin((UsuarioTrans) datos);
        switch(respuesta){
            case 0:
                return new Contexto(Evento.AbrirMenuPrincipal, null);
            case -1:
                return new Contexto(Evento.ErrorUsuario, datos);
            case -2:
                return new Contexto(Evento.ErrorContrasena, datos);
            case -5:
                return new Contexto(Evento.ErrorSQL, null);
            default:
                return null;
        
    }
    }
}
