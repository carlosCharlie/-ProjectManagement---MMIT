package com.mmit.negocio.equipos;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class EquiposTransTestNG {
    
    public EquiposTransTestNG() {
        
    }

    @Test
    public void TestNGEquipoTrans(){
        try{
            new EquipoTrans(1, "pepe", 10, 10, 40, 40, 20, 20, 5, 6, 2, 5, 4, 12, 3, 9, 8, 3, 5);
        }catch(Exception e){
            Assert.fail();
        }
    }

    @Test
    public void getIdTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getId();
        assertEquals(result, 1);
    }
    
    @Test
    public void setIdTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setId(2);
        int result = instance.getId();
        assertEquals(result, 2);
    }
    
    @Test
    public void getNombreTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        String result = instance.getNombre();
        assertEquals(result, "pepe");
    }
    
    @Test
    public void setNombreTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setNombre("juan");
        String result = instance.getNombre();
        assertEquals(result, "juan");
    }
    
    @Test
    public void getVictoriasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getVictorias();
        assertEquals(result, 10);
    }
    
    @Test
    public void setVictoriasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setVictorias(12);
        int result = instance.getVictorias();
        assertEquals(result, 12);
    }
    
    @Test
    public void getDerrotasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getDerrotas();
        assertEquals(result, 10);
    }
    
    @Test
    public void setDerrotasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setDerrotas(12);
        int result = instance.getDerrotas();
        assertEquals(result, 12);
    }
    
    @Test
    public void getJugadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getJugados();
        assertEquals(result, 20);
    }
    
    @Test
    public void setJugadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setJugados(22);
        int result = instance.getJugados();
        assertEquals(result, 22);
    }
    
    @Test
    public void getPorcentajeTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        String result = instance.getPorcentaje();
        assertEquals(result, "50,00");
    }
    
    @Test
    public void getAnotadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getAnotados();
        assertEquals(result, 10);
    }
    
    @Test
    public void setAnotadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setAnotados(6);
        int result = instance.getAnotados();
        assertEquals(result, 6);
    }
    
    
    @Test
    public void getRecibidosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getRecibidos();
        assertEquals(result, 10);
    }
    
    @Test
    public void setRecibidosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setRecibidos(8);
        int result = instance.getRecibidos();
        assertEquals(result, 8);
    }
    
    @Test
    public void getCampoAnotadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getCampoAnotados();
        assertEquals(result, 10);
    }
    
    @Test
    public void setCampoAnotadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setCampoAnotados(8);
        int result = instance.getCampoAnotados();
        assertEquals(result, 8);
    }
    
    @Test
    public void getCampoIntentadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getCampoIntentados();
        assertEquals(result, 10);
    }
    
    @Test
    public void setCampoIntentadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setCampoIntentados(8);
        int result = instance.getCampoIntentados();
        assertEquals(result, 8);
    }
    
    @Test
    public void getCampoFalladosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getCampoFallados();
        assertEquals(result, 0);
    }
    
    @Test
    public void setCampoFalladosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setCampoFallados(8);
        int result = instance.getCampoFallados();
        assertEquals(result, 8);
    }
    
    @Test
    public void getCampPorcentajeFalladosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        double result = Double.valueOf(instance.getCampoPorcentaje());
        assertEquals(result, "50,00");
    }
    
    @Test
    public void getCampoPorcentajeTestNG2(){
    	EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        double result = Double.valueOf(instance.getCampoPorcentaje());
        assertEquals(result, 0.0);
    }
    
    @Test
    public void getDosIntentadosTestNG(){
    	EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getDosIntentados();
        assertEquals(result, 5);
    
    }
    
    @Test
    public void getDosPorcentajeTestNG(){
    	EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 20, 20, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        double result = Double.valueOf(instance.getDosPorcentaje());
        assertEquals(result, "50,00");
    
    }
    
    @Test
    public void getDosPorcentajeTestN2G(){
    	EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        double result = Double.valueOf(instance.getDosPorcentaje());
        assertEquals(result, 0.0);
    
    }
    
    @Test
    public void getTresAnotadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getTresAnotados();
        assertEquals(result, 10);
    }
    
    @Test
    public void setTresAnotadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setTresAnotados(12);
        int result = instance.getTresAnotados();
        assertEquals(result, 12);
    }
    
    @Test
    public void getTresIntentadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getTresAnotados();
        assertEquals(result, 10);
    }
    
    @Test
    public void setTresIntentadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setTresIntentados(12);
        int result = instance.getTresIntentados();
        assertEquals(result, 12);
    }
    
    @Test
    public void getTresFalladosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getTresFallados();
        assertEquals(result, 0);
    }
    
    @Test
    public void setTresFalladosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setTresFallados(12);
        int result = instance.getTresFallados();
        assertEquals(result, 12);
    }
    
    @Test
    public void getTresPorcentajeTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        double result = Double.valueOf(instance.getTresPorcentaje());
        assertEquals(result, "50,00");
    }
    
    @Test
    public void getTresPorcentajeTestNG2(){
    	EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        double result = Double.valueOf(instance.getTresPorcentaje());
        assertEquals(result, 0.0);
    }
    
    @Test
    public void getLibresAnotadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getLibresAnotados();
        assertEquals(result, 10);
    }
    
    @Test
    public void setLibresAnotadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setLibresAnotados(12);
        int result = instance.getLibresAnotados();
        assertEquals(result, 12);
    }
    
    @Test
    public void getLibresIntentadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getLibresIntentados();
        assertEquals(result, 10);
    }
    
    @Test
    public void setLibresIntentadosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setLibresIntentados(12);
        int result = instance.getLibresIntentados();
        assertEquals(result, 12);
    }
    
    @Test
    public void getLibresFalladosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getLibresFallados();
        assertEquals(result, 0);
    }
    
    @Test
    public void setLibresFalladosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setLibresFallados(12);
        int result = instance.getLibresFallados();
        assertEquals(result, 12);
    }
    
    @Test
    public void getLibresPorcentajeTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        double result = Double.valueOf(instance.getLibresPorcentaje());
        assertEquals(result, 100.0);
    }
    @Test
    public void getLibresPorcentajeTestNG2(){
    	EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 0, 10, 10, 10, 10, 10, 10, 10, 10);
        double result = Double.valueOf(instance.getLibresPorcentaje());
        assertEquals(result, 0.0);
    }
        
    @Test
    public void getRebotesOfensivosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getRebotesOfensivos();
        assertEquals(result, 10);
    }
    
    @Test
    public void setRebotesOfensivosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setRebotesOfensivos(12);
        int result = instance.getRebotesOfensivos();
        assertEquals(result, 12);
    }
    
    @Test
    public void getRebotesDefensivosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getRebotesDefensivos();
        assertEquals(result, 0);
    }
    
    @Test
    public void setRebotesDefensivosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setRebotesDefensivos(12);
        int result = instance.getRebotesDefensivos();
        assertEquals(result, 12);
    }
    
    @Test
    public void getRebotesTotalesTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getRebotesTotales();
        assertEquals(result, 10);
    }
    
    @Test
    public void setRebotesTotalesTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setRebotesTotales(12);
        int result = instance.getRebotesTotales();
        assertEquals(result, 12);
    }
    
    @Test
    public void getAsistenciasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getAsistencias();
        assertEquals(result, 10);
    }
    
    @Test
    public void setAsistenciasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setAsistencias(12);
        int result = instance.getAsistencias();
        assertEquals(result, 12);
    }
    
    @Test
    public void getRobosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getRobos();
        assertEquals(result, 10);
    }
    
    @Test
    public void setRobosTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setRobos(12);
        int result = instance.getRobos();
        assertEquals(result, 12);
    }
    
    @Test
    public void getFaltasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getFaltas();
        assertEquals(result, 10);
    }
    
    @Test
    public void setFaltasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setFaltas(12);
        int result = instance.getFaltas();
        assertEquals(result, 12);
    }
    
    @Test
    public void getTaponesTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getTapones();
        assertEquals(result, 10);
    }
    
    @Test
    public void setTaponesTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setTapones(12);
        int result = instance.getTapones();
        assertEquals(result, 12);
    }
    
    @Test
    public void getPerdidasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        int result = instance.getPerdidas();
        assertEquals(result, 10);
    }
    
    @Test
    public void setPerdidasTestNG(){
        EquipoTrans instance = new EquipoTrans(1, "pepe", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        instance.setPerdidas(12);
        int result = instance.getPerdidas();
        assertEquals(result, 12);
    }
    
}