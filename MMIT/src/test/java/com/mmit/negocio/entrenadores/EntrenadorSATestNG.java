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
package com.mmit.negocio.entrenadores;

import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class EntrenadorSATestNG {
    
    public EntrenadorSATestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void TestNGListarEntrenadores(){
        try{
            System.out.print("Listar Entrenadores");
            EntrenadorSA instance = FactoriaNegocio.getInstancia().crearEntrenadoresSA();
            ArrayList<TOAEntrenadorEquipo> result = instance.listarEntrenadores();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestNGObtenerEntrenadorCompleto(){
        try {
            int id=1;
            EntrenadorSA instance = FactoriaNegocio.getInstancia().crearEntrenadoresSA();
            TOAEntrenadorEquipo result = instance.obtenerEntrenadorCompleto(id);
            
            assertNotNull(result);
            //assertTrue(entrenadorEquipo.getApellidosEntrenador()!=null && entrenadorEquipo.getApellidosEntrenador().length()>0);
            //assertTrue(entrenadorEquipo.getEntrenador()!=null);
            //assertTrue(entrenadorEquipo.getNombreEquipo()!= null && entrenadorEquipo.getNombreEquipo().length()>0);
            
            
            /*if(entrenadorEquipo.getEntrenador()!=null) //no tenemos este caso en cuenta porque puede no estar asignado
                informacionEntrenador(entrenadorEquipo.getEntrenador());*/
        } catch (Exception ex) {
            Assert.fail();
        }
        
    }
    @Test
    public void TestNGObtenerHistoricoEquipos(){
       try {
            EntrenadorSA instance = FactoriaNegocio.getInstancia().crearEntrenadoresSA();
            ArrayList<EquipoTrans> result = instance.obtenerHistoricoEquipos(1);
            
            assertNotNull(result);

        } catch (Exception ex) {
            Assert.fail();
        }
        
    }
    
    public void TestNGObtenerEntrenador()
    {
        try{
            EntrenadorSA instance = FactoriaNegocio.getInstancia().crearEntrenadoresSA();
            EntrenadorTrans result = instance.obtenerEntrenador(1);
            
            assertNotNull(result);

        }catch(Exception e){
            Assert.fail();
        }
    }
}
