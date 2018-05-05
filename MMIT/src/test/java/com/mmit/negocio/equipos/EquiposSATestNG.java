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

import com.grafico.graficotriangular.GraficoTriangular;
import com.mmit.integracion.conexion.Conexion;
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
            EquiposSA instance = new EquiposSAImp();
            EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
            EquipoTrans et = new EquipoTrans(1, " ", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            TOAEntrenadorEquipo toa = new TOAEntrenadorEquipo(ent, et);
            instance.añadir(toa);
            EquipoTrans result = instance.obtenerEquipo(toa.getEquipo().getId());
            
            //Borrar Equipo Introducido
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps = c.prepareStatement("DELETE FROM usuarios\n" +
            "      WHERE id = "+toa.getEquipo().getId());
            ps.execute();
            ps.close();
            Conexion.getInstancia().cerrar();
            
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void testAñadir(){
        try{
            System.out.println("Insert equipo sin nombre");
            EquiposSA instance = new EquiposSAImp();
            EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
            EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            TOAEntrenadorEquipo toa = new TOAEntrenadorEquipo(ent, et);
            instance.añadir(toa);
            EquipoTrans result = instance.obtenerEquipo(toa.getEquipo().getId());
            
            //Borrar Equipo Introducido
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps = c.prepareStatement("DELETE FROM usuarios\n" +
            "      WHERE id = "+toa.getEquipo().getId());
            ps.execute();
            ps.close();
            Conexion.getInstancia().cerrar();
            
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
}
    


