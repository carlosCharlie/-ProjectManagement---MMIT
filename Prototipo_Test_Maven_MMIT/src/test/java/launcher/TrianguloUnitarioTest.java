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
public class TrianguloUnitarioTest {
    
    public TrianguloUnitarioTest() {
    }

    @Test
    public void testCalculaArea() {
        System.out.println("Area del Triangulo");
        Triangulo instance = new Triangulo(2,5);
        int expResult = 5;
        int result = instance.CalculaArea();
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testErrorCalculaArea() {
        System.out.println("Error en Area del Triangulo");
        Triangulo instance = new Triangulo(2,5);
        int expResult = 66;
        int result = instance.CalculaArea();
        Assert.assertNotEquals(expResult, result);
    }
    
}
