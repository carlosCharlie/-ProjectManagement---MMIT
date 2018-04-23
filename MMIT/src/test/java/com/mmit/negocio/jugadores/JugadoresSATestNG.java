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
    
    @Test
    public void TestNGGraficoJugadoresCorrecto(){
        try{
            System.out.print("Mostrar Grafico Jugadores Correcto");
            JugadorTrans jt = new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
            EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            TOAJugadorEquipo jugador = new TOAJugadorEquipo(jt, et);
            GraficoTriangular grafico = null;
            grafico.setPorcentajeA(Double.valueOf(jugador.getJugador().getDosPorcentaje()));
            grafico.setVariableA("Tiros de 2");
            grafico.setPorcentajeB(Double.valueOf(jugador.getJugador().getTresPorcentaje()));
            grafico.setVariableB("Tiros de 3");
            grafico.setPorcentajeC(Double.valueOf(jugador.getJugador().getLibresPorcentaje()));
            grafico.setVariableC("Tiros Libres");
            assertNotNull(grafico);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
     @Test
    public void TestNGGraficoJugadoresNull(){
        try{
            System.out.print("Mostrar Grafico Jugadores Con Null");
            GraficoTriangular grafico = null;
            grafico.setPorcentajeA(null);
            grafico.setVariableA(null);
            grafico.setPorcentajeB(null);
            grafico.setVariableB(null);
            grafico.setPorcentajeC(null);
            grafico.setVariableC(null);
            assertNotNull(grafico);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestNGGraficoJugadoresVacio(){
        try{
            System.out.print("Mostrar Grafico Jugadores Vacio");
            GraficoTriangular grafico = null;
            grafico.setPorcentajeA(0.0);
            grafico.setVariableA("Tiros de 2");
            grafico.setPorcentajeB(0.0);
            grafico.setVariableB("Tiros de 3");
            grafico.setPorcentajeC(0.0);
            grafico.setVariableC("Tiros Libres");
            assertNotNull(grafico);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
}
