package com.mmit.negocio.jugadores;

import java.util.ArrayList;

public interface JugadoresSA {
   
    /**
     * Devuelve la lista de todos los jugadores
     * @return 
     */
    public ArrayList<TOAJugadorEquipo> listarJugadores();
    
    /**
     * Devuelve la informacion de un jugador dada una id
     * @param id_jugador id del jugador
     * @return datos del jugador
     */
    public JugadorTrans obtenerJugador(int id_jugador);
}
