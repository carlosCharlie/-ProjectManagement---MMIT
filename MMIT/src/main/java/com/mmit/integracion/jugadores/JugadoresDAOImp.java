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
package com.mmit.integracion.jugadores;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.integracion.equipos.EquiposDAOImp;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.jugadores.JugadorTrans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class JugadoresDAOImp implements JugadoresDAO {

    @Override
    public ArrayList<JugadorTrans> readAll() {
       try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM jugadores");
            
            ResultSet rs = ps.executeQuery();
            
            ArrayList<JugadorTrans> jugadores = new ArrayList<JugadorTrans>();
            
            while(rs.next())
                jugadores.add(new JugadorTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"), rs.getDouble("altura"),rs.getInt("edad"),rs.getDouble("peso"),rs.getInt("equipo_id")));
            
            Conexion.getInstancia().cerrar();
            return jugadores;
        } catch (SQLException ex) {
            Logger.getLogger(EquiposDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            Conexion.getInstancia().cerrar();
        }
        
        return null;
    }
    
}
