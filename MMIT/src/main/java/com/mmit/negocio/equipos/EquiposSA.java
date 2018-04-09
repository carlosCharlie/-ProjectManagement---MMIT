package com.mmit.negocio.equipos;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import java.util.ArrayList;

public interface EquiposSA {

    /**
     * Devuelve la lista de todos los equipos
     * @return lista de equipos de la base de datos
     * @throws Exception 
     */
    public ArrayList<EquipoTrans> listarEquipos() throws Exception;

    /**
     * Devuelve toda la informacion relevante a un equipo
     * @param id del equipo
     * @return TOA con equipo+entreador
     */
    public TOAEntrenadorEquipoJugadores obtenerEquipoCompleto(int id) throws Exception;
    
    /**
     * Devuelve el transfer de un equipo dado su id
     * @param id id del equipo
     * @return 
     */
    public EquipoTrans obtenerEquipo(int id);
}
