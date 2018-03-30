package com.mmit.presentacion.equipos;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ControladorVistaInfoEquipos implements Initializable {

    private TOAEntrenadorEquipo equipo;
    @FXML
    private Label nombreEquipo;
    @FXML
    private Label nombreEntrenador;
    @FXML
    private Label apellidosEntrenador;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        this.equipo = (TOAEntrenadorEquipo) rb.getObject("");
        this.nombreEquipo.setText(this.equipo.getNombreEquipo());
        if (this.equipo.getEntrenador() != null){
            this.nombreEntrenador.setText(this.equipo.getNombreEntrenador());
            this.apellidosEntrenador.setText(this.equipo.getApellidosEntrenador());
        } else {
            this.nombreEntrenador.setText("-");
        }   
    }
}