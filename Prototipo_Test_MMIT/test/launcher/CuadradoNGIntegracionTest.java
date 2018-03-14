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
public class CuadradoNGIntegracionTest {
    
    public CuadradoNGIntegracionTest() {
    }

    @Test(groups = {"funcTest"})
    public void TestCalculaAreaConSuma(){
        System.out.println("Area con Suma del Cuadrado");
        Operaciones op = new Operaciones();
        int expResult = 400;
        int op1 = 10;
        int op2 = 10;
        Cuadrado instance = new Cuadrado(op.suma(op1, op2));
        int result = instance.CalcularArea();
        Assert.assertEquals(expResult, result);
    }
    
    @Test(groups = {"funcTest"})
    public void TestCalculaPerimetroConMultiplicacion(){
        System.out.println("Perimetro con Multiplicacion del Cuadrado");
        Operaciones op = new Operaciones();
        int expResult = 100;
        int op1 = 5;
        int op2 = 5;
        Cuadrado instance = new Cuadrado(op.multiplicacion(op1, op2));
        int result = instance.CalcularPerimetro();
        Assert.assertEquals(expResult, result);
    }
    
}
