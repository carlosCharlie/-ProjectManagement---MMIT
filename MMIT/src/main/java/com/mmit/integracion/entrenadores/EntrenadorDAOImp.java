package com.mmit.integracion.entrenadores;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.equipos.EquipoTrans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EntrenadorDAOImp implements EntrenadorDAO{

    public EntrenadorTrans readByName(String name){
        Conexion.getInstancia().abrir();
        Connection c = Conexion.getInstancia().getResource();
        
        if(c !=null) {
        
            try{
                PreparedStatement ps = c.prepareStatement("SELECT nombre FROM entrenador WHERE nombre = " + name);  
                ResultSet rs = ps.executeQuery();
                if(rs.next()){

                }
            }
            catch(SQLException e){
                
            }
        return
    }
    @Override
    public ArrayList<EntrenadorTrans> readAll() {
       try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM entrenador");
            
            ResultSet rs = ps.executeQuery();
            
            ArrayList<EntrenadorTrans> entrenador = new ArrayList<EntrenadorTrans>();
      
            
            while(rs.next())
                entrenador.add(new EntrenadorTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("id_equipo")));
            
            Conexion.getInstancia().cerrar();
            return entrenador;

        } catch (SQLException ex) {
            Logger.getLogger(EntrenadorDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            Conexion.getInstancia().cerrar();
        }
        
        return null;
    }

    @Override
    public EntrenadorTrans getByEquipo(int id_Equipo) {
       //No probado
        
        try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM entrenador where id_equipo = "+ id_Equipo);            
            ResultSet rs = ps.executeQuery();
            
            EntrenadorTrans entrenador = null;
            
            
            if(rs.next()){
                entrenador= (new EntrenadorTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("id_equipo")));

            }
        
            Conexion.getInstancia().cerrar();
            return entrenador;
            
        } catch (SQLException ex) {
            Logger.getLogger(EntrenadorDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public EntrenadorTrans getById(int id) {
        try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM entrenador WHERE id = ?");
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                return new EntrenadorTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("victorias"),rs.getInt("derrotas"),rs.getInt("id_equipo"));
            }
            
            Conexion.getInstancia().cerrar();

        } catch (SQLException ex) {
            Conexion.getInstancia().cerrar();
        }
        
        return null;
    }
    
}
