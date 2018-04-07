package com.mmit.presentacion.jugadores;

import com.mmit.negocio.jugadores.TOAJugadorEquipo;
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
import javafx.scene.layout.FlowPane;

public class ControladorVistaJugadores implements Initializable, ControladorVista {

    @FXML
    private TableView<TOAJugadorEquipo> tablaJugadores;
    @FXML
    private TableColumn<TOAJugadorEquipo, String> colNombre;
    @FXML
    private TableColumn<TOAJugadorEquipo, String> colApellidos;
    @FXML
    private TableColumn<TOAJugadorEquipo, String> colEquipo;
    @FXML
    private TableColumn<TOAJugadorEquipo, Integer> colId;
    
    private ObservableList<TOAJugadorEquipo> listaJugadores;
    @FXML
    private TextField buscar;
    @FXML
    private FlowPane cargando;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    } 
    
    @Override
    public void Actualizar(Contexto contexto) {
        cargando.setVisible(false);
        switch(contexto.getEvento()){
            case AbrirListarJugadores:
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
        colId.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, Integer>("idJugador"));
        colNombre.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, String>("nombreJugador"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, String>("apellidosJugador"));
        colEquipo.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, String>("nombreEquipo"));
        
        listaJugadores = FXCollections.observableArrayList((ArrayList<TOAJugadorEquipo>) datos);

        FilteredList<TOAJugadorEquipo> filteredData = new FilteredList<>(listaJugadores, p -> true);

        buscar.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(jugador-> {
                // If filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (jugador.getNombreJugador().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                } else if (jugador.getApellidosJugador().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter matches first name.
                }
                return false; // Does not match.
            });
        });

        SortedList<TOAJugadorEquipo> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tablaJugadores.comparatorProperty());

        tablaJugadores.setItems(sortedData);
    }
    
    @FXML
    public void seleccionarJugador(){
       
        TablePosition pos = this.tablaJugadores.getSelectionModel().getSelectedCells().get(0);
        int row = pos.getRow();
        
        TableColumn col = pos.getTableColumn();

        Integer id = tablaJugadores.getItems().get(row).getIdJugador();

        Contexto contexto = new Contexto(Evento.AbrirMostrarJugador, id);

        Controlador.obtenerInstancia().accion(contexto);

    }
    
}
