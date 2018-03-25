package com.mmit.negocio.FactoriaNegocio;

import com.mmit.negocio.equipos.EquiposSA;
import com.mmit.negocio.equipos.EquiposSAImp;

class FactoriaNegocioImp extends FactoriaNegocio {

    public FactoriaNegocioImp() {
    }

    @Override
    public EquiposSA crearEquiposSA() {
        return new EquiposSAImp();
    }
    
}
