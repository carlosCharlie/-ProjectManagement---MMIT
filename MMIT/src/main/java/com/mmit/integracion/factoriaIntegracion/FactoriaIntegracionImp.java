package com.mmit.integracion.factoriaIntegracion;

import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.equipos.EquiposDAOImp;
import com.mmit.integracion.jugadores.JugadoresDAO;
import com.mmit.integracion.jugadores.JugadoresDAOImp;

class FactoriaIntegracionImp extends FactoriaIntegracion {

    public EquiposDAO crearEquiposDAO(){
        return new EquiposDAOImp();
    }

    @Override
    public JugadoresDAO crearJugadoresDAO() {
        return new JugadoresDAOImp();
    }
    
}
