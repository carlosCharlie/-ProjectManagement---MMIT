package com.mmit.integracion.entrenadores;

import com.mmit.negocio.entrenadores.EntrenadorTrans;
import java.util.ArrayList;


public interface EntrenadorDAO {
    
     public ArrayList<EntrenadorTrans>readAll() throws Exception;
     
     /**
      * Devuelve el entrenador correspondiente al equipo
      * @param id_Equipo id del equipo
      * @return  entrenador del equipo
      */
     public EntrenadorTrans readByEquipo(int id_Equipo) throws Exception;
     
     public EntrenadorTrans readById(int id) throws Exception;
     
     public ArrayList<EntrenadorTrans> equiposEntrenador(int id) throws Exception;
}
