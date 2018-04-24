package com.mmit.integracion.equipos;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.negocio.equipos.EquipoTrans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EquiposDAOImp implements EquiposDAO{

       public ArrayList<EquipoTrans> readAll() throws Exception {
       
        try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM equipos");
            
            ResultSet rs = ps.executeQuery();
            
            ArrayList<EquipoTrans> equipos = new ArrayList<EquipoTrans>();
            
            while(rs.next()){
                equipos.add(new EquipoTrans(rs.getInt("id"),rs.getString("nombre"),rs.getInt("victorias"),rs.getInt("derrotas"), rs.getInt("anotados"), rs.getInt("recibidos"), rs.getInt("campoAnotados"), rs.getInt("campoIntentados"), rs.getInt("tresAnotados"), rs.getInt("tresIntentados"), rs.getInt("libresAnotados"), rs.getInt("libresIntentados"), rs.getInt("rebotesOfensivos"), rs.getInt("rebotesTotales"), rs.getInt("asistencias"), rs.getInt("robos"), rs.getInt("faltas"), rs.getInt("tapones"), rs.getInt("perdidas")));
            }
            Conexion.getInstancia().cerrar();
            return equipos;

        } catch (SQLException ex) {
            Conexion.getInstancia().cerrar();
            throw new Exception("Error al conectarse a la BBDD");
        }
    }

    @Override
    public EquipoTrans readById(Integer id) throws Exception{
         try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM equipos WHERE id = " + id+" order by equipos.victorias");
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                return new EquipoTrans(rs.getInt("id"),rs.getString("nombre"),rs.getInt("victorias"),rs.getInt("derrotas"), rs.getInt("anotados"), rs.getInt("recibidos"), rs.getInt("campoAnotados"), rs.getInt("campoIntentados"), rs.getInt("tresAnotados"), rs.getInt("tresIntentados"), rs.getInt("libresAnotados"), rs.getInt("libresIntentados"), rs.getInt("rebotesOfensivos"), rs.getInt("rebotesTotales"), rs.getInt("asistencias"), rs.getInt("robos"), rs.getInt("faltas"), rs.getInt("tapones"), rs.getInt("perdidas"));
            }
            
            Conexion.getInstancia().cerrar();

        } catch (SQLException ex) {
            Conexion.getInstancia().cerrar();
            throw new Exception("Error al conectarse a la BBDD");
        }
        
        return null;
    }
    
}
