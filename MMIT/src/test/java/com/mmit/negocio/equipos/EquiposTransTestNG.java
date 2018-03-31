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

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class EquiposTransTestNG {
    
    public EquiposTransTestNG() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void TestNGEquipoTrans(){
        try{
            new EquipoTrans(1, "pepe", 10, 10);
        }catch(Exception e){
            Assert.fail();
        }
    }

    @Test
    public void getIdTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10);
        int result = instance.getId();
        assertEquals(result, 1);
    }
    
    @Test
    public void getNombreTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10);
        String result = instance.getNombre();
        assertEquals(result, "pepe");
    }
    
    @Test
    public void getVictoriasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10);
        int result = instance.getVictorias();
        assertEquals(result, 10);
    }
    
    @Test
    public void getDerrotasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10);
        int result = instance.getDerrotas();
        assertEquals(result, 10);
    }
    
    @Test
    public void getJugadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10);
        int result = instance.getJugados();
        assertEquals(result, 20);
    }
    
    @Test
    public void getPorcentajeTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10);
        double result = instance.getPorcentaje();
        assertEquals(result, 50.0);
    }
    
}