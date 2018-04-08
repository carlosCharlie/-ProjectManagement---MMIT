/*
 * Copyright (C) 2018 Your Organisation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mmit.negocio.Registros;

import com.mmit.integracion.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class SesionQuery {

    /**
     * Comprueba que existe ese registro y asigna los permisos
     * @param nombre nombre de la persona que va a iniciar sesion
     * @param password password de esa cuenta
     * @return Devuelve los permisos de ese usuario o null si no se ha podido hacer login
     */
    public Permisos comprobar(String nombre, String password) {
        try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("Select * from registros where nombre = ?");
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() && rs.getString("password").equals(password))
            {
                return Permisos.stringToPermisosParser(rs.getString("permiso"));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(SesionQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
    }
    
}
