package com.mmit.integracion.entrenadores;

import com.mmit.negocio.entrenadores.EntrenadorTrans;
import java.util.ArrayList;


public interface EntrenadorDAO {
    
     public ArrayList<EntrenadorTrans>readAll();
     
     /**
      * Devuelve el entrenador correspondiente al equipo
      * @param id_Equipo id del equipo
      * @return  entrenador del equipo
      */
     public EntrenadorTrans readByEquipo(int id_Equipo);
     
     public EntrenadorTrans readById(int id);
}
