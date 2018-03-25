package com.mmit.integracion.Conexion;

import com.mmit.integracion.conexion.Conexion;
import java.sql.Connection;
import static org.testng.Assert.*;

public class ConexionNGTest {
    
    public ConexionNGTest() {
    }

    /**
     * Test of getConexion method, of class Conexion.
     */
    @org.testng.annotations.Test
    public void testGetConexion() {
        System.out.println("getConexion");
        Conexion expResult = null;
        Conexion result = Conexion.getInstancia();
        assertNotEquals(result, expResult);

    }

    /**
     * Test of abrir method, of class Conexion.
     */
    @org.testng.annotations.Test
    public void testAbrir() {
        System.out.println("abrir");
        Conexion instance = Conexion.getInstancia();
        instance.abrir();
        
    }

    /**
     * Test of cerrar method, of class Conexion.
     */
    @org.testng.annotations.Test
    public void testCerrar() {
        System.out.println("cerrar");
        Conexion instance = Conexion.getInstancia();
        instance.cerrar();

    }

    /**
     * Test of getResource method, of class Conexion.
     */
    @org.testng.annotations.Test
    public void testGetResource() {
        System.out.println("getResource");
        Conexion instance = Conexion.getInstancia();
        Connection expResult = null;
        Connection result = instance.getResource();
        assertEquals(result, expResult);
    }
    
}
