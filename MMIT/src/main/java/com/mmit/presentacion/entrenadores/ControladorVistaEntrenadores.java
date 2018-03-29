package com.mmit.presentacion.entrenadores;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControladorVistaEntrenadores implements Initializable {

    @FXML
    private TableView<TOAEntrenadorEquipo> tablaEntrenadores;
    @FXML
    private TableColumn<TOAEntrenadorEquipo, String> colNombre;
    @FXML
    private TableColumn<TOAEntrenadorEquipo, String> colApellidos;
    @FXML
    private TableColumn<TOAEntrenadorEquipo, Integer> colId;
    @FXML
    private TableColumn<TOAEntrenadorEquipo, String> colEquipo;
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
        colId.setCellValueFactory(new PropertyValueFactory<TOAEntrenadorEquipo, Integer>("idEntrenador"));
        colNombre.setCellValueFactory(new PropertyValueFactory<TOAEntrenadorEquipo, String>("nombreEntrenador"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<TOAEntrenadorEquipo, String>("apellidosEntrenador"));
        colEquipo.setCellValueFactory(new PropertyValueFactory<TOAEntrenadorEquipo, String>("nombreEquipo"));
        
        Contexto contexto = new Contexto(Evento.ListarEntrenadores, null);
        Controlador.obtenerInstancia().accion(contexto);
        
        ArrayList<TOAEntrenadorEquipo> listaEntrenadores = (ArrayList<TOAEntrenadorEquipo>) contexto.getDatos();
        
        if (listaEntrenadores != null){
            for (TOAEntrenadorEquipo entrenador : listaEntrenadores){
                tablaEntrenadores.getItems().add(entrenador);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                alert.setHeaderText("Error");
                alert.setContentText("Error al obtener los datos de la BBDD");
                alert.show();
        }
    }
    
}
