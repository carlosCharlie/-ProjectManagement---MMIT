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
package com.mmit.negocio.jugadores;

import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.integracion.jugadores.JugadoresDAO;
import com.mmit.integracion.equipos.EquiposDAO;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class JugadoresSAImp implements JugadoresSA {

    /**
     * Devuelve la lista de jugadores
     * @return lista de jugadores
     */
    @Override
    public ArrayList<TOAJugadorEquipo> listarJugadores() {
        JugadoresDAO jDao = FactoriaIntegracion.getInstancia().crearJugadoresDAO();
        EquiposDAO eDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        ArrayList<JugadorTrans> jugadores = jDao.readAll();
        
        ArrayList<TOAJugadorEquipo> jugadoresConEquipo = new ArrayList<TOAJugadorEquipo>();
        
        for (JugadorTrans j : jugadores){
            TOAJugadorEquipo jugadorEquipo;
            
            if (j.getIdEquipo() != null){
                jugadorEquipo = new TOAJugadorEquipo(j, eDao.readById(j.getIdEquipo()));
            } else {
                jugadorEquipo = new TOAJugadorEquipo(j, null);
            }
            
            jugadoresConEquipo.add(jugadorEquipo);
        }
   
        return jugadoresConEquipo;
    }

    @Override
    public JugadorTrans getById(int id_jugador) {
        JugadoresDAO jugadoresDao = FactoriaIntegracion.getInstancia().crearJugadoresDAO();
        
        return jugadoresDao.getByID(id_jugador);
    }
    
}
