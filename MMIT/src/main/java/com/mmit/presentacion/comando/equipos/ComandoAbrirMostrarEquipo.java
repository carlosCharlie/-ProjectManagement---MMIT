package com.mmit.presentacion.comando.equipos;

import com.mmit.negocio.equipos.TOAEntrenadorEquipoJugadores;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoAbrirMostrarEquipo implements Comando{

    @Override
    public Contexto execute(Object datos) {
        try{
            TOAEntrenadorEquipoJugadores toa = FactoriaNegocio.getInstancia().crearEquiposSA().obtenerEquipoCompleto((int) datos);
            return new Contexto(Evento.AbrirMostrarEquipo, toa);
        }catch (Exception ex){
            return new Contexto(Evento.ErrorSQL, null);
        }
    }
 
}
