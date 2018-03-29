package com.mmit.presentacion.equipos;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ControladorVistaInfoEquipos {

    @FXML
    private TextArea nombre;

    @FXML
    private TextArea entrenador;

    public void setNombre(String nombre) {
        this.nombre.setText(nombre);
    }

    public void setEntrenador(String entrenador) {
        this.entrenador.setText(entrenador);
    }

     @FXML
    void initialize() {
        
        System.out.print("prueba");
    }
}