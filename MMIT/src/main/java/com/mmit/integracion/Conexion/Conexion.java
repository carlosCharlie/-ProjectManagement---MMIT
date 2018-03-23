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
    
    static public Conexion getConexion(){
        if(c==null){
            c= new ConexionImp();
        }
        return c;
    }
    abstract public void abrir();
    abstract public void cerrar();
    abstract public Connection getResource();
    
}
