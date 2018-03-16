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
public class Operaciones {
    
    public Operaciones(){
        
    }
    
    public int suma(int o1, int o2){
        return o1 + o2;
    }
    
    public int resta(int o1, int o2){
        return o1 - o2;
    }
    
    public int multiplicacion(int o1, int o2){
        return o1 * o2;
    }
    
    public int division(int o1, int o2){
        if (o2 == 0){
            return 0;
        } else {
            return o1/o2;
        }
    }
}
