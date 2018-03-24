/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.presentacion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author crash
 */
public class controladorVistaMenu implements Initializable {

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
            try {
                BorderPane root = (BorderPane) botonEquipos.getScene().getRoot();
                root.setCenter((AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/ListaEquiposUsuarios.fxml")));
            } catch (IOException ex) {
                Logger.getLogger(controladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("");
                alert.setHeaderText("Informacion");
                alert.setContentText("Menu no disponible");
                alert.show();
        }
    }
    
}
