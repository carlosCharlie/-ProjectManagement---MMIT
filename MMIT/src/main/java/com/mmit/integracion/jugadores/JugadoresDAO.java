package com.mmit.integracion.jugadores;

import com.mmit.negocio.jugadores.JugadorTrans;
import java.util.ArrayList;

public interface JugadoresDAO {

    /**
     * Devuelve una lista con todos los jugadores
     * @return lista de todos los jugadores de la base de datos
     * @throws Exception 
     */
    public ArrayList<JugadorTrans> readAll() throws Exception;
    
    /**
     * Devuelve el transfer de un jugador dada su id
     * @param id_jugador id del entrenador
     * @return transfer con los datos del entrenador
     * @throws Exception 
     */
    public JugadorTrans readByID(int id_jugador) throws Exception;
    
    /**
     * Devuelve la plantilla de un equipo dado el id del equipo
     * @param id_equipo id del equipo
     * @return lista de jugadores que juegan en ese equipo
     * @throws Exception 
     */
    public ArrayList<JugadorTrans> readRoster(Integer id_equipo) throws Exception;
    
}
