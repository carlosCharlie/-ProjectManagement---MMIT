package com.mmit.integracion.FactoriaIntegracion;

import com.mmit.integracion.equipos.EquiposDAO;

abstract public class FactoriaIntegracion {
    
    static private FactoriaIntegracion f=null;
    
    static public FactoriaIntegracion getInstancia(){
        if(f==null)
            f=new FactoriaIntegracionImp();
        
        return f;
    }
    abstract public EquiposDAO crearEquiposDAO();
}
