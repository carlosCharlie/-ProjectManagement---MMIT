package com.mmit.presentacion.entrenadores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ControladorVistaEntrenadores implements Initializable {

    @FXML
    private TableView<?> tablaEntrenadores;
    @FXML
    private TableColumn<?, ?> colNombre;
    @FXML
    private TableColumn<?, ?> colApellidos;
    @FXML
    private TableColumn<?, ?> colEdad;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (tablaEntrenadores != null){
            rellenarTabla();
        }       
    } 
    
    private void rellenarTabla(){

    }
    
}
