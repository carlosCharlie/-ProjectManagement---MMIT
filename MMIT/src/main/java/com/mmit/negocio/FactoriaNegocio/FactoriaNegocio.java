package com.mmit.negocio.FactoriaNegocio;

import com.mmit.negocio.equipos.EquiposSA;

abstract public class FactoriaNegocio {
    
    static private FactoriaNegocio f=null;
    
    static public FactoriaNegocio getInstacia(){
        if(f==null)
            f=new FactoriaNegocioImp();
        return f;
    }
    
    abstract public EquiposSA crearEquiposSA();
}
