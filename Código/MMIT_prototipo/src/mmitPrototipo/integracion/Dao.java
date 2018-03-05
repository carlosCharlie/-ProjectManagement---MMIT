/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import java.util.ArrayList;
import java.sql.*;


public class Dao {

    public boolean guardardatos(String tabla,String name) {
        boolean ok = false;
        String sql = "INSERT INTO " + tabla +"(name) VALUES(?)";

        try {
            Connection conn = baseDeDatos.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            ok=true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		return ok;
    }

    public ArrayList<String> leerdatos() {
        ArrayList<String> tp = new ArrayList<String>();
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = baseDeDatos.connect();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM equipos ;");
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
