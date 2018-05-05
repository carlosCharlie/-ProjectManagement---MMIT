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
package com.mmit.integracion.entrenadores;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.integracion.jugadores.JugadoresDaoTestNG;
import com.mmit.negocio.entrenadores.EntrenadorSA;
import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class EntrenadoresDAOTestNG {
    
    public EntrenadoresDAOTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testReadAll(){
        try{
            System.out.println("Listar entrenadores");
            EntrenadorDAO instance = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            ArrayList<EntrenadorTrans> result = instance.readAll();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestNGReadHistoricoByEntrenador(EntrenadorTrans entrenador)
    {
        int id = 1;
        try{
          
            System.out.println("Historico de equipos");
            EntrenadorDAO instance = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            ArrayList<EquipoTrans> result = instance.readHistoricoByEntrenador(id);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
        
    }
    
    @Test
    public void TestNGReadByEquipo(){
        try{
            EntrenadorDAO instance = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            EntrenadorTrans result = instance.readByEquipo(1);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    
    @Test
    public void TestNGReadById(){
        try {
            EntrenadorDAO entrenadoresDao = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            EntrenadorTrans entrenador = entrenadoresDao.readById(1);
            
            assertNotNull(entrenador);
            //assertTrue(entrenador.getNombre()!=null && entrenador.getNombre().length()>0);
            //assertTrue(entrenador.getApellidos()!= null && entrenador.getApellidos().length()>0);
            //assertTrue(entrenador.getId()==id);
            //assertTrue(entrenador.getIdEquipo()>0);
        } catch (Exception ex) {
            Assert.fail();
            //Logger.getLogger(EntrenadoresDAOTestNG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void TestNGUpdate(){
        try{
            System.out.println("Update");
            EntrenadorDAO instance = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            EntrenadorTrans et = new EntrenadorTrans(300,"MonkeyD","Luffy",2,18,100,1);
            
            //Inserto al entrenador
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps = c.prepareStatement("INSERT INTO entrenador (nombre,apellidos,id_equipo,edad,victorias,derrotas) VALUES (?,?,?,?,?,?)");
            ps.setString(1,"MonkeyD");
            ps.setString(2,"Luffy");
            ps.setInt(3,1);
            ps.setInt(4,18);
            ps.setInt(5,100);
            ps.setInt(6,1);
            ps.execute();
            Conexion.getInstancia().cerrar();
            
            EntrenadorTrans entrenador = instance.readByNombre("MonkeyD");
            et.setId(entrenador.getId());
            instance.update(et);
            EntrenadorTrans result = instance.readByNombre("MonkeyD");

            //Borro al entrenador
            Conexion.getInstancia().abrir();
            c = Conexion.getInstancia().getResource();
            ps = c.prepareStatement("DELETE FROM entrenador WHERE id=?");
            System.out.println(result.getId());
            ps.setInt(1, result.getId());
            ps.execute();
            System.out.println("Update 3");
            ps.close();
            Conexion.getInstancia().cerrar();
            
            assertEquals(result.getIdEquipo(),(Integer) 2);
        }catch(Exception e){
            Logger.getLogger(JugadoresDaoTestNG.class.getName()).log(Level.SEVERE, null, e);
            Assert.fail();
        }
    }
        
}
        
        
    
    
