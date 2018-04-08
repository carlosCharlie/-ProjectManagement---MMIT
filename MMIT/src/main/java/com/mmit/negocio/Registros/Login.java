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
package com.mmit.negocio.Registros;

/**
 *
 * @author carlos
 */
public class Login {
    //En la base de datos hay insertado un admin por defecto: nombre="admin" password="adminP"
    
    
    static private String nombre="user";
    static private String password="user";
    static private Permisos permiso=Permisos.user;

    /**
     * Devuelve el permiso de la sesion actual
     * @return permiso actual
     */
    public static Permisos getPermiso() {
        return permiso;
    }
    
    /**
     * Indica si la sesion actual tiene permisos de administrador 
     * @return true si es administrador, false si no
     */
    public static boolean EsAdmin(){
        return permiso==Permisos.admin;
    }
    
    /**
     * Devuelve el nombre de la sesion actual
     * @return nombre
     */
    public static String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la password de la sesion actual
     * @return password
     */
    public static String getPassword() {
        return password;
    }
    
    /**
     * Finaliza la sesion y vuelve a la sesion por defecto
     */
    static public void salirSesion(){
        nombre="user";
        password="user";
        permiso=Permisos.user;
    }
    
    /**
     * Inicia una nueva sesion, en caso de que no se pueda, se iniciara como un usuario normal
     * @param nombre nombre de la sesion
     * @param password password
     * @return True si se ha podido iniciar, False si no
     */
    static public boolean iniciarSesion(String nombre,String password){
    
        SesionQuery sq = new SesionQuery();

        Permisos p=sq.comprobar(nombre, password);
        
        if(p!=null){
            Login.nombre=nombre;
            Login.password=password;
            Login.permiso=p;
            return true;
        }
        else{
            //Si no se ha podido registrar, sigue como un usuario normal
            Login.nombre="user";
            Login.password="user";
            permiso=Permisos.user;
            return false;
        }
    };
    
}
