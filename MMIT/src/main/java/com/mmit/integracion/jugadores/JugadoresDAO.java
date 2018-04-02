package com.mmit.integracion.jugadores;

import com.mmit.negocio.jugadores.JugadorTrans;
import java.util.ArrayList;

public interface JugadoresDAO {

    public ArrayList<JugadorTrans> readAll();
    public JugadorTrans getByID(int id_jugador);
    public ArrayList<JugadorTrans> getRoster(Integer id_equipo);
    
}
