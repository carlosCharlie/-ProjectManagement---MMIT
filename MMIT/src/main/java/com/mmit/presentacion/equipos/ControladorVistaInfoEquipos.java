package com.mmit.presentacion.equipos;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class ControladorVistaInfoEquipos {

    @FXML
    private Label nombre;

    @FXML
    private Label entrenador;

    @FXML
    private Button botonAtras;
    
    private Node anterior;
    
    public void setEscenaAnterior(Node anterior)
    {
        this.anterior=anterior;
    }
    
    public void setNombre(String nombre) {
        this.nombre.setText(nombre);
    }

    public void setEntrenador(String entrenador) {
        this.entrenador.setText(entrenador);
    }

     @FXML
    void initialize() {
        
        
    }
    
    public void volverVistaAnterior(){
        ((BorderPane)this.botonAtras.getScene().getRoot()).setCenter(this.anterior);
    }
}