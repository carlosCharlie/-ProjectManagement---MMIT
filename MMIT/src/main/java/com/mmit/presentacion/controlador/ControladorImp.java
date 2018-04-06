package com.mmit.presentacion.controlador;

import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.despachadorVista.DespachadorVista;
import com.mmit.presentacion.factoriaComandos.FactoriaComandos;

public class ControladorImp extends Controlador{

    @Override
    public void accion(Contexto contexto) {
        Comando comando = FactoriaComandos.obtenerInstancia().obtenerComando(contexto.getEvento());
        contexto = comando.execute(contexto.getDatos());
        DespachadorVista.obtenerInstancia().crearVista(contexto);    
    }
}
