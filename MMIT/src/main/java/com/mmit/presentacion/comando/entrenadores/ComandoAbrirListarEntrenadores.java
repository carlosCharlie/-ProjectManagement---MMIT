package com.mmit.presentacion.comando.entrenadores;

import com.mmit.negocio.entrenadores.EntrenadorSA;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.controlador.Contexto;

public class ComandoAbrirListarEntrenadores implements Comando{

    @Override
    public Contexto execute(Object datos) {
        try{
            EntrenadorSA entrenadoresSa = FactoriaNegocio.getInstancia().crearEntrenadoresSA();
            return new Contexto(Evento.AbrirListarEntrenadores, entrenadoresSa.listarEntrenadores());
        } catch (Exception ex){
            return new Contexto(Evento.ErrorSQL, null);
        }
    }
 
}
