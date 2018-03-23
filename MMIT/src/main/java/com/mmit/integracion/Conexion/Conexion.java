/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.integracion.Conexion;

import java.sql.Connection;

/**
 *
 * @author carlos
 */
abstract public class Conexion {
   
    static private Conexion c=null;
    
    /**
     * Devuelve la instancia del Singleton
     * @return 
     */
    static public Conexion getInstancia(){
        if(c==null){
            c= new ConexionImp();
        }
        return c;
    }
    
    /**
     * Se conecta con la base de datos
     */
    abstract public void abrir();
    
    /**
     * cierra la conexion con la base de datos
     */
    abstract public void cerrar();
    
    /**
     * devuelve la conexion creada
     * @return conexion SQL
     */
    abstract public Connection getResource();
    
}
