/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integración;

/**
 *
 * @author Laura
 */

import java.util.ArrayList;
import java.sql.*;


public class DAOFormulario {

    public boolean guardardatos(String name) {        
        String query = "INSERT INTO formulario (name) VALUES ('" + name +"');";

        try {
            Connection conn = Conexion.connect();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conn.close();
        } catch (SQLException e) {
            return false;
        }
	return true;
    }

    public ArrayList<String> leerDatos() {
        ArrayList<String> tp = new ArrayList<String>();
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = Conexion.connect();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM formulario ;");
            while (rs.next()) {
                tp.add(rs.getString("name"));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        
        
        return tp;
    }

}