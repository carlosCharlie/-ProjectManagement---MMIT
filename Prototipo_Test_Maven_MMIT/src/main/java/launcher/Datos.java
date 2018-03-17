/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
           c = DriverManager.getConnection("jdbc:sqlite:./bbdd.db");
           c.setAutoCommit(true);
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

        return c;
    }
    
    public int read(String nombre){
        Connection conn = null;
        try {
            conn = connect();
            
            String query = "SELECT * FROM usuarios WHERE nombre= '" + nombre + "'";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                rs.close();
                stmt.close();
                conn.close();
                return 0;
            }
            
        } catch (SQLException e) {
            return -5;
        }
   
        return -1;
    }
    
    public int write(String nombre){
         try {
            Connection conn = connect();
            
            String query = "INSERT INTO usuarios (nombre) VALUES ('" + nombre + "')";
            
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.execute();
            
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
            return -5;
        }
        return 0;
    }
}
