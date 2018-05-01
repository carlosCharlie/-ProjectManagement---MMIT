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
package com.mmit.integracion.usuarios;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.negocio.usuarios.UsuarioTrans;
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
public class UsuariosDAOImp implements UsuariosDAO{

    @Override
    public UsuarioTrans readByNombre(String nombre) throws Exception {
        try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
          
            PreparedStatement ps =  c.prepareStatement("Select * from usuarios where nombre = ?");
            ps.setString(1,nombre);
            
            ResultSet rs = ps.executeQuery();
            
            if(!rs.next()){
                return null;
            }
            else
            {
                if (rs.getInt("admin") == 1){
                    return new UsuarioTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("password"),true);
                } else {
                    return new UsuarioTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("password"),false);
                }
            }
                
        
        } catch (SQLException ex) {
            Conexion.getInstancia().cerrar();
            throw new Exception("Error al conectarse a la BBDD");
        }
    }

    @Override
    public void write(UsuarioTrans usuarioTrans) {
       try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
          
            PreparedStatement ps =  c.prepareStatement("Insert into usuarios (nombre, password, admin) values (?,?,?)");
        
            ps.setString(1, usuarioTrans.getNombre());
            ps.setString(2, usuarioTrans.getPassword());
            ps.setBoolean(3, false);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
