/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

/**
 *
 * @author crash
 */
public class Cuadrado {
    
    private int lado;
    private int area;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    public int CalcularArea(){
        this.area = this.lado * this.lado;
        return this.area;
    }
    
    public int CalcularPerimetro(){
        return this.lado * 4;
    }
}
