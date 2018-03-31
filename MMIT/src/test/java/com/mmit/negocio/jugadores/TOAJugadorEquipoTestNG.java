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
package com.mmit.negocio.jugadores;

import com.mmit.negocio.equipos.EquipoTrans;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class TOAJugadorEquipoTestNG {
    
    public TOAJugadorEquipoTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void TestNGTOAJugadorEquipo(){
        try{
            JugadorTrans jt = new JugadorTrans(1, "fulgencio", "de la cruz", 1);
            EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10);
            new TOAJugadorEquipo(jt, et);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestNGGetIdJugador(){
        JugadorTrans jt = new JugadorTrans(1, "fulgencio", "de la cruz", 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10);
        TOAJugadorEquipo instance = new TOAJugadorEquipo(jt, et);
        int result = instance.getIdJugador();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGGetNombreJugador(){
        JugadorTrans jt = new JugadorTrans(1, "fulgencio", "de la cruz", 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10);
        TOAJugadorEquipo instance = new TOAJugadorEquipo(jt, et);
        String result = instance.getNombreJugador();
        assertEquals(result, "fulgencio");
    }
    
    @Test
    public void TestNGGetApellidosJugador(){
        JugadorTrans jt = new JugadorTrans(1, "fulgencio", "de la cruz", 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10);
        TOAJugadorEquipo instance = new TOAJugadorEquipo(jt, et);
        String result = instance.getApellidosJugador();
        assertEquals(result, "de la cruz");
    }
    
    @Test
    public void TestNGGetIdEquipo(){
        JugadorTrans jt = new JugadorTrans(1, "fulgencio", "de la cruz", 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10);
        TOAJugadorEquipo instance = new TOAJugadorEquipo(jt, et);
        int result = instance.getIdEquipo();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGGetNombreEquipo(){
        JugadorTrans jt = new JugadorTrans(1, "fulgencio", "de la cruz", 1);
        EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10);
        TOAJugadorEquipo instance = new TOAJugadorEquipo(jt, et);
        String result = instance.getNombreEquipo();
        assertEquals(result, "pepe");
    }
    
}
