package com.mmit.negocio.equipos;

import com.mmit.integracion.entrenadores.EntrenadorDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.jugadores.JugadoresDAO;
import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import java.util.ArrayList;

public class EquiposSAImp implements EquiposSA {
    
    @Override
    public ArrayList<EquipoTrans> listarEquipos(){
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EquiposDAO daoe= instancia.crearEquiposDAO();
       
    return daoe.readAll();
}

    @Override
    public TOAEntrenadorEquipoJugadores getById(int id) {
       
        EquiposDAO equiposDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        EntrenadorDAO entrenadoresDao = FactoriaIntegracion.getInstancia().crearEntrenadoresDAO();
        JugadoresDAO jugadoresDao = FactoriaIntegracion.getInstancia().crearJugadoresDAO();
        
        EquipoTrans equipo = equiposDao.readById(id);
        
        if(equipo==null){
            return null;
        }
        else{
            
            return new TOAEntrenadorEquipoJugadores(entrenadoresDao.getByEquipo(id),equipo,jugadoresDao.getRoster(id));
         }
    }
    
    @Override
    public EquipoTrans obtenerEquipoPorId(int id) {
       
        EquiposDAO equiposDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        
        EquipoTrans equipo = equiposDao.readById(id);
        
        return equipo;
    }
}
