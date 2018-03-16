/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author crash
 */
public class Datos {
    
    public Datos(){
        
    }
    
    public static Connection connect() {
        Connection c = null;

        try {
            Class.forName("org.sqlite.JDBC");
            //createNewDatabase("MMIT");
            c = DriverManager.getConnection("jdbc:sqlite:bbdd.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

        return c;
    }
    
    public int read(String nombre){
        try {
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios WHERE nombre= '" + nombre + "';");
            while (rs.next()) {
                return 0;
            }
            conn.close();
        } catch (SQLException e) {
            return -5;
        }
         
        return -1;
    }
    
    public int write(String nombre){
         try {
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            stmt.executeQuery("INSERT INTO usuarios(nombre) VALUES ('" + nombre + "');");
            conn.close();
        } catch (SQLException e) {
            return -5;
        }
        return 0;
    }
}
