package com.mmit.presentacion;

import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class ControladorVistaMenu implements Initializable, ControladorVista {

    @FXML
    private Button botonEquipos;
    @FXML
    private Button botonJugadores;
    @FXML
    private Button botonEntrenadores;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == botonEquipos){
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarEquipos, null));
        } else if (event.getSource() == botonJugadores){
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarJugadores, null));
        } else if (event.getSource() == botonEntrenadores){
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarEntrenadores, null));
                   
        }
    }

    @Override
    public void Actualizar(Contexto contexto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
