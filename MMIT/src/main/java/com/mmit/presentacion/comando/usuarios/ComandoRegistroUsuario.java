/*
 * Copyright (C) 2018 Your Organisation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mmit.presentacion.comando.usuarios;

import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.usuarios.Login;
import com.mmit.negocio.usuarios.UsuarioTrans;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

/**
 *
 * @author dielam
 */
public class ComandoRegistroUsuario implements Comando {

    @Override
    public Contexto execute(Object datos) {
        int respuesta = FactoriaNegocio.getInstancia().crearUsuariosSA().singUpUser((UsuarioTrans) datos);
        switch(respuesta){
            case 0:
                return new Contexto(Evento.RegistroUsuario, datos);
            case -2:
                return new Contexto(Evento.ErrorUsuario, datos);
            case -1:
                return new Contexto(Evento.ErrorVacios, datos);
            case -5:
                return new Contexto(Evento.ErrorSQL, null);
            default:
                return null;
        }
        
    }
    
}
