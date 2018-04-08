package com.mmit.presentacion.controlador;

import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.despachadorVista.DespachadorVista;
import com.mmit.presentacion.factoriaComandos.FactoriaComandos;
import javafx.application.Platform;

public class ControladorImp extends Controlador{

    private static Contexto contexto;
    private static Contexto contextoRetorno;
    private Thread t;
    
    @Override
    public void accion(Contexto contexto) {

        this.contexto = contexto;
        t = new Thread(new Runnable() {
    
            @Override
            public void run() {
                Comando comando = FactoriaComandos.obtenerInstancia().obtenerComando(contexto.getEvento());
                contexto.getDatos();
                contextoRetorno = comando.execute(contexto.getDatos());
                Platform.runLater(new Runnable() {
                        
                    @Override
                    public void run() {
                        DespachadorVista.obtenerInstancia().crearVista(contextoRetorno);  
                    }
                });
            }
        });
        
        t.start();
        
    }
}
