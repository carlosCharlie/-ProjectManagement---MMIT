package com.mmit.presentacion.comando.usuarios;

import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.usuarios.Login;
import com.mmit.negocio.usuarios.UsuarioTrans;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoRegistroUsuario implements Comando {

    @Override
    public Contexto execute(Object datos) {
        int respuesta = FactoriaNegocio.getInstancia().crearUsuariosSA().singUpUser((UsuarioTrans) datos);
        switch(respuesta){
            case 0:
                return new Contexto(Evento.RegistroUsuario, datos);
            case -1:
                return new Contexto(Evento.ErrorUsuarioDuplicado, datos);
            case -5:
                return new Contexto(Evento.ErrorSQL, null);
            default:
                return null;
        }
        
    }
    
}
