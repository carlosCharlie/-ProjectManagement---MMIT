package com.mmit.integracion.entrenadores;

import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;


public interface EntrenadorDAO {
    
    /**
     * Devuelve una lista de todos los entrenadores
     * @return lista de todos los entrenadores en la base de datos
     * @throws Exception 
     */
     public ArrayList<EntrenadorTrans>readAll() throws Exception;
     
     /**
      * Devuelve el entrenador correspondiente al equipo
      * @param id_Equipo id del equipo
      * @return  entrenador del equipo
      */
     public EntrenadorTrans readByEquipo(int id_Equipo) throws Exception;
     
     /**
      * Devuelve el transfer de un entrenador dada su id
      * @param id id del entrenador
      * @return transfer con los datos del entrenador
      * @throws Exception 
      */
     public EntrenadorTrans readById(int id) throws Exception;
     
     /**
      * Devuelve los equipos con los que ha trabajado un entrenador
      * @param id id del entrenador
      * @return lista de equipos
      * @throws Exception 
      */
     public ArrayList<EquipoTrans> readHistoricoByEntrenador(int id) throws Exception;
     
     /**
      * Actualiza al entrenador
      * @param entrt entrenador a actualizar
      * @throws Exception 
      */
     public void update(EntrenadorTrans entrt) throws Exception;
     
     /**
      * Devuelve el transfer de un entrenador dado su nombre
      * @param nombre del entrenador
      * @return transfer con los datos del entrenador
      * @throws Exception 
      */
     public EntrenadorTrans readByNombre(String nombre) throws Exception;

}
