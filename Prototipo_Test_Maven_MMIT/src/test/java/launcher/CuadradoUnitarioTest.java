/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import org.testng.Assert;
import org.testng.annotations.Test;



/**
 *
 * @author crash
 */
public class CuadradoUnitarioTest {
    
    public CuadradoUnitarioTest() {
    }

    @Test
    public void testCalcularArea() {
        System.out.println("Area del Cuadrado");
        Cuadrado instance = new Cuadrado(5);
        int expResult = 25;
        int result = instance.CalcularArea();
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testNoCalcularArea() {
        System.out.println("No Area del Cuadrado");
        Cuadrado instance = new Cuadrado(5);
        int expResult = 50;
        int result = instance.CalcularArea();
        Assert.assertNotEquals(expResult, result);
    }

    @Test
    public void testCalcularPerimetro() {
        System.out.println("Perimetro del Cuadrado");
        Cuadrado instance = new Cuadrado(10);
        int expResult = 40;
        int result = instance.CalcularPerimetro();
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testErrorCalcularPerimetro() {
        System.out.println("Error del Perimetro del Cuadrado");
        Cuadrado instance = new Cuadrado(10);
        int expResult = 50;
        int result = instance.CalcularPerimetro();
        Assert.assertNotEquals(expResult, result);
    }
    
}
