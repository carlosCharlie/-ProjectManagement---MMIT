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


public class DAO {

    public boolean guardardatos(String tabla,String name) {
  
        String sql = "INSERT INTO " + tabla +"(name) VALUES(?)";

        try {
            Connection conn = Conexion.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
     
        } catch (SQLException e) {
            //System.out.println(e.getMessage());
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