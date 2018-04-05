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

import java.util.ArrayList;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class JugadoresSATestNG {
    
    public JugadoresSATestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void TestNGListarJugadores(){
        try{
            System.out.print("Listar Jugadores");
            JugadoresSA instance = new JugadoresSAImp();
            ArrayList<TOAJugadorEquipo> result = instance.listarJugadores();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void probarJugador(){
       JugadoresSA jugadoresSa=new JugadoresSAImp();
       JugadorTrans j = jugadoresSa.obtenerJugador(1);
       assertNotNull(j);
       assertNotNull(j.getNombre());
       assertNotNull(j.getApellidos());
       assertTrue(j.getNombre().length()>0 && j.getApellidos().length()>0);
    }
    
}
