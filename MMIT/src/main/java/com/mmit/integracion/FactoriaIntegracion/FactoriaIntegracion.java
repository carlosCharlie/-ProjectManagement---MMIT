/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.integracion.FactoriaIntegracion;

import com.mmit.integracion.equipos.EquiposDAO;

/**
 *
 * @author carlos
 */
abstract public class FactoriaIntegracion {
    
    static private FactoriaIntegracion f=null;
    
    static public FactoriaIntegracion getInstancia(){
        if(f==null)
            f=new FactoriaIntegracionImp();
        
        return f;
    }
    abstract public EquiposDAO crearEquiposDAO();
}
