package com.mmit.integracion.jugadores;

import com.mmit.negocio.jugadores.JugadorTrans;
import java.util.ArrayList;

public interface JugadoresDAO {

    public ArrayList<JugadorTrans> readAll() throws Exception;
    public JugadorTrans readByID(int id_jugador) throws Exception;
    public ArrayList<JugadorTrans> readRoster(Integer id_equipo) throws Exception;
    
}
