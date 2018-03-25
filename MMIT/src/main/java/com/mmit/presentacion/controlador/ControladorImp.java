package com.mmit.presentacion.controlador;

import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.equipos.EquiposSA;

public class ControladorImp extends Controlador{

    @Override
    public void accion(Contexto contexto) {
        switch(contexto.getEvento()){
            case ListarEquipos:
                EquiposSA equiposSa = FactoriaNegocio.getInstacia().crearEquiposSA();
                contexto.setDatos(equiposSa.listarEquipos());
        }
    }
    
}