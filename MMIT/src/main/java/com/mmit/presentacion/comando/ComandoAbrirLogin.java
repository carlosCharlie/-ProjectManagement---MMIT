package com.mmit.presentacion.comando;

import com.mmit.presentacion.Evento;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoAbrirLogin implements Comando{

    @Override
    public Contexto execute(Object datos) {
        return new Contexto(Evento.AbrirLogin, datos);
    }
    
}
