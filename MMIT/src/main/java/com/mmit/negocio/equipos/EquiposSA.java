package com.mmit.negocio.equipos;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import java.util.ArrayList;

public interface EquiposSA {

    public ArrayList<EquipoTrans> listarEquipos();

    /**
     * Devuelve toda la informacion relevante a un equipo
     * @param id del equipo
     * @return TOA con equipo+entreador
     */
    public TOAEntrenadorEquipoJugadores getById(int id);
    
    public EquipoTrans obtenerEquipoPorId(int id);
}
