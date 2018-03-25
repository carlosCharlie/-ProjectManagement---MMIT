package com.mmit.integracion.conexion;

import java.sql.Connection;

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
