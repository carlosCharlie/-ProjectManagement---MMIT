package com.mmit.presentacion;

import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ControladorVistaMenu implements Initializable, ControladorVista {

    @FXML
    private Button botonEquipos;
    @FXML
    private Button botonJugadores;
    @FXML
    private Button botonEntrenadores;
    @FXML
    private GridPane menu;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        this.menu.setDisable(true);
        Controlador.obtenerInstancia().accion(new Contexto(Evento.Preloader, null));
        if (event.getSource() == botonEquipos){
            botonJugadores.getStyleClass().remove("botonMenuPulsado");
            botonEntrenadores.getStyleClass().remove("botonMenuPulsado");
            botonEquipos.getStyleClass().add("botonMenuPulsado");
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarEquipos, null));
        } else if (event.getSource() == botonJugadores){;
            botonJugadores.getStyleClass().add("botonMenuPulsado");
            botonEntrenadores.getStyleClass().remove("botonMenuPulsado");
            botonEquipos.getStyleClass().remove("botonMenuPulsado");
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarJugadores, null));
        } else if (event.getSource() == botonEntrenadores){
            botonJugadores.getStyleClass().remove("botonMenuPulsado");
            botonEntrenadores.getStyleClass().add("botonMenuPulsado");
            botonEquipos.getStyleClass().remove("botonMenuPulsado");
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarEntrenadores, null));
        }
    }

    @Override
    public void Actualizar(Contexto contexto) {
        switch(contexto.getEvento()){
            case HabilitarMenu:
                this.menu.setDisable(false);
                break;
        }
    }
    
}
