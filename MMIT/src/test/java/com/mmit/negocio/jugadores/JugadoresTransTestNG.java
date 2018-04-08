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

import java.text.DecimalFormat;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class JugadoresTransTestNG {
    
    public JugadoresTransTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void TestNGJugadorTrans(){
        try{
            new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 34, 360, 28, 30, 34, 86, 38, 78, 65, 20, 30, 1000, 30, 28, "derecha");
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestNGGetId(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getId();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGGetNombre(){
       JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
       String result = instance.getNombre();
       assertEquals(result, "manolo");
    }
    
    @Test
    public void TestNGGetApellidos(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        String result = instance.getApellidos();
        assertEquals(result, "juarez");
    }
    
    @Test
    public void TestNGGetIdEquipo(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getIdEquipo();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetEdad() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getEdad();
        assertEquals(result, 18);
    }
    
    @Test
    public void TestNGgetPeso() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        double result = instance.getPeso();
        assertEquals(result, 80.68);
    }

    @Test
    public void TestNGgetAltura() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        double result = instance.getAltura();
        assertEquals(result, 180.5);
    }
    
    @Test
    public void TestNGgetPosicion() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        String result = instance.getPosicion();
        assertEquals(result, "Alero");
    }
    
    @Test
    public void TestNGgetPartidos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getPartidos();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetMinutos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getMinutos();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetTirosAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getTirosAnotados();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetTirosIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getTirosTotales();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetTirosPorcentaje() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        double result = instance.getTirosPorcentaje();
        assertEquals(result, 100.0);
    }
    
    @Test
    public void TestNGgetLibresAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getLibresAnotados();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetLibresIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getLibresIntentados();
        assertEquals(result, 1);
    }
    

    public void TestNGgetLibresPorcentaje() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        double result = instance.getLibresIntentados();
        assertEquals(result, 100.0);
    }
        
    @Test   
    public void TestNGgetRebotesOfensivos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getRebotesOfensivos();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetRebotesDefensivos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getRebotesDefensivos();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetRebotesTotales() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getRebotesTotales();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetAsistencias() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getAsistencias();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetRobos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getRobos();
        assertEquals(result, 1);
    }

	
    @Test
    public void getFaltas() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getFaltas();
        assertEquals(result, 1);
    }

	
    @Test
    public void TestNGgetPuntos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getPuntos();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetTapones() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getTapones();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetPerdidas() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        int result = instance.getPerdidas();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetMano(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "derecha");
        String result = instance.getMano();
        assertEquals(result, "derecha");
    }
    
    
}
