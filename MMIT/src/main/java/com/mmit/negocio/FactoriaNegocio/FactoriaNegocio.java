/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.negocio.FactoriaNegocio;

import com.mmit.negocio.equipos.EquiposSA;



/**
 *
 * @author carlos
 */
abstract public class FactoriaNegocio {
    
    static private FactoriaNegocio f=null;
    
    static public FactoriaNegocio getInstacia(){
        if(f==null)
            f=new FactoriaNegocioImp();
        return f;
    }
    
    abstract public EquiposSA crearEquiposSA();
}
