/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.integracion.FactoriaIntegracion;

import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.equipos.EquiposDAOImp;

/**
 *
 * @author carlos
 */
class FactoriaIntegracionImp extends FactoriaIntegracion {

    public EquiposDAO crearEquiposDAO(){
        return new EquiposDAOImp();
    }
    
}
