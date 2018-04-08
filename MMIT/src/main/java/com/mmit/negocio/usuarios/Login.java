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
 *
 * @author carlos
 */
public class Login {
    //En la base de datos hay insertado un admin por defecto: nombre="admin" password="adminP"
    
    
    static private String nombre="user";
    static private String password="user";
    static private boolean admin=false;
    static private Integer id;

    /**
     * Inicia una nueva sesion
     * @param nombre nombre del usuario
     * @param password password del usuario
     * @param permiso permisos del usuario
     */
    public static void setNuevaSesion(int id,String nombre,String password,boolean admin)
    {
        Login.id=id;
        Login.nombre=nombre;
        Login.password=password;
        Login.admin=admin;
    }
    
    /**
     * Pone la sesion por defecto
     */
    public static void SetSesionInicial(){
        nombre="user";
        password="user";
        admin=false;
    }
    
    public static Integer getId(){
        return id;
    }
    /**
     * Indica si la sesion actual tiene permisos de administrador 
     * @return true si es administrador, false si no
     */
    public static boolean getAdmin() {
        return admin;
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
    
    
    
    
}
