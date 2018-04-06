package com.mmit.negocio.equipos;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import java.util.ArrayList;

public interface EquiposSA {

    public ArrayList<EquipoTrans> listarEquipos() throws Exception;

    /**
     * Devuelve toda la informacion relevante a un equipo
     * @param id del equipo
     * @return TOA con equipo+entreador
     */
    public TOAEntrenadorEquipoJugadores obtenerEquipoCompleto(int id) throws Exception;
    
    public EquipoTrans obtenerEquipo(int id);
}
