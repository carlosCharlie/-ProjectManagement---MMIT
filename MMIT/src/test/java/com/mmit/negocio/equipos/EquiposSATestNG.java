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
package com.mmit.negocio.equipos;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.integracion.entrenadores.EntrenadorDAO;
import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class EquiposSATestNG {
    
    @Test
    public void TestListarEquipos(){
        try{
            System.out.print("Listar Equipos");
            EquiposSA instance = new EquiposSAImp();
            ArrayList<EquipoTrans> result = instance.listarEquipos();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestObtenerEquipoCompleto(){
        try{
            System.out.println("Sacar equipo segun Id");
            EquiposSA instance = new EquiposSAImp();
            TOAEntrenadorEquipo result = instance.obtenerEquipoCompleto(2);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestObtenerEquipo(){
         try{
            System.out.println("Obtener plantilla sin entrenador con el id");
            EquiposSA instance = new EquiposSAImp();
            EquipoTrans result = instance.obtenerEquipo(2);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
   
    @Test
    public void testAñadirSinNombre(){
        try{
            System.out.println("Insert equipo sin nombre");
             //Introduzco Entrenador
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps = c.prepareStatement("INSERT INTO entrenador (nombre,apellidos,id_equipo,edad,victorias,derrotas) VALUES (?,?,?,?,?,?)");
            ps.setString(1,"monkeyD");
            ps.setString(2,"luffy");
            ps.setInt(3,20);
            ps.setInt(4,28);
            ps.setInt(5,42);
            ps.setInt(6,1);
            ps.execute();
            Conexion.getInstancia().cerrar();
            
            EquiposDAO tDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            EntrenadorDAO eDao = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            EquiposSA instance = new EquiposSAImp();
            EntrenadorTrans ent = new EntrenadorTrans(300, "monkeyD", "luffy", 42, 1, 18, null);
            EquipoTrans et = new EquipoTrans(200, " ", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            ent.setId(eDao.readByNombre(ent.getNombre()).getId());
            TOAEntrenadorEquipo toa = new TOAEntrenadorEquipo(ent, et);
            instance.añadir(toa);
            
            //Borrar Equipo y Entrenador Introducido
            EquipoTrans result = tDao.readByNombre(" ");
            EntrenadorTrans result2 = eDao.readByEquipo(result.getId());
            Conexion.getInstancia().abrir();
            c = Conexion.getInstancia().getResource();
            ps = c.prepareStatement("DELETE FROM equipos\n" +
            "      WHERE id = "+result.getId());
            PreparedStatement ps2 = c.prepareStatement("DELETE FROM entrenador\n" +
            "      WHERE id = "+result2.getId());
            ps.execute();
            ps2.execute();
            ps.close();
            ps2.close();
            Conexion.getInstancia().cerrar();
            
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
            
    
    @Test
    public void testAñadir(){
        try{
            System.out.println("Insert equipo");
            
            //Introduzco Entrenador
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps = c.prepareStatement("INSERT INTO entrenador (nombre,apellidos,id_equipo,edad,victorias,derrotas) VALUES (?,?,?,?,?,?)");
            ps.setString(1,"monkeyD");
            ps.setString(2,"luffy");
            ps.setInt(3,20);
            ps.setInt(4,28);
            ps.setInt(5,42);
            ps.setInt(6,1);
            ps.execute();
            Conexion.getInstancia().cerrar();
            
            EquiposDAO tDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            EntrenadorDAO eDao = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            EquiposSA instance = new EquiposSAImp();
            EntrenadorTrans ent = new EntrenadorTrans(300, "monkeyD", "luffy", 42, 1, 18, null);
            EquipoTrans et = new EquipoTrans(200, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            ent.setId(eDao.readByNombre(ent.getNombre()).getId());
            TOAEntrenadorEquipo toa = new TOAEntrenadorEquipo(ent, et);
            instance.añadir(toa);
            
            //Borrar Equipo y Entrenador Introducido
            EquipoTrans result = tDao.readByNombre("pepe");
            EntrenadorTrans result2 = eDao.readByEquipo(result.getId());
            Conexion.getInstancia().abrir();
            c = Conexion.getInstancia().getResource();
            ps = c.prepareStatement("DELETE FROM equipos\n" +
            "      WHERE id = "+result.getId());
            PreparedStatement ps2 = c.prepareStatement("DELETE FROM entrenador\n" +
            "      WHERE id = "+result2.getId());
            ps.execute();
            ps2.execute();
            ps.close();
            ps2.close();
            Conexion.getInstancia().cerrar();
            
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void testAñadirEntrenadorConEquipo(){
        try{
            System.out.println("Insert equipo con entrenador de otro equipo");
            
            //Introduzco Entrenador
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps = c.prepareStatement("INSERT INTO entrenador (nombre,apellidos,id_equipo,edad,victorias,derrotas) VALUES (?,?,?,?,?,?)");
            ps.setString(1,"monkeyD");
            ps.setString(2,"luffy");
            ps.setInt(3,20);
            ps.setInt(4,28);
            ps.setInt(5,42);
            ps.setInt(6,1);
            ps.execute();
            Conexion.getInstancia().cerrar();
            
            EquiposDAO tDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            EntrenadorDAO eDao = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            EquiposSA instance = new EquiposSAImp();
            EntrenadorTrans ent = new EntrenadorTrans(300, "monkeyD", "luffy", 42, 1, 18, 20);
            EquipoTrans et = new EquipoTrans(200, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            ent.setId(eDao.readByNombre(ent.getNombre()).getId());
            TOAEntrenadorEquipo toa = new TOAEntrenadorEquipo(ent, et);
            int respuesta = instance.añadir(toa);
            
            //Borrar Equipo y Entrenador Introducido
            EntrenadorTrans result2 = eDao.readByNombre(ent.getNombre());
            Conexion.getInstancia().abrir();
            c = Conexion.getInstancia().getResource();
            ps = c.prepareStatement("DELETE FROM entrenador\n" +
            "      WHERE id = "+result2.getId());
            ps.execute();
            ps.close();
            Conexion.getInstancia().cerrar();
            
            assertEquals(respuesta, -1);
        }catch(Exception e){
            Assert.fail();
        }
    }
}
    


