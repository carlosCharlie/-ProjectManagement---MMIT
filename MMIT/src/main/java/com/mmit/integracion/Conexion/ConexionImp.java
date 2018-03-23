/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.integracion.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author carlos
 */
class ConexionImp extends Conexion {

    private Connection connection=null;
    
    ConexionImp() {
    }

  public void abrir(){
        try {
            
            if(this.connection!=null)
                cerrar();
            
            
            
            this.connection = DriverManager.getConnection("jdbc:sqlite:MMIT.db");
            
            
        } catch (SQLException ex) {
            System.err.print("Error al empezar la conexion: "+ex.getMessage());
        }  
       
  }
   public Connection getResource(){
       if(this.connection==null)
           System.err.print("No se ha abierto la conexion, usar primero 'Conexion.abrir()'");
       
       return this.connection;
   }

    @Override
    public void cerrar() {
        if(this.connection!=null){
            try {
                this.connection.close();
                this.connection=null;
            } catch (SQLException ex) {
                System.err.print("Error al cerrar la conexion: "+ex.getMessage());
            }
        }
    }
   
}
