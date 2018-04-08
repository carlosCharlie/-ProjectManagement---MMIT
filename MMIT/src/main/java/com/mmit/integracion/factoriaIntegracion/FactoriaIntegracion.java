package com.mmit.integracion.factoriaIntegracion;

import com.mmit.integracion.entrenadores.EntrenadorDAO;
import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.jugadores.JugadoresDAO;
import com.mmit.integracion.usuarios.UsuariosDAO;

abstract public class FactoriaIntegracion {
    
    static private FactoriaIntegracion f=null;
    
    static public FactoriaIntegracion getInstancia(){
        if(f==null)
            f=new FactoriaIntegracionImp();
        
        return f;
    }
    
    /**
     * Crea un nuevo DAO de equipos
     * @return 
     */
    abstract public EquiposDAO crearEquiposDAO();

    /**
     * Crea un nuevo DAO de jugadores
     * @return 
     */
    abstract public JugadoresDAO crearJugadoresDAO();
    
    /**
     * Crea un nuevo DAO de entrenadores
     * @return 
     */
    abstract public EntrenadorDAO crearEntrenadoresDAO(); 
    
    /**
     * Crea un nuevo DAO de usuarios
     * @return
     */
    abstract public UsuariosDAO crearUsuariosDAO();
}
