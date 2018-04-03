package com.mmit.negocio.factoriaNegocio;

import com.mmit.negocio.entrenadores.EntrenadorSA;
import com.mmit.negocio.equipos.EquiposSA;
import com.mmit.negocio.jugadores.JugadoresSA;

abstract public class FactoriaNegocio {
    
    static private FactoriaNegocio f=null;
    
    static public FactoriaNegocio getInstancia(){
        if(f==null)
            f=new FactoriaNegocioImp();
        return f;
    }
    
    abstract public EquiposSA crearEquiposSA();

    abstract public JugadoresSA crearJugadoresSA();
    
    abstract public EntrenadorSA crearEntrenadoresSA();
}
