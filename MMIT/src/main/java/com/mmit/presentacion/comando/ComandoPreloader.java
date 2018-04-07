package com.mmit.presentacion.comando;

import com.mmit.presentacion.Evento;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoPreloader implements Comando{

    @Override
    public Contexto execute(Object datos) {
        return new Contexto(Evento.Preloader, null);
    }
    
}
