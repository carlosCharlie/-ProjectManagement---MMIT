package com.mmit.negocio.jugadores;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;


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
            new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestNGGetId(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getId();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGSetId(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setId(2);
        int result = instance.getId();
        assertEquals(result, 2);
    }
    
    @Test
    public void TestNGGetNombre(){
       JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
       String result = instance.getNombre();
       assertEquals(result, "manolo");
    }
    
    @Test
    public void TestNGSetNombre(){
       JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
       instance.setNombre("pepe");
       String result = instance.getNombre();
       assertEquals(result, "pepe");
    }
    
    @Test
    public void TestNGGetApellidos(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        String result = instance.getApellidos();
        assertEquals(result, "juarez");
    }
    
    @Test
    public void TestNGSetApellidos(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setApellidos("perez");
        String result = instance.getApellidos();
        assertEquals(result, "perez");
    }
    
    @Test
    public void TestNGGetIdEquipo(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getIdEquipo();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNSGetIdEquipo(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 1, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setIdEquipo(2);
        int result = instance.getIdEquipo();
        assertEquals(result, 2);
    }
    
    @Test
    public void TestNGgetEdad() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getEdad();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNSgetEdad() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setEdad(18);
        int result = instance.getEdad();
        assertEquals(result, 18);
    }
    
    @Test
    public void TestNGgetPeso() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        double result = instance.getPeso();
        assertEquals(result, 10.0);
    }
    
    @Test
    public void TestNSgetPeso() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setPeso(80.68);
        double result = instance.getPeso();
        assertEquals(result, 80.68);
    }

    @Test
    public void TestNGgetAltura() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        double result = instance.getAltura();
        assertEquals(result, 10.0);
    }
    
    @Test
    public void TestNSgetAltura() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setAltura(180.5);
        double result = instance.getAltura();
        assertEquals(result, 180.5);
    }
    
    @Test
    public void TestNGgetPosicion() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        String result = instance.getPosicion();
        assertEquals(result, "Alero");
    }
    
    @Test
    public void TestNSgetPosicion() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setPosicion("Base");
        String result = instance.getPosicion();
        assertEquals(result, "Base");
    }
    
    @Test
    public void TestNGgetPartidos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getPartidos();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetPartidos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setPartidos(1);
        int result = instance.getPartidos();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetMinutos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getMinutos();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetMinutos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setMinutos(1);
        int result = instance.getMinutos();
        assertEquals(result, 1);
    }
    

    @Test
    public void TestNGgetCamposAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getCampoAnotados();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetCamposAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setCampoAnotados(12);
        int result = instance.getCampoAnotados();
        assertEquals(result, 12);
    }
    
    @Test
    public void TestNGgetCamposIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getCampoIntentados();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetCamposIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setCampoIntentados(12);
        int result = instance.getCampoIntentados();
        assertEquals(result, 12);
    }
    

    @Test
    public void TestNGgetCampoPorcentaje() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        double result = Double.valueOf(instance.getCampoPorcentaje());
        assertEquals(result, 100.0);
    }
    
    @Test
    public void TestNGSetCampoPorcentaje() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setCampoPorcentaje(10.0);
        double result = Double.valueOf(instance.getCampoPorcentaje());
        assertEquals(result, 10.0);
    }
    
    @Test
    public void TestNGGetDosAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getDosAnotados();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetDosAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setDosAnotados(12);
        int result = instance.getDosAnotados();
        assertEquals(result, 12);
    }
    
    @Test
    public void TestNGGetDosIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getDosIntentados();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetDosIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setDosIntentados(12);
        int result = instance.getDosIntentados();
        assertEquals(result, 12);
    }
    
    @Test
    public void TestNGgeDosPorcentaje(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        double result = Double.valueOf(instance.getDosPorcentaje());
        assertEquals(result, 100.0);
    }
    
    @Test
    public void TestNSgeDosPorcentaje(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setDosPorcentaje(10.0);
        double result = Double.valueOf(instance.getDosPorcentaje());
        assertEquals(result, 10.0);
    }
    
    @Test
    public void TestNGgetTresAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getTresAnotados();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNSgetTresAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setTresAnotados(1);
        int result = instance.getTresAnotados();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGGetTresIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getTresIntentados();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetTresIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setTresIntentados(12);
        int result = instance.getTresIntentados();
        assertEquals(result, 12);
    }
    
    @Test
    public void TestNGgeTresPorcentaje(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        double result = Double.valueOf(instance.getTresPorcentaje());
        assertEquals(result, 100.0);
    }
    
    @Test
    public void TestNSgeTresPorcentaje(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setTresPorcentaje(10.0);
        double result = Double.valueOf(instance.getTresPorcentaje());
        assertEquals(result, 10.0);
    }
    
    
    @Test
    public void TestNGgetLibresAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getLibresAnotados();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetLibresAnotados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setLibresAnotados(1);
        int result = instance.getLibresAnotados();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetLibresIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getLibresIntentados();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetLibresIntentados() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setLibresIntentados(1);
        int result = instance.getLibresIntentados();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetLibresPorcentaje() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        double result = instance.getLibresIntentados();
        assertEquals(result, 10.0);
    }
    
    @Test
    public void TestNGSetLibresPorcentaje() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setLibresPorcentaje(20.0);
        double result = Double.valueOf(instance.getLibresPorcentaje());
        assertEquals(result, 20.0);
    }   
        
    @Test   
    public void TestNGgetRebotesOfensivos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getRebotesOfensivos();
        assertEquals(result, 10);
    }
    
    @Test   
    public void TestNGSetRebotesOfensivos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setRebotesOfensivos(1);
        int result = instance.getRebotesOfensivos();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetRebotesDefensivos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getRebotesDefensivos();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetRebotesDefensivos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setRebotesDefensivos(1);
        int result = instance.getRebotesDefensivos();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetRebotesTotales() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getRebotesTotales();
        assertEquals(result, 20);
    }
    
    @Test
    public void TestNGSetRebotesTotales() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setRebotesTotales(1);
        int result = instance.getRebotesTotales();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetAsistencias() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getAsistencias();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetAsistencias() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setAsistencias(1);
        int result = instance.getAsistencias();
        assertEquals(result, 1);
    }

    @Test
    public void TestNGgetRobos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getRobos();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetRobos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setRobos(1);
        int result = instance.getRobos();
        assertEquals(result, 1);
    }

	
    @Test
    public void getFaltas() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getFaltas();
        assertEquals(result, 10);
    }
    
    @Test
    public void setFaltas() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setFaltas(1);
        int result = instance.getFaltas();
        assertEquals(result, 1);
    }

	
    @Test
    public void TestNGgetPuntos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getPuntos();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetPuntos() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setPuntos(1);
        int result = instance.getPuntos();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetTapones() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getTapones();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetTapones() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setTapones(1);
        int result = instance.getTapones();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetPerdidas() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        int result = instance.getPerdidas();
        assertEquals(result, 10);
    }
    
    @Test
    public void TestNGSetPerdidas() {
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setPerdidas(1);
        int result = instance.getPerdidas();
        assertEquals(result, 1);
    }
    
    @Test
    public void TestNGgetMano(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        String result = instance.getMano();
        assertEquals(result, "derecha");
    }
    
    @Test
    public void TestNGSetMano(){
        JugadorTrans instance =  new JugadorTrans(1, "manolo", "juarez", 10, 10, 10.0, 10.0, "Alero", 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, "derecha");
        instance.setMano("izquierda");
        String result = instance.getMano();
        assertEquals(result, "izquierda");
    }
    
    
}
