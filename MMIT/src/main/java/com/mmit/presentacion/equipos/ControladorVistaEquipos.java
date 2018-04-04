package com.mmit.presentacion.equipos;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
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

public class ControladorVistaEquipos implements Initializable {

    @FXML
    private TableView<EquipoTrans> tablaEquipos;
    @FXML
    private TableColumn<EquipoTrans, String> colNombre;
    @FXML
    private TableColumn<EquipoTrans, Integer> colPJ;
    @FXML
    private TableColumn<EquipoTrans, Integer> colPG;
    @FXML
    private TableColumn<EquipoTrans, Integer> colPP;
    @FXML
    private TableColumn<EquipoTrans, Double> colPor;
    @FXML
    private TableColumn<EquipoTrans, Integer> colId;
   
    private ObservableList<EquipoTrans> listaEquipos = null;
    @FXML
    private TextField buscar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        if (tablaEquipos != null){
            rellenarTabla();
        }       
    } 
    
    private void rellenarTabla(){
        
        colId.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<EquipoTrans, String>("nombre"));
        colPG.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("victorias"));
        colPP.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("derrotas"));
        colPJ.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("jugados"));
        colPor.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Double>("porcentaje"));        
        
        Contexto contexto = new Contexto(Evento.ListarEquipos, null);
        Controlador.obtenerInstancia().accion(contexto);
        
        listaEquipos = FXCollections.observableArrayList((ArrayList<EquipoTrans>)contexto.getDatos());

        if (listaEquipos != null){
            FilteredList<EquipoTrans> filteredData = new FilteredList<>(listaEquipos, p -> true);
        
            buscar.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(nombre-> {
                    // If filter text is empty, display all persons.
                    if (newValue == null || newValue.isEmpty()) {
                        return true;
                    }

                    // Compare first name and last name of every person with filter text.
                    String lowerCaseFilter = newValue.toLowerCase();

                    if (nombre.getNombre().toLowerCase().contains(lowerCaseFilter)) {
                        return true; // Filter matches first name.
                    }
                    return false; // Does not match.
                });
            });

            SortedList<EquipoTrans> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(tablaEquipos.comparatorProperty());

            tablaEquipos.setItems(sortedData);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                alert.setHeaderText("Error");
                alert.setContentText("Error al obtener los datos de la BBDD");
                alert.show();
        }
    }
 
    
    @FXML
    public void seleccionarEquipo(){
       
        TablePosition pos = this.tablaEquipos.getSelectionModel().getSelectedCells().get(0);
        int row = pos.getRow();
        
        if (row != -1){
            TableColumn col = pos.getTableColumn();

            Integer id = tablaEquipos.getItems().get(row).getId();

            try {
                Contexto contexto = new Contexto(Evento.ObtenerDatosEquipo, id);
                Controlador.obtenerInstancia().accion(contexto);

                TOAEntrenadorEquipo eq = (TOAEntrenadorEquipo) contexto.getDatos();

                BorderPane root = (BorderPane) this.tablaEquipos.getScene().getRoot();

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InformacionEquiposUsuarios.fxml"));

                loader.setResources(new ResourceBundle() {
                    @Override
                    protected Object handleGetObject(String key) {
                        return eq;
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
