package com.mmit.presentacion.entrenadores;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.negocio.equipos.TOAEntrenadorEquipoJugadores;
import com.mmit.presentacion.ControladorVista;
import com.mmit.presentacion.controlador.Contexto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class ControladorVistaInfoEntrenadores implements Initializable,ControladorVista {

    private TOAEntrenadorEquipo entrenador;
    @FXML
    private Label nombreEquipo;
    @FXML
    private Label nombreEntrenador;
    @FXML
    private Label apellidosEntrenador;
    @FXML
    private Label edad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }   
    
    @Override
    public void Actualizar(Contexto contexto) {
        switch(contexto.getEvento()){
            case AbrirMostrarEntrenador:
                this.entrenador = (TOAEntrenadorEquipo) contexto.getDatos();
                rellenarInformacionBasica();
                break;
            case ErrorSQL:
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                alert.setHeaderText("Error");
                alert.setContentText("Error al obtener los datos de la BBDD");
                alert.show();
                break;
            default:
                break;
        }
    }
    
    private void rellenarInformacionBasica(){
        this.nombreEntrenador.setText(this.entrenador.getNombreEntrenador());
        this.apellidosEntrenador.setText(this.entrenador.getApellidosEntrenador());
        this.edad.setText(String.valueOf(this.entrenador.getEntrenador().getEdad()));
        if (this.entrenador.getEquipo() != null){
            this.nombreEquipo.setText(this.entrenador.getEquipo().getNombre());
        } else {
            this.nombreEquipo.setText("-");
        }
    }
    
}
