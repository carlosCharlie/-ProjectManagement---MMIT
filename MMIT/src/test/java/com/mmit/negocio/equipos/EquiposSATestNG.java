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

import com.grafico.graficotriangular.GraficoTriangular;
import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import java.util.ArrayList;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class EquiposSATestNG {
    
    @Test
    public void TestListarEquipos(){
        try{
            System.out.print("Listar Equipos");
            EquiposSA instance = new EquiposSAImp();
            ArrayList<EquipoTrans> result = instance.listarEquipos();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestObtenerEquipoCompleto(){
        try{
            System.out.println("Sacar equipo segun Id");
            EquiposSA instance = new EquiposSAImp();
            TOAEntrenadorEquipo result = instance.obtenerEquipoCompleto(1);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestObtenerEquipo(){
         try{
            System.out.println("Obtener plantilla sin entrenador con el id");
            EquiposSA instance = new EquiposSAImp();
            EquipoTrans result = instance.obtenerEquipo(1);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    @Test
    public void TestNGGraficoEquiposCorrecto(){
        try{
            System.out.print("Mostrar Grafico Equipos Correcto");
            EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
            GraficoTriangular grafico = null;
            grafico.setPorcentajeA(Double.valueOf(et.getDosPorcentaje()));
            grafico.setVariableA("Tiros de 2");
            grafico.setPorcentajeB(Double.valueOf(et.getTresPorcentaje()));
            grafico.setVariableB("Tiros de 3");
            grafico.setPorcentajeC(Double.valueOf(et.getLibresPorcentaje()));
            grafico.setVariableC("Tiros Libres");
            assertNotNull(grafico);
        }catch(Exception e){
            Assert.fail();
        }
    }
    @Test
    public void TestNGGraficoEquiposNull(){
        try{
            System.out.print("Mostrar Grafico Equipos Con Null");
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
    public void TestNGGraficoEquiposVacio(){
        try{
            System.out.print("Mostrar Grafico Equipos Vacio");
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
    


