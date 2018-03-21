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
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            BorderPane root = (BorderPane) botonEquipos.getScene().getRoot();
            root.setCenter((AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/ListaEquipos.fxml")));
        } catch (IOException ex) {
            Logger.getLogger(controladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
