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
package com.mmit.integracion.jugadores;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.negocio.jugadores.JugadorTrans;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class JugadoresDaoTestNG {
    
    public JugadoresDaoTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void TestReadAll(){
        try{
            System.out.println("Listar jugadores");
            JugadoresDAO instance = FactoriaIntegracion.getInstancia().crearJugadoresDAO();
            ArrayList<JugadorTrans> result = instance.readAll();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
        
    }
    
    @Test
    public void TestReadById(){
        try{
            System.out.println("Sacar jugador por id");
            JugadoresDAO instance = FactoriaIntegracion.getInstancia().crearJugadoresDAO();
            JugadorTrans result = instance.readByID(1);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
        
    }
    
    @Test
    public void TestGetRoaster(){
        try{
            System.out.println("Mostar plantilla");
            JugadoresDAO instance = FactoriaIntegracion.getInstancia().crearJugadoresDAO();
            ArrayList<JugadorTrans> result = instance.readRoster(1);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    
    @Test
    public void informacionJugador(){
        try {
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps = c.prepareStatement("INSERT INTO jugadores (\n" +
                   "                          altura,\n" +
                   "                          peso,\n" +
                   "                          edad,\n" +
                   "                          perdidas,\n" +
                   "                          tapones,\n" +
                   "                          puntos,\n" +
                   "                          faltas,\n" +
                   "                          robos,\n" +
                   "                          asistencias,\n" +
                   "                          rebotesDefensivos,\n" +
                   "                          rebotesOfensivos,\n" +
                   "                          libresIntentados,\n" +
                   "                          libresAnotados,\n" +
                   "                          tresIntentados,\n" +
                   "                          tresAnotados,\n" +
                   "                          dosIntentados,\n" +
                   "                          dosAnotados,\n" +
                   "                          campoIntentados,\n" +
                   "                          campoAnotados,\n" +
                   "                          minutos,\n" +
                   "                          partidos,\n" +
                   "                          posicion,\n" +
                   "                          id_equipo,\n" +
                   "                          apellidos,\n" +
                   "                          nombre,\n" +
                   "                          mano\n"+
                   "                      )\n" +
                   "                      VALUES (\n" +
                   "                          21,\n" +
                   "                          20,\n" +
                   "                          19,\n" +
                   "                          18,\n" +
                   "                          17,\n" +
                   "                          16,\n" +
                   "                          15,\n" +
                   "                          14,\n" +
                   "                          13,\n" +
                   "                          12,\n" +
                   "                          11,\n" +
                   "                          10,\n" +
                   "                          9,\n" +
                   "                          8,\n" +
                   "                          7,\n" +
                   "                          6,\n" +
                   "                          5,\n" +
                   "                          4,\n" +
                   "                          3,\n" +
                   "                          2,\n" +
                   "                          1,\n" +
                   "                          'p',\n" +
                   "                          1,\n" +
                   "                          'a',\n" +
                   "                          'n',\n" +
                   "                           'zurdo'\n "+
                   "                      );",Statement.RETURN_GENERATED_KEYS);
            
            
            ps.execute();
            JugadoresDAO jugadoresDao = new JugadoresDAOImp();
            JugadorTrans j=jugadoresDao.readByID(ps.getGeneratedKeys().getInt(1));
            
            assertNotNull(j);
            assertNotNull(j.getNombre());
            assertNotNull(j.getApellidos());
            assertTrue(j.getNombre().length()>0);
            assertTrue(j.getApellidos().length()>0);
           
            for(Method m: j.getClass().getDeclaredMethods()){
                if(m.getParameterCount()==0)//si es un getter
                    assertTrue(m.invoke(j, null)!=null);
            }
            Conexion.getInstancia().cerrar();
            Conexion.getInstancia().abrir();
            
            
            c = Conexion.getInstancia().getResource();
            
            ps = c.prepareStatement("DELETE FROM jugadores\n" +
            "      WHERE id = "+j.getId());
            ps.execute();
            ps.close();
            Conexion.getInstancia().cerrar();
            
        } catch (SQLException ex) {
            Logger.getLogger(JugadoresDaoTestNG.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(JugadoresDaoTestNG.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        } catch (Exception ex) {
            Logger.getLogger(JugadoresDaoTestNG.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
        
    }
    
}
