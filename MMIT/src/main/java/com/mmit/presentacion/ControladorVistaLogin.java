package com.mmit.presentacion;

import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class ControladorVistaLogin implements Initializable, ControladorVista{

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @Override
    public void Actualizar(Contexto contexto) {
        
    }
    
    @FXML
    private void aceptar(){
        Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirMenuPrincipal, null));
    }
    
}
