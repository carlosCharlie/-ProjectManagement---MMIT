package com.mmit.presentacion.controlador;

import com.mmit.negocio.entrenadores.EntrenadorSA;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.equipos.EquiposSA;
import com.mmit.negocio.jugadores.JugadoresSA;

public class ControladorImp extends Controlador{

    @Override
    public void accion(Contexto contexto) {
        switch(contexto.getEvento()){
            case ListarEquipos:
                EquiposSA equiposSa = FactoriaNegocio.getInstacia().crearEquiposSA();
                contexto.setDatos(equiposSa.listarEquipos());
                break;
            case ListarJugadores:
                JugadoresSA jugadoresSa = FactoriaNegocio.getInstacia().crearJugadoresSA();
                contexto.setDatos(jugadoresSa.listarJugadores());
                break;
            case ListarEntrenadores:
                EntrenadorSA entrenadorSa = FactoriaNegocio.getInstacia().crearEntrenadoresSA();
                contexto.setDatos(entrenadorSa.listarEntrenadores());
                break;
        }
    }
    
}
