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
            JugadoresDAO instance = new JugadoresDAOImp();
            ArrayList<JugadorTrans> result = instance.readAll();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
        
    }
    
    @Test
    public void TestGetRoaster(){
        try{
            System.out.println("Mostar plantilla");
            JugadoresDAO instance = new JugadoresDAOImp();
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
                   "                          nombre\n" +
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
                   "                          NULL,\n" +
                   "                          'a',\n" +
                   "                          'n'\n" +
                   "                      );",Statement.RETURN_GENERATED_KEYS);
            
            
            ps.execute();
            JugadoresDAO jugadoresDao = new JugadoresDAOImp();
            JugadorTrans j=jugadoresDao.readByID(ps.getGeneratedKeys().getInt(1));
            
            assertNotNull(j);
            assertNotNull(j.getNombre());
            assertNotNull(j.getApellidos());
            assertTrue(j.getNombre().length()>0);
            assertTrue(j.getApellidos().length()>0);
            Conexion.getInstancia().cerrar();
            Conexion.getInstancia().abrir();
            c = Conexion.getInstancia().getResource();
            ps = c.prepareStatement("DELETE FROM jugadores\n" +
"      WHERE " +
"            posicion = 'p' AND \n" +
"            dosAnotados = 5 AND \n" +
"            id_equipo = NULL AND \n" +
"            partidos = 1 AND \n" +
"            tresAnotados = 7 AND \n" +
"            libresIntentados = 10 AND \n" +
"            nombre = 'n' AND \n" +
"            perdidas = 18 AND \n" +
"            tresIntentados = 8 AND \n" +
"            rebotesOfensivos = 11 AND \n" +
"            libresAnotados = 9 AND \n" +
"            asistencias = 13 AND \n" +
"            tapones = 17 AND \n" +
"            peso = 20 AND \n" +
"            faltas = 15 AND \n" +
"            apellidos = 'a' AND \n" +
"            puntos = 16 AND \n" +
"            altura = 21 AND \n" +
"            minutos = 2 AND \n" +
"            dosIntentados = 6 AND \n" +
"            campoAnotados = 3 AND \n" +
"            campoIntentados = 4 AND \n" +
"            rebotesDefensivos = 12 AND \n" +
"            robos = 14 AND \n" +
"            edad = 19;");
            ps.execute();
            ps.close();
            Conexion.getInstancia().cerrar();
            
        } catch (SQLException ex) {
            Logger.getLogger(JugadoresDaoTestNG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(JugadoresDaoTestNG.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JugadoresDaoTestNG.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
