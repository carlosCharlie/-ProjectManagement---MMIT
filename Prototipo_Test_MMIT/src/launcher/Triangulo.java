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
public class Triangulo {
    
    private int base;
    private int altura;
    private int area;
    
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public int CalculaArea(){
        this.area = this.base * this.altura / 2;
        return this.area;
    }
}
