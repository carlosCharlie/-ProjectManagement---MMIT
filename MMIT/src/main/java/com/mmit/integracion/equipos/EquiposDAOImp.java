/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.integracion.equipos;

import com.mmit.integracion.Conexion.Conexion;
import com.mmit.negocio.equipos.EquipoTrans;
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
public class EquiposDAOImp implements EquiposDAO{

       public ArrayList<EquipoTrans> listarEquipos() {
       
        try {
            Conexion.getConexion().abrir();
            Connection c = Conexion.getConexion().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * from equipos");
            
            ResultSet rs = ps.executeQuery();
            
            ArrayList<EquipoTrans>equipos=new ArrayList<EquipoTrans>();
            
            while(rs.next())
                equipos.add(new EquipoTrans(rs.getInt("int"),rs.getString("nombre"),rs.getInt("victorias"),rs.getInt("derrotas"),rs.getInt("entrenador_id")));
            
            return equipos;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EquiposDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}
