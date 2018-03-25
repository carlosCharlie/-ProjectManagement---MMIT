package com.mmit.integracion.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ConexionImp extends Conexion {

    private Connection connection = null;
    
    public ConexionImp() {
    }

    public void abrir(){
        try {         
            if(this.connection != null){
                cerrar();
            }
            this.connection = DriverManager.getConnection("jdbc:sqlite:MMIT.db");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionImp.class.getName()).log(Level.SEVERE, null,"Error al abrir la conexion: "+ ex.getMessage());
        }
    }
    
    @Override
    public Connection getResource(){
        if(this.connection == null){
            Logger.getLogger(ConexionImp.class.getName()).log(Level.SEVERE, "No se ha abierto la conexion, usar primero 'Conexion.abrir()");
        }
        return this.connection;
    }

    @Override
    public void cerrar() {
        if(this.connection != null){
            try {
                this.connection.close();
                this.connection = null;

            } catch (SQLException ex) {
                Logger.getLogger(ConexionImp.class.getName()).log(Level.SEVERE, null, "\"Error al cerrar la conexion: " + ex.getMessage());
            }
         }
    }
   
}
