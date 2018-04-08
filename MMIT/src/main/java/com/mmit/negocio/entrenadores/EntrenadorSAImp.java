package com.mmit.negocio.entrenadores;

import com.mmit.integracion.entrenadores.EntrenadorDAO;
import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EntrenadorSAImp implements EntrenadorSA { 
    
    @Override
    public ArrayList<EquipoTrans> obtenerHistoricoEquipos(int id) throws Exception{
       ArrayList<EquipoTrans> equipos;
       try { 
           
           FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
           EntrenadorDAO DAOEntrenador = instancia.crearEntrenadoresDAO();
           equipos = DAOEntrenador.readHistoricoByEntrenador(id);
           
       } catch (Exception ex) {
           throw ex;
       }
       return equipos;
    }

    @Override
    public ArrayList<TOAEntrenadorEquipo> listarEntrenadores() throws Exception{
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EntrenadorDAO DAOEntrenador = instancia.crearEntrenadoresDAO();
        EquiposDAO DAOEquipo = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        ArrayList<EntrenadorTrans> entrenadores = DAOEntrenador.readAll();

        ArrayList<TOAEntrenadorEquipo> entrenadoresConEquipo = new ArrayList<TOAEntrenadorEquipo>();
        try{
            for (EntrenadorTrans j : entrenadores){
                TOAEntrenadorEquipo entrenadorEquipo;

                if (j.getIdEquipo() != null){
                    entrenadorEquipo = new TOAEntrenadorEquipo(j, DAOEquipo.readById(j.getIdEquipo()));
                } else {
                    entrenadorEquipo = new TOAEntrenadorEquipo(j, null);
                }

                entrenadoresConEquipo.add(entrenadorEquipo);
            }
        } catch (Exception ex){
            throw ex;
        }

        return entrenadoresConEquipo;
    }
    
    @Override
    public TOAEntrenadorEquipo obtenerEntrenadorCompleto(Integer id) throws Exception{
         FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EntrenadorDAO DAOEntrenador = instancia.crearEntrenadoresDAO();
        EquiposDAO DAOEquipo = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        EntrenadorTrans entrenador = DAOEntrenador.readById(id);
        TOAEntrenadorEquipo entrenadorEquipo = null;
        try{

            if (entrenador.getIdEquipo() != null){
                entrenadorEquipo = new TOAEntrenadorEquipo(entrenador, DAOEquipo.readById(entrenador.getIdEquipo()));
            } else {
                entrenadorEquipo = new TOAEntrenadorEquipo(entrenador, null);
            }
        }catch (Exception ex){
           throw ex;
        }
        return entrenadorEquipo;
        
    }
    
    @Override
    public EntrenadorTrans obtenerEntrenador(Integer id) throws Exception{
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EntrenadorDAO DAOEntrenador = instancia.crearEntrenadoresDAO();
        EntrenadorTrans entrenador = DAOEntrenador.readById(id);
        return entrenador;
        
    }
    
    
}
