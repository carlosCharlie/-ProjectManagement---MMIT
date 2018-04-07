package com.mmit.presentacion;

import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

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

        Controlador.obtenerInstancia().accion(new Contexto(Evento.Preloader, null));
        if (event.getSource() == botonEquipos){
            botonJugadores.getStyleClass().remove("botonMenuPulsado");
            botonEntrenadores.getStyleClass().remove("botonMenuPulsado");
            botonEquipos.getStyleClass().add("botonMenuPulsado");
        } else if (event.getSource() == botonJugadores){;
            botonJugadores.getStyleClass().add("botonMenuPulsado");
            botonEntrenadores.getStyleClass().remove("botonMenuPulsado");
            botonEquipos.getStyleClass().remove("botonMenuPulsado");
        } else if (event.getSource() == botonEntrenadores){
            botonJugadores.getStyleClass().remove("botonMenuPulsado");
            botonEntrenadores.getStyleClass().add("botonMenuPulsado");
            botonEquipos.getStyleClass().remove("botonMenuPulsado");
        }
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                    Platform.runLater(new Runnable() {
                        
                        @Override
                        public void run() {
                            if (event.getSource() == botonEquipos){
                                Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarEquipos, null));
                            } else if (event.getSource() == botonJugadores){;
                                Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarJugadores, null));
                            } else if (event.getSource() == botonEntrenadores){
                                Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarEntrenadores, null));
                            }
                        }
                    });
                } catch (InterruptedException ex) {
                    Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }

    @Override
    public void Actualizar(Contexto contexto) {
        
    }
    
}
