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
import com.mmit.negocio.entrenadores.EntrenadorSA;
import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            EntrenadorDAO instance = new EntrenadorDAOImp();
            ArrayList<EntrenadorTrans> result = instance.readAll();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void equiposEntrenador(EntrenadorTrans entrenador)
    {
        int id = 1;
        try{
          
            System.out.println("Historico de equipos");
            EntrenadorDAO instance = new EntrenadorDAOImp();
            ArrayList<EquipoTrans> result = instance.readHistoricoByEntrenador(id);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
        
    }
    @Test
    public void informacionBasicaEntrenadorDAO(){
        try {
            int id = 1;
            EntrenadorDAO entrenadoresDao = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            EntrenadorTrans entrenador = entrenadoresDao.readById(id);
            
            assertNotNull(entrenador);
            assertTrue(entrenador.getNombre()!=null && entrenador.getNombre().length()>0);
            assertTrue(entrenador.getApellidos()!= null && entrenador.getApellidos().length()>0);
            assertTrue(entrenador.getId()==id);
            assertTrue(entrenador.getIdEquipo()>0);
        } catch (Exception ex) {
            Logger.getLogger(EntrenadoresDAOTestNG.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
}
