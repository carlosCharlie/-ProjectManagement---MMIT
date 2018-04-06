package com.mmit.presentacion.comando.jugadores;

import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.jugadores.JugadoresSA;
import com.mmit.negocio.jugadores.TOAJugadorEquipo;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;
import java.util.ArrayList;

public class ComandoAbrirListarJugadores implements Comando{

    @Override
    public Contexto execute(Object datos) {
        try {
            JugadoresSA jugadoresSa = FactoriaNegocio.getInstancia().crearJugadoresSA();
            ArrayList<TOAJugadorEquipo> jugadores = jugadoresSa.listarJugadores();
            return new Contexto(Evento.AbrirListarJugadores, jugadores);
        } catch (Exception ex){
            return new Contexto(Evento.ErrorSQL, null);
        }
    }
 
}
