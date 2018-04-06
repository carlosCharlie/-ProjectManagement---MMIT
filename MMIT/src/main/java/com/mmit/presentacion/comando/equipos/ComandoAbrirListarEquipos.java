package com.mmit.presentacion.comando.equipos;

import com.mmit.negocio.equipos.EquiposSA;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoAbrirListarEquipos implements Comando{

    @Override
    public Contexto execute(Object datos) {
        try {
            EquiposSA equiposSa = FactoriaNegocio.getInstancia().crearEquiposSA();
            return new Contexto(Evento.AbrirListarEquipos, equiposSa.listarEquipos());
        } catch (Exception ex){
            return new Contexto(Evento.ErrorSQL, null);
        }
    }
 
}
