package com.mmit.presentacion;

import com.mmit.negocio.usuarios.Login;
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
    @FXML
    private Button botonIniciarSesion;
    @FXML
    private Button botonCerrarSesion;
    @FXML
    private Button botonBracket;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (Login.getUsuario() != null){
            this.botonCerrarSesion.setVisible(true);
        } else {
            this.botonIniciarSesion.setVisible(true);
        }
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        this.menu.setDisable(true);
        Controlador.obtenerInstancia().accion(new Contexto(Evento.Preloader, null));
        if (event.getSource() == botonEquipos){
            if (!botonEquipos.getStyleClass().contains("botonMenuPulsado")){
                botonBracket.getStyleClass().remove("botonMenuPulsado");
                botonJugadores.getStyleClass().remove("botonMenuPulsado");
                botonEntrenadores.getStyleClass().remove("botonMenuPulsado");
                botonEquipos.getStyleClass().add("botonMenuPulsado");
            }
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarEquipos, null));
        } else if (event.getSource() == botonJugadores){
            if (!botonJugadores.getStyleClass().contains("botonMenuPulsado")){
                botonBracket.getStyleClass().remove("botonMenuPulsado");
                botonJugadores.getStyleClass().add("botonMenuPulsado");
                botonEntrenadores.getStyleClass().remove("botonMenuPulsado");
                botonEquipos.getStyleClass().remove("botonMenuPulsado");
            }
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarJugadores, null));
        } else if (event.getSource() == botonEntrenadores){
            if (!botonEntrenadores.getStyleClass().contains("botonMenuPulsado")){
                botonBracket.getStyleClass().remove("botonMenuPulsado");
                botonJugadores.getStyleClass().remove("botonMenuPulsado");
                botonEntrenadores.getStyleClass().add("botonMenuPulsado");
                botonEquipos.getStyleClass().remove("botonMenuPulsado");
            }
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirListarEntrenadores, null));
        } else if (event.getSource() == botonBracket){
            if (!botonBracket.getStyleClass().contains("botonMenuPulsado")){
                botonBracket.getStyleClass().add("botonMenuPulsado");
                botonJugadores.getStyleClass().remove("botonMenuPulsado");
                botonEntrenadores.getStyleClass().remove("botonMenuPulsado");
                botonEquipos.getStyleClass().remove("botonMenuPulsado");
            }
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirHacerBracket, null));
        }
    }
    
    @FXML
    private void iniciarSesion(){
        Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirLogin, null));
    }
    
    @FXML
    private void cerrarSesion(){
        Controlador.obtenerInstancia().accion(new Contexto(Evento.CerrarSesion, null));
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
