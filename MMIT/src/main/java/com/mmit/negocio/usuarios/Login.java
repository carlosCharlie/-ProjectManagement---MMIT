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
package com.mmit.negocio.usuarios;



/**
 * Es una clase estatica que almacena el usuario actual de la aplicacion
 */
public class Login {
    //En la base de datos hay insertado un admin por defecto: nombre="admin" password="adminP"
    
    static private UsuarioTrans usuario;


    /**
     * Inicia una nueva sesion
     * @param usuario transfer del usuario
     */
    public static void setNuevaSesion(UsuarioTrans usuario){
        Login.usuario = usuario;
    }
    
    /**
     * Devuelve el usuario actual
     * @return 
     */
    public static UsuarioTrans getUsuario(){
        return usuario;
    }
  
}
