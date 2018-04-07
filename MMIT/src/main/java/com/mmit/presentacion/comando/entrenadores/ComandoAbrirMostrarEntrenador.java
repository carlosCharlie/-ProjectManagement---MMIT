package com.mmit.presentacion.comando.entrenadores;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;
import java.util.ArrayList;

public class ComandoAbrirMostrarEntrenador implements Comando{

    @Override
    public Contexto execute(Object datos) {
        try{
            TOAEntrenadorEquipo toa = FactoriaNegocio.getInstancia().crearEntrenadoresSA().obtenerEntrenadorCompleto((int) datos);
            ArrayList<EquipoTrans> equipos = FactoriaNegocio.getInstancia().crearEntrenadoresSA().obtenerHistoricoEquipos(toa.getIdEntrenador());
            toa.setHistoricoEquipos(equipos);
            return new Contexto(Evento.AbrirMostrarEntrenador, toa);
        }catch (Exception ex){
            return new Contexto(Evento.ErrorSQL, null);
        }
    }
 
}
