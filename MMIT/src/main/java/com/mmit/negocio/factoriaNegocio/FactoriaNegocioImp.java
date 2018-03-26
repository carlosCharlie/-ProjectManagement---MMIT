package com.mmit.negocio.factoriaNegocio;

import com.mmit.negocio.entrenadores.EntrenadorSA;
import com.mmit.negocio.entrenadores.EntrenadorSAImp;
import com.mmit.negocio.equipos.EquiposSA;
import com.mmit.negocio.equipos.EquiposSAImp;
import com.mmit.negocio.jugadores.JugadoresSA;
import com.mmit.negocio.jugadores.JugadoresSAImp;

class FactoriaNegocioImp extends FactoriaNegocio {

    public FactoriaNegocioImp() {
    }

    @Override
    public EquiposSA crearEquiposSA() {
        return new EquiposSAImp();
    }
    
    @Override
    public JugadoresSA crearJugadoresSA() {
        return new JugadoresSAImp();
    }
    
    @Override
    public EntrenadorSA crearEntrenadoresSA() {
        return new EntrenadorSAImp(); 
    }
    
}
