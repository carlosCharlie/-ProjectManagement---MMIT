package com.mmit.integracion.FactoriaIntegracion;

import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.equipos.EquiposDAOImp;

class FactoriaIntegracionImp extends FactoriaIntegracion {

    public EquiposDAO crearEquiposDAO(){
        return new EquiposDAOImp();
    }
    
}
