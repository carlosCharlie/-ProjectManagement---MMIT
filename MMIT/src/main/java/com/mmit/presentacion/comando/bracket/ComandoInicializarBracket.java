package com.mmit.presentacion.comando.bracket;

import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoInicializarBracket implements Comando{

    @Override
    public Contexto execute(Object datos) {
        int respuesta = FactoriaNegocio.getInstancia().crearBracketSA().loadInitBracket();
        switch (respuesta){
            case 0:
                return new Contexto(Evento.RellenarBracket, null);
            case -5:
                return new Contexto(Evento.ErrorSQL, null);
            default:
                return null;
        }
    }
    
}