/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.negocio.FactoriaNegocio;

import com.mmit.negocio.equipos.EquiposSA;
import com.mmit.negocio.equipos.EquiposSAImp;



/**
 *
 * @author carlos
 */
class FactoriaNegocioImp extends FactoriaNegocio {

    public FactoriaNegocioImp() {
    }

    @Override
    public EquiposSA crearEquiposSA() {
        return new EquiposSAImp();
    }
    
}
