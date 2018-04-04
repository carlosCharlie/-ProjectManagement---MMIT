package com.mmit.presentacion.entrenadores;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
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
    
    private ObservableList<TOAEntrenadorEquipo> listaEntrenadores;
    @FXML
    private TextField buscar;
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
        
        listaEntrenadores = FXCollections.observableArrayList((ArrayList<TOAEntrenadorEquipo>) contexto.getDatos());
        
        if (listaEntrenadores != null){
            FilteredList<TOAEntrenadorEquipo> filteredData = new FilteredList<>(listaEntrenadores, p -> true);
        
            buscar.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(jugador-> {
                    // If filter text is empty, display all persons.
                    if (newValue == null || newValue.isEmpty()) {
                        return true;
                    }

                    // Compare first name and last name of every person with filter text.
                    String lowerCaseFilter = newValue.toLowerCase();

                    if (jugador.getNombreEntrenador().toLowerCase().contains(lowerCaseFilter)) {
                        return true; // Filter matches first name.
                    } else if (jugador.getApellidosEntrenador().toLowerCase().contains(lowerCaseFilter)) {
                        return true; // Filter matches first name.
                    }
                    return false; // Does not match.
                });
            });

            SortedList<TOAEntrenadorEquipo> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(tablaEntrenadores.comparatorProperty());

            tablaEntrenadores.setItems(sortedData);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                alert.setHeaderText("Error");
                alert.setContentText("Error al obtener los datos de la BBDD");
                alert.show();
        }
    }
    
    @FXML
    public void seleccionarEntrenador(){
       
        TablePosition pos = this.tablaEntrenadores.getSelectionModel().getSelectedCells().get(0);
        int row = pos.getRow();
        
        if (row != -1){
            TableColumn col = pos.getTableColumn();

            Integer id = tablaEntrenadores.getItems().get(row).getIdEntrenador();

            try {
                Contexto contexto = new Contexto(Evento.ObtenerDatosEntrenador, id);
                Controlador.obtenerInstancia().accion(contexto);

                TOAEntrenadorEquipo ent = (TOAEntrenadorEquipo) contexto.getDatos();

                BorderPane root = (BorderPane) this.tablaEntrenadores.getScene().getRoot();

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InformacionEntrenadoresUsuarios.fxml"));

                loader.setResources(new ResourceBundle() {
                    @Override
                    protected Object handleGetObject(String key) {
                        return ent;
                    }

                    @Override
                    public Enumeration<String> getKeys() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });

                root.setCenter(loader.load());

            } catch (IOException ex) {
                Logger.getLogger(ControladorVistaEquipos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }

    }
    
}
