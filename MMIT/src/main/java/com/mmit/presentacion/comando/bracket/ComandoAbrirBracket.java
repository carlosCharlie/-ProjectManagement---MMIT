package com.mmit.presentacion.comando.bracket;

import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoAbrirBracket implements Comando{

    @Override
    public Contexto execute(Object datos) {
        return new Contexto(Evento.AbrirHacerBracket, null);
    }
}
