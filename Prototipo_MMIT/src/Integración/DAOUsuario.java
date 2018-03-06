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

import java.sql.*;


public class DAOUsuario {

    public String readByUser(String user) {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = Conexion.connect();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios WHERE ID = " + user + ";");
            while (rs.next()) {
                return rs.getString("name");
            }
        } catch (SQLException e) {
            return null;
        }
        return null;
    }

}