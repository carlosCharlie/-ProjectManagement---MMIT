/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import org.junit.Test;
import org.testng.Assert;
/**
 *
 * @author crash
 */

public class OperacionesUnitarioTest {
    
    public OperacionesUnitarioTest() {
    }

    @Test
    public void testSuma() {
        System.out.println("Suma");
        int o1 = 6;
        int o2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 11;
        int result = instance.suma(o1, o2);
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testSumaError() {
        System.out.println("Error en Suma");
        int o1 = 3;
        int o2 = 3;
        Operaciones instance = new Operaciones();
        int expResult = 33;
        int result = instance.suma(o1, o2);
        Assert.assertNotEquals(expResult, result);
    }
    
    @Test
    public void testSumaFallo() {
        System.out.println("Fallo en Suma");
        int o1 = 3;
        int o2 = 3;
        Operaciones instance = new Operaciones();
        int expResult = 33;
        int result = instance.suma(o1, o2);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testResta() {
        System.out.println("Resta");
        int o1 = 6;
        int o2 = 6;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.resta(o1, o2);
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testRestaError() {
        System.out.println("Error en Resta");
        int o1 = 6;
        int o2 = 6;
        Operaciones instance = new Operaciones();
        int expResult = 99;
        int result = instance.resta(o1, o2);
        Assert.assertNotEquals(expResult, result);
    }
    
    @Test
    public void testRestaFallo() {
        System.out.println("Fallo en Resta");
        int o1 = 6;
        int o2 = 6;
        Operaciones instance = new Operaciones();
        int expResult = 99;
        int result = instance.resta(o1, o2);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int o1 = 5;
        int o2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 25;
        int result = instance.multiplicacion(o1, o2);
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testMultiplicacionNoIgual() {
        System.out.println("Error en Multiplicacion");
        int o1 = 5;
        int o2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 10;
        int result = instance.multiplicacion(o1, o2);
        Assert.assertNotEquals(expResult, result);
    }
    
    @Test
    public void testMultiplicacionFallo() {
        System.out.println("Fallo en Multiplicacion");
        int o1 = 5;
        int o2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 10;
        int result = instance.multiplicacion(o1, o2);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testDivision() {
        System.out.println("Division");
        int o1 = 100;
        int o2 = 100;
        Operaciones instance = new Operaciones();
        int expResult = 1;
        int result = instance.division(o1, o2);
        Assert.assertEquals(expResult, result);
    }
    
    
    @Test
    public void testDivisionEntreCero() {
        System.out.println("Division entre cero");
        int o1 = 100;
        int o2 = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.division(o1, o2);
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testDivisionNoIgual() {
        System.out.println("Error en Division");
        int o1 = 100;
        int o2 = 100;
        Operaciones instance = new Operaciones();
        int expResult = 50;
        int result = instance.division(o1, o2);
        Assert.assertNotEquals(expResult, result);
    }    
    
    @Test
    public void testDivisionFallo() {
        System.out.println("Fallo en Division");
        int o1 = 100;
        int o2 = 100;
        Operaciones instance = new Operaciones();
        int expResult = 50;
        int result = instance.division(o1, o2);
        Assert.assertEquals(expResult, result);
    }
    
}
