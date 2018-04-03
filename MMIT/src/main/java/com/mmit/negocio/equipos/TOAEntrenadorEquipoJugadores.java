/*
 * Copyright (C) 2018 Your Organisation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mmit.negocio.equipos;

import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.negocio.jugadores.JugadorTrans;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class TOAEntrenadorEquipoJugadores extends TOAEntrenadorEquipo {

    private ArrayList<JugadorTrans>jugadores;
    
    public TOAEntrenadorEquipoJugadores(EntrenadorTrans entrenador, EquipoTrans equipo, ArrayList<JugadorTrans> jugadores) {
        super(entrenador, equipo);
        this.jugadores=jugadores;
    }
    
     public void setJugadores(ArrayList<JugadorTrans> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<JugadorTrans> getJugadores() {
        return jugadores;
    }
    
}
