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

import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class EntrenadorTransTestNG {
    
    public EntrenadorTransTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testNGEntrenadorTrans(){
        try{
            new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void testNGGetId(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        int result = instance.getId();
        assertEquals(result, 1);
    }
    
    @Test
    public void testNGSetId(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        instance.setId(2);
        int result = instance.getId();
        assertEquals(result, 2);
    }
    
    @Test
    public void testNGGetNombre(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        String result = instance.getNombre();
        assertEquals(result, "juan");
    }
    
    @Test
    public void testNGSetNombre(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        instance.setNombre("pedro");
        String result = instance.getNombre();
        assertEquals(result, "pedro");
    }
    
    @Test
    public void testNGGetApellidos(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        String result = instance.getApellidos();
        assertEquals(result, "ramirez");
    }
    
    @Test
    public void testNGSetApellidos(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        instance.setApellidos("perez");
        String result = instance.getApellidos();
        assertEquals(result, "perez");
    }
    
    @Test
    public void testNGGetVictorias(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        int result = instance.getVictorias();
        assertEquals(result, 20);
    }
    
    @Test
    public void testNGSetVictorias(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        instance.setVictorias(22);
        int result = instance.getVictorias();
        assertEquals(result, 22);
    }
    
    @Test
    public void testNGGetDerrotas(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        int result = instance.getDerrotas();
        assertEquals(result, 8);
    }
    
    @Test
    public void testNGSetDerrotas(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        instance.setDerrotas(10);
        int result = instance.getDerrotas();
        assertEquals(result, 10);
    }
    
    @Test
    public void testNGGetEdad(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        int result = instance.getEdad();
        assertEquals(result, 42);
    }
    
    @Test
    public void testNGSetEdad(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        instance.setEdad(50);
        int result = instance.getEdad();
        assertEquals(result, 50);
    }
    
    @Test
    public void testNGGetIdEquipo(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        int result = instance.getIdEquipo();
        assertEquals(result, 1);
    }
    
    @Test
    public void testNGSetIdEquipo(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        instance.setIdEquipo(2);
        int result = instance.getIdEquipo();
        assertEquals(result, 2);
    }
    
}
