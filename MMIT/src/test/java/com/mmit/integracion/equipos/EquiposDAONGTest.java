package com.mmit.integracion.equipos;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.integracion.jugadores.JugadoresDAO;
import com.mmit.integracion.jugadores.JugadoresDAOImp;
import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.equipos.TOAEntrenadorEquipoJugadores;
import com.mmit.negocio.jugadores.JugadorTrans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class EquiposDAONGTest {
    
    public EquiposDAONGTest() {
    }

    /**
     * Prueba que el primer equipo de prueba se lea bien
     */
    @Test
    public void testReadAll() {
        try{
            System.out.println("Listar equipos");
            EquiposDAO instance = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            ArrayList<EquipoTrans> result = instance.readAll();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void testReadById(){
        try{
            System.out.println("Listar un equipo");
            EquiposDAO instance = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            EquipoTrans result = instance.readById(2);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
   
    @Test
    public void testInsert(){
        try{
            System.out.println("Insert equipo");
            EquiposDAO instance = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            EquipoTrans et = new EquipoTrans(300, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            instance.insert(et);
            EquipoTrans result = instance.readByNombre(et.getNombre());
            
            //Borrar Equipo Introducido
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps = c.prepareStatement("DELETE FROM equipos\n" +
            "      WHERE id = ?");
            ps.setInt(1, result.getId());
            ps.execute();
            ps.close();
            Conexion.getInstancia().cerrar();
            
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void testInsertSinNombre(){
        try{
            System.out.println("Insert equipo sin nombre");
            EquiposDAO instance = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            EquipoTrans et = new EquipoTrans(200, " ", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            instance.insert(et);
            EquipoTrans result = instance.readByNombre(et.getNombre());
            
            //Borrar Equipo Introducido
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps = c.prepareStatement("DELETE FROM equipos\n" +
            "      WHERE id = "+result.getId());
            ps.execute();
            ps.close();
            Conexion.getInstancia().cerrar();
            
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
}
  
