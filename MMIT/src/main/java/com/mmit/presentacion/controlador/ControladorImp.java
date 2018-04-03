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
            case ObtenerDatosEquipo:
                equiposSa = FactoriaNegocio.getInstacia().crearEquiposSA(); 
                contexto.setDatos(equiposSa.getById((int) contexto.getDatos()));
                break;
            case ObtenerDatosJugador:
                jugadoresSa = FactoriaNegocio.getInstacia().crearJugadoresSA(); 
                JugadorTrans jug = jugadoresSa.getById((int) contexto.getDatos());
                equiposSa = FactoriaNegocio.getInstacia().crearEquiposSA();
                EquipoTrans eq = equiposSa.obtenerEquipoPorId(jug.getIdEquipo());
                contexto.setDatos(new TOAJugadorEquipo(jug, eq));
                break;
        }
    }
    
}
