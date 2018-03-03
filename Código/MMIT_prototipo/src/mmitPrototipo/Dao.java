/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmitPrototipo;

import java.util.ArrayList;
import java.sql.*;


public class Dao {

    private static final String BDURL = "jdbc:mysql://localhost:3306/MMIT"; // ruta de la base de datos
    private static final String USUARIO = "MMIT";//user
    private static final String CONTRASENNA = "MMIT";// pass

    public boolean guardardatos(String datos) {
        boolean ok = false;
        int r;
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(BDURL, USUARIO, CONTRASENNA);
            stmt = conn.createStatement();
            r = stmt.executeUpdate("INSERT equipos (nombre) VALUES (" + datos + ")");
            // Comprobar que solo ha sido afectada una fila
            ResultSet rs = stmt.executeQuery("SELECT * FROM equipos WHERE nombre = '"
                    + datos+ "';");
            if (rs.next()) {
                ok = true;
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

        return ok;
    }

    public ArrayList<String> leerdatos() {
        ArrayList<String> tp = null;
        int r;
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(BDURL, USUARIO, CONTRASENNA);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM equipos ;");
            if (rs.next()) {
                tp.add(rs.getString(1));
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
