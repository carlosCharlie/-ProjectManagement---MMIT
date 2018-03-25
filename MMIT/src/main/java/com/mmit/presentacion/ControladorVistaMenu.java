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

public class ControladorVistaMenu implements Initializable {

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
                Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (event.getSource() == botonJugadores){
            try {
                BorderPane root = (BorderPane) botonEquipos.getScene().getRoot();
                root.setCenter((AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/ListaJugadoresUsuarios.fxml")));
            } catch (IOException ex) {
                Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (event.getSource() == botonEntrenadores){
            try {
                BorderPane root = (BorderPane) botonEquipos.getScene().getRoot();
                root.setCenter((AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/ListaEntrenadoresUsuarios.fxml")));
            } catch (IOException ex) {
                Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
