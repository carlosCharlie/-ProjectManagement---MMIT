package com.mmit.presentacion.comando.jugadores;

import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.jugadores.JugadorTrans;
import com.mmit.negocio.jugadores.TOAJugadorEquipo;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoAbrirMostrarJugador implements Comando{

    @Override
    public Contexto execute(Object datos) {
        try{
            JugadorTrans jugador = FactoriaNegocio.getInstancia().crearJugadoresSA().obtenerJugador((int) datos);
            EquipoTrans equipo = FactoriaNegocio.getInstancia().crearEquiposSA().obtenerEquipo(jugador.getIdEquipo());
            TOAJugadorEquipo toa = new TOAJugadorEquipo(jugador, equipo);
            return new Contexto(Evento.AbrirMostrarJugador, toa);
        }catch (Exception ex){
            return new Contexto(Evento.ErrorSQL, null);
        }
    }
 
}
