package com.mmit.negocio.factoriaNegocio;

import com.mmit.negocio.entrenadores.EntrenadorSA;
import com.mmit.negocio.equipos.EquiposSA;

abstract public class FactoriaNegocio {
    
    static private FactoriaNegocio f=null;
    
    static public FactoriaNegocio getInstacia(){
        if(f==null)
            f=new FactoriaNegocioImp();
        return f;
    }
    
    abstract public EquiposSA crearEquiposSA();

    abstract public EntrenadorSA crearEntrenadoresSA();
}
