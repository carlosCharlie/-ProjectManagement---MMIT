package com.mmit.negocio.equipos;

import com.mmit.integracion.entrenadores.EntrenadorDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.jugadores.JugadoresDAO;
import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EquiposSAImp implements EquiposSA {
    
    @Override
    public ArrayList<EquipoTrans> listarEquipos() throws Exception{
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EquiposDAO daoe= instancia.crearEquiposDAO();
       
    return daoe.readAll();
}

    @Override
    public TOAEntrenadorEquipoJugadores obtenerEquipoCompleto(int id) throws Exception{
       
        try {
            EquiposDAO equiposDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            EntrenadorDAO entrenadoresDao = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
            JugadoresDAO jugadoresDao = FactoriaIntegracion.getInstancia().crearJugadoresDAO();
            
            EquipoTrans equipo = equiposDao.readById(id);
            
            if(equipo==null){
                return null;
            }
            else{
                return new TOAEntrenadorEquipoJugadores(entrenadoresDao.readByEquipo(id),equipo,jugadoresDao.readRoster(id));
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    @Override
    public EquipoTrans obtenerEquipo(int id){
       
        try {
            EquiposDAO equiposDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            
            EquipoTrans equipo = equiposDao.readById(id);
            
            return equipo;
        } catch (Exception ex) {
            Logger.getLogger(EquiposSAImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
