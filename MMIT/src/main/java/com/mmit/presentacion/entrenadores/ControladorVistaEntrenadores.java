package com.mmit.presentacion.entrenadores;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.presentacion.ControladorVista;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import com.mmit.presentacion.equipos.ControladorVistaEquipos;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class ControladorVistaEntrenadores implements Initializable, ControladorVista {

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
    
    private ObservableList<TOAEntrenadorEquipo> listaEntrenadores;
    @FXML
    private TextField buscar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    } 
    
    @Override
    public void Actualizar(Contexto contexto) {
        switch(contexto.getEvento()){
            case AbrirListarEntrenadores:
                rellenarTabla(contexto.getDatos());
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
    
    private void rellenarTabla(Object datos){
        colId.setCellValueFactory(new PropertyValueFactory<TOAEntrenadorEquipo, Integer>("idEntrenador"));
        colNombre.setCellValueFactory(new PropertyValueFactory<TOAEntrenadorEquipo, String>("nombreEntrenador"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<TOAEntrenadorEquipo, String>("apellidosEntrenador"));
        colEquipo.setCellValueFactory(new PropertyValueFactory<TOAEntrenadorEquipo, String>("nombreEquipo"));
        
        listaEntrenadores = FXCollections.observableArrayList((ArrayList<TOAEntrenadorEquipo>) datos);

        FilteredList<TOAEntrenadorEquipo> filteredData = new FilteredList<>(listaEntrenadores, p -> true);

        buscar.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(jugador-> {

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String lowerCaseFilter = newValue.toLowerCase();

                if (jugador.getNombreEntrenador().toLowerCase().contains(lowerCaseFilter)) {
                    return true; 
                } else if (jugador.getApellidosEntrenador().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                }
                return false;
            });
        });

        SortedList<TOAEntrenadorEquipo> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tablaEntrenadores.comparatorProperty());

        tablaEntrenadores.setItems(sortedData);
    }
    
    @FXML
    public void seleccionarEntrenador(){
       
    TablePosition pos = this.tablaEntrenadores.getSelectionModel().getSelectedCells().get(0);
    int row = pos.getRow();
    TableColumn col = pos.getTableColumn();

    Integer id = tablaEntrenadores.getItems().get(row).getIdEntrenador();

    Contexto contexto = new Contexto(Evento.AbrirMostrarEntrenador, id);

    Controlador.obtenerInstancia().accion(contexto);

    }
    
}
