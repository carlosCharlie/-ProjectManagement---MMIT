package com.mmit.presentacion.controlador;

import com.mmit.negocio.entrenadores.EntrenadorSA;
import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.equipos.EquiposSA;
import com.mmit.negocio.jugadores.JugadorTrans;
import com.mmit.negocio.jugadores.JugadoresSA;
import com.mmit.negocio.jugadores.TOAJugadorEquipo;

public class ControladorImp extends Controlador{

    @Override
    public void accion(Contexto contexto) {
        switch(contexto.getEvento()){
            case ListarEquipos:
                EquiposSA equiposSa = FactoriaNegocio.getInstancia().crearEquiposSA();
                contexto.setDatos(equiposSa.listarEquipos());
                break;
            case ListarJugadores:
                JugadoresSA jugadoresSa = FactoriaNegocio.getInstancia().crearJugadoresSA();
                contexto.setDatos(jugadoresSa.listarJugadores());
                break;
            case ListarEntrenadores:
                EntrenadorSA entrenadorSa = FactoriaNegocio.getInstancia().crearEntrenadoresSA();
                contexto.setDatos(entrenadorSa.listarEntrenadores());
                break;
            case ObtenerDatosEquipo:
                equiposSa = FactoriaNegocio.getInstancia().crearEquiposSA(); 
                contexto.setDatos(equiposSa.obtenerEquipoCompleto((int) contexto.getDatos()));
                break;
            case ObtenerDatosJugador:
                jugadoresSa = FactoriaNegocio.getInstancia().crearJugadoresSA(); 
                equiposSa = FactoriaNegocio.getInstancia().crearEquiposSA();
                
                JugadorTrans jug = jugadoresSa.obtenerJugador((int) contexto.getDatos());
                EquipoTrans eq = equiposSa.obtenerEquipo(jug.getIdEquipo());
                
                contexto.setDatos(new TOAJugadorEquipo(jug, eq));
                break;
        }
    }
    
}
