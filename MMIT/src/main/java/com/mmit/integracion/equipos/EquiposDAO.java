package com.mmit.integracion.equipos;

import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;

public interface EquiposDAO {
    
    /**
     * Devuelve una lista de todos los equipos de la base de datos
     * @return lista de equipos
     */
    public ArrayList<EquipoTrans> readAll();

    /**
     * Devuelve el equipo con un determinado id
     * @param id del equipo a buscar
     * @return  datos del equipo
     */
    public EquipoTrans readById(Integer id);
    
    /**
     * Devuelve el equipo asociado a un determinado entrenador
     * @param id_Entrenador id del entrenador del equipo
     * @return equipo con ese entrenador
     */
    public EquipoTrans readByEntrenador(Integer id_Entrenador);
}
