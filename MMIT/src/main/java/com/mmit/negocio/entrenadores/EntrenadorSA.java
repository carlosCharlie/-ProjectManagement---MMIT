package com.mmit.negocio.entrenadores;

import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;


public interface EntrenadorSA {
    
    /**
     * Devuelve una lista de todos los entrenadores
     * @return lista de todos los entrenadores de la base de datos
     * @throws Exception 
     */
    public ArrayList<TOAEntrenadorEquipo> listarEntrenadores() throws Exception;
    
    /**
     * Devuelve un TOA con (transfer object assembler) con el entrenador y el equipo que entrena
     * @param id id del entrenador
     * @return transfer object assembler con los datos del equipo y el entrenador
     * @throws Exception 
     */
    public TOAEntrenadorEquipo obtenerEntrenadorCompleto(Integer id) throws Exception;
    
    /**
     * Devuelve un transfer de entrenador dado su id
     * @param id id del entrenador
     * @return transfer con datos del entrenador
     * @throws Exception 
     */
    public EntrenadorTrans obtenerEntrenador(Integer id) throws Exception;
    
    /**
     * Devuelve los equipos que ha entrenado el entrenador
     * @param id id del entrenador
     * @return lista de equipos
     * @throws Exception 
     */
    public ArrayList<EquipoTrans> obtenerHistoricoEquipos(int id) throws Exception;
}
