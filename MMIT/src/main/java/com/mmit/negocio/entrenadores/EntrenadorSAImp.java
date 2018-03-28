package com.mmit.negocio.entrenadores;

import com.mmit.integracion.entrenadores.EntrenadorDAO;
import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import java.util.ArrayList;


public class EntrenadorSAImp implements EntrenadorSA {

    @Override
    public ArrayList<TOAEntrenadorEquipo> listarEntrenadores() {
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EntrenadorDAO daoe = instancia.crearEntrenadoresDAO();
        EquiposDAO eDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        ArrayList<EntrenadorTrans> entrenadores = daoe.listarEntrenadores();
        
        ArrayList<TOAEntrenadorEquipo> entrenadoresConEquipo = new ArrayList<TOAEntrenadorEquipo>();
       for (EntrenadorTrans j : entrenadores){
            TOAEntrenadorEquipo entrenadorEquipo;
            
            if (j.getIdEquipo() != null){
                entrenadorEquipo = new TOAEntrenadorEquipo(j, eDao.readById(j.getIdEquipo()));
            } else {
                entrenadorEquipo = new TOAEntrenadorEquipo(j, null);
            }
            
            entrenadoresConEquipo.add(entrenadorEquipo);
        }
   
        return entrenadoresConEquipo;
    }
    
}
