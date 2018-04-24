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

import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import java.util.ArrayList;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import com.grafico.graficotriangular.GraficoTriangular;
import com.mmit.negocio.equipos.EquipoTrans;


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
            JugadoresSA instance = FactoriaNegocio.getInstancia().crearJugadoresSA();
            ArrayList<TOAJugadorEquipo> result = instance.listarJugadores();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestNGObtenerJugador(){
        try{
            System.out.print("Estadisticas Jugador");
            JugadoresSA jugadoresSa = FactoriaNegocio.getInstancia().crearJugadoresSA();
            JugadorTrans j = jugadoresSa.obtenerJugador(1);
            assertNotNull(j);
        }catch(Exception e){
            Assert.fail();
        }
    }
}
