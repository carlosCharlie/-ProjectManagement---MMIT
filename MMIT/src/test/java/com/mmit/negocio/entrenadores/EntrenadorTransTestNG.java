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
            new EntrenadorTrans(1, "juan", "ramirez", 1);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void testNGGetId(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 1);
        int result = instance.getId();
        assertEquals(result, 1);
    }
    
    @Test
    public void testNGGetNombre(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 1);
        String result = instance.getNombre();
        assertEquals(result, "juan");
    }
    
    @Test
    public void testNGGetApellidos(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 1);
        String result = instance.getApellidos();
        assertEquals(result, "ramirez");
    }
    
    @Test
    public void testNGGetIdEquipo(){
        EntrenadorTrans instance = new EntrenadorTrans(1, "juan", "ramirez", 1);
        int result = instance.getIdEquipo();
        assertEquals(result, 1);
    }
    
}
