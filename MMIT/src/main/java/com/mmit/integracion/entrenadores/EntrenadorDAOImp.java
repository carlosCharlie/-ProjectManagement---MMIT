package com.mmit.integracion.entrenadores;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.negocio.entrenadores.EntrenadorTrans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EntrenadorDAOImp implements EntrenadorDAO{

    @Override
    public ArrayList<EntrenadorTrans> listarEntrenadores() {
       try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM entrenador");
            
            ResultSet rs = ps.executeQuery();
            
            ArrayList<EntrenadorTrans> entrenador = new ArrayList<EntrenadorTrans>();
      
            
            while(rs.next())
                entrenador.add(new EntrenadorTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("edad"),rs.getInt("equipo_id")));
            
            Conexion.getInstancia().cerrar();
            return entrenador;

        } catch (SQLException ex) {
            Logger.getLogger(EntrenadorDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            Conexion.getInstancia().cerrar();
        }
        
        return null;
    }
    
}
