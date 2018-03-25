/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.presentacion.controlador;

import com.mmit.negocio.FactoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.equipos.EquiposSA;

/**
 *
 * @author crash
 */
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
