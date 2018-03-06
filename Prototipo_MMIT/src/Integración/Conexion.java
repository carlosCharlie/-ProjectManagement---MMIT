/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integración;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Laura
 */


public class Conexion{
	 public static Connection connect() {
		// SQLite connection string
	        String url = "jdbc:sqlite:./MMIT.db";
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(url);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        return conn;
	    }

	 //crear base de datos
	 public static void createNewDatabase(String fileName) {

	        String url = "jdbc:sqlite:" + fileName;

	        try {
	            Connection conn = DriverManager.getConnection(url);
	            if (conn != null) {
	                DatabaseMetaData meta = conn.getMetaData();
	                System.out.println("The driver name is " + meta.getDriverName());
	                System.out.println("A new database has been created.");
	            }

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 
	 //crear tabla
	 public static void createNewTable(String table) {
	        // SQLite connection string
	        String url = "jdbc:sqlite:./MMIT.db";

	        // SQL statement for creating a new table
	        String sql = "CREATE TABLE IF NOT EXISTS " + table +
	        		"(id integer AUTO_INCREMENT PRIMARY KEY," +
	                " name text NOT NULL);";

	        try {
	            Connection conn = DriverManager.getConnection(url);
	            Statement stmt = conn.createStatement();
	            stmt.execute(sql);
	            System.out.println("Created table " + table +".");
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}