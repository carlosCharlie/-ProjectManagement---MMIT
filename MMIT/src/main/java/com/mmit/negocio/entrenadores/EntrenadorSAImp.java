package com.mmit.negocio.entrenadores;

import com.mmit.integracion.entrenadores.EntrenadorDAO;
import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import java.util.ArrayList;


public class EntrenadorSAImp implements EntrenadorSA {
    
    
     public ArrayList<TOAEntrenadorEquipo> equiposEntrenador(int id){
         
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EntrenadorDAO DAOEntrenador = instancia.crearEntrenadoresDAO();
        EquiposDAO DAOEquipo = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        ArrayList<EntrenadorTrans> entrenadores = DAOEntrenador.equiposEntrenador(id);
        
        ArrayList<TOAEntrenadorEquipo> entrenadoresConEquipo = new ArrayList<TOAEntrenadorEquipo>();
        for (EntrenadorTrans j : entrenadores){
            TOAEntrenadorEquipo entrenadorEquipo;

            entrenadorEquipo = new TOAEntrenadorEquipo(j, DAOEquipo.readById(j.getIdEquipo()));
        }

        return entrenadoresConEquipo;
     }

    @Override
    public ArrayList<TOAEntrenadorEquipo> listarEntrenadores() {
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EntrenadorDAO DAOEntrenador = instancia.crearEntrenadoresDAO();
        EquiposDAO DAOEquipo = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        ArrayList<EntrenadorTrans> entrenadores = DAOEntrenador.readAll();
        
        ArrayList<TOAEntrenadorEquipo> entrenadoresConEquipo = new ArrayList<TOAEntrenadorEquipo>();
        for (EntrenadorTrans j : entrenadores){
            TOAEntrenadorEquipo entrenadorEquipo;

            if (j.getIdEquipo() != null){
                entrenadorEquipo = new TOAEntrenadorEquipo(j, DAOEquipo.readById(j.getIdEquipo()));
            } else {
                entrenadorEquipo = new TOAEntrenadorEquipo(j, null);
            }

            entrenadoresConEquipo.add(entrenadorEquipo);
        }

        return entrenadoresConEquipo;
    }
    
    @Override
    public TOAEntrenadorEquipo obtenerEntrenadorCompleto(Integer id){
         FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EntrenadorDAO DAOEntrenador = instancia.crearEntrenadoresDAO();
        EquiposDAO DAOEquipo = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        EntrenadorTrans entrenador = DAOEntrenador.readById(id);
        TOAEntrenadorEquipo entrenadorEquipo;

            if (entrenador.getIdEquipo() != null){
                entrenadorEquipo = new TOAEntrenadorEquipo(entrenador, DAOEquipo.readById(entrenador.getIdEquipo()));
            } else {
                entrenadorEquipo = new TOAEntrenadorEquipo(entrenador, null);
            }
        
        return entrenadorEquipo;
        
    }
    
    @Override
    public EntrenadorTrans obtenerEntrenador(Integer id){
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EntrenadorDAO DAOEntrenador = instancia.crearEntrenadoresDAO();
        EntrenadorTrans entrenador = DAOEntrenador.readById(id);
        return entrenador;
        
    }
    
    
}
