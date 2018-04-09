package com.mmit.integracion.entrenadores;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.equipos.EquipoTrans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EntrenadorDAOImp implements EntrenadorDAO{
    
    
    /*
    Devuelve el historico de equipos de cada entrenador
    */
    public ArrayList<EquipoTrans> readHistoricoByEntrenador(int id) throws Exception{
        ArrayList<EquipoTrans> equipos = new ArrayList<EquipoTrans>();
        
        try{
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();

            PreparedStatement ps = c.prepareStatement(
                    "SELECT * FROM entrenadorEquipo JOIN equipos on equipos.id = entrenadorEquipo.equipo_id WHERE entrenador_id = " + id);  

            ResultSet rs = ps.executeQuery();
            while(rs.next())
                equipos.add(new EquipoTrans(rs.getInt("id"),rs.getString("nombre")));
            Conexion.getInstancia().cerrar();
        }
        catch (SQLException ex) {
            Conexion.getInstancia().cerrar();
            throw ex;
        }
        
        return equipos;
    }
    
    
    @Override
    public ArrayList<EntrenadorTrans> readAll() throws Exception{
       try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM entrenador");
            
            ResultSet rs = ps.executeQuery();
            
            ArrayList<EntrenadorTrans> entrenador = new ArrayList<EntrenadorTrans>();
      
            
            while(rs.next())
                entrenador.add(new EntrenadorTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("victorias"),rs.getInt("derrotas"),rs.getInt("edad"),rs.getInt("id_equipo")));
            
            Conexion.getInstancia().cerrar();
            return entrenador;

        } catch (SQLException ex) {
            Conexion.getInstancia().cerrar();
            throw ex;
        }
    }

    @Override
    public EntrenadorTrans readByEquipo(int id_Equipo) throws Exception{
       //No probado
        
        try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM entrenador where id_equipo = "+ id_Equipo);            
            ResultSet rs = ps.executeQuery();
            
            EntrenadorTrans entrenador = null;
            
            
            if(rs.next()){
                entrenador= (new EntrenadorTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("victorias"), rs.getInt("derrotas"), rs.getInt("edad"), rs.getInt("id_equipo")));

            }
        
            Conexion.getInstancia().cerrar();
            return entrenador;
            
        } catch (SQLException ex) {
            Conexion.getInstancia().cerrar();
            throw ex;
        }
    }

    @Override
    public EntrenadorTrans readById(int id) throws Exception{
        try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM entrenador WHERE id = ?");
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                return new EntrenadorTrans(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("victorias"),rs.getInt("derrotas"),rs.getInt("edad"),rs.getInt("id_equipo"));
            }
            
            Conexion.getInstancia().cerrar();

        } catch (SQLException ex) {
            Conexion.getInstancia().cerrar();
            throw ex;
        }
        
        return null;
    }
    
}
