package com.mmit.negocio.factoriaNegocio;

import com.mmit.negocio.entrenadores.EntrenadorSA;
import com.mmit.negocio.equipos.EquiposSA;
import com.mmit.negocio.jugadores.JugadoresSA;
import com.mmit.negocio.usuarios.UsuariosSA;

abstract public class FactoriaNegocio {
    
    static private FactoriaNegocio f=null;
    
    static public FactoriaNegocio getInstancia(){
        if(f==null)
            f=new FactoriaNegocioImp();
        return f;
    }
    
    /**
     * crea un nuevo Servicio de Aplicacion de equipos
     * @return 
     */
    abstract public EquiposSA crearEquiposSA();

    /**
     * crea un nuevo Servicio de Aplicacion de jugadores
     * @return 
     */
    abstract public JugadoresSA crearJugadoresSA();
    
    /**
     * crea un nuevo Servicio de Aplicacion de entrenadores
     * @return 
     */
    abstract public EntrenadorSA crearEntrenadoresSA();
    
    /**
     * crea un nuevo Servicio de Aplicacion de usuarios
     * @return 
     */
    abstract public UsuariosSA crearUsuariosSA();
}
