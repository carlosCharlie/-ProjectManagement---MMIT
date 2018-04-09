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
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class TOAEntrenadorEquipoTestNG {
    
    public TOAEntrenadorEquipoTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testNGTOAEntrenadorEquipo(){
        try{
            EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
            EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            new TOAEntrenadorEquipo(ent, et);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void testNGGetEntrendor(){
        EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
        TOAEntrenadorEquipo instance = new TOAEntrenadorEquipo(ent, et);
        EntrenadorTrans result = instance.getEntrenador();
        assertEquals(result, ent);
    }
    
    @Test
    public void testNGGetEquipo(){
        EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
        TOAEntrenadorEquipo instance = new TOAEntrenadorEquipo(ent, et);
        EquipoTrans result = instance.getEquipo();
        assertEquals(result, et);
    }
    
    @Test
    public void testNGGetIdEntrendor(){
        EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
        TOAEntrenadorEquipo instance = new TOAEntrenadorEquipo(ent, et);
        int result = instance.getIdEntrenador();
        assertEquals(result, 1);
    }
    
    @Test
    public void testNGGetNombreEntrendor(){
        EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
        TOAEntrenadorEquipo instance = new TOAEntrenadorEquipo(ent, et);
        String result = instance.getNombreEntrenador();
        assertEquals(result, "juan");
    }
    
    @Test
    public void testNGGetApellidosEntrendor(){
        EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
        TOAEntrenadorEquipo instance = new TOAEntrenadorEquipo(ent, et);
        String result = instance.getApellidosEntrenador();
        assertEquals(result, "ramirez");
    }
    
    @Test
    public void testNGGetIdEquipo(){
        EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
        TOAEntrenadorEquipo instance = new TOAEntrenadorEquipo(ent, et);
        int result = instance.getIdEquipo();
        assertEquals(result, 1);
    }
    
    @Test
    public void testNGGetNombreEquipo(){
        EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
        TOAEntrenadorEquipo instance = new TOAEntrenadorEquipo(ent, et);
        String result = instance.getNombreEquipo();
        assertEquals(result, "pepe");
    }
    
    /*@Test
    public void testNGGetHistoricoEquipos(){
        EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 20, 8, 42, 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
        TOAEntrenadorEquipo instance = new TOAEntrenadorEquipo(ent, et);
        EntrenadorTrans result = instance.getEntrenador();
        assertEquals(result, ent);
    }*/
    
}
