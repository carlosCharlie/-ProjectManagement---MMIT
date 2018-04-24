package com.mmit.integracion.equipos;

import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;

public interface EquiposDAO {
    
    /**
     * Devuelve una lista de todos los equipos de la base de datos
     * @return lista de equipos
     */
    public ArrayList<EquipoTrans> readAll() throws Exception;

    /**
     * Devuelve el equipo con un determinado id
     * @param id del equipo a buscar
     * @return  datos del equipo
     */
    public EquipoTrans readById(Integer id) throws Exception;
    
}
