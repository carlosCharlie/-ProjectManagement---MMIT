package com.mmit.presentacion.equipos;

import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.usuarios.Login;
import com.mmit.presentacion.ControladorVista;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControladorVistaEquipos implements Initializable, ControladorVista {

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
    private TableColumn<EquipoTrans, String> colPor;
    @FXML
    private TableColumn<EquipoTrans, Integer> colId;
   
    private ObservableList<EquipoTrans> listaEquipos = null;
    @FXML
    private TextField buscar;
    @FXML
    private Button botonAñadir;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
             
    } 
    
    @Override
    public void Actualizar(Contexto contexto) {
        switch(contexto.getEvento()){
            case AbrirListarEquipos:
                if (Login.getUsuario() != null){
                    if (Login.getUsuario().getAdmin()){
                        this.botonAñadir.setVisible(true);
                    }
                }
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
        
        colId.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<EquipoTrans, String>("nombre"));
        colPG.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("victorias"));
        colPP.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("derrotas"));
        colPJ.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("jugados"));
        colPor.setCellValueFactory(new PropertyValueFactory<EquipoTrans, String>("porcentaje"));        
        
        
        
        listaEquipos = FXCollections.observableArrayList((ArrayList<EquipoTrans>) datos);

        FilteredList<EquipoTrans> filteredData = new FilteredList<>(listaEquipos, p -> true);

        buscar.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(nombre-> {

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String lowerCaseFilter = newValue.toLowerCase();

                if (nombre.getNombre().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                }
                return false;
            });
        });

        SortedList<EquipoTrans> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tablaEquipos.comparatorProperty());

        tablaEquipos.setItems(sortedData);

    }
 
    @FXML
    public void seleccionarEquipo(){
       
        TablePosition pos = this.tablaEquipos.getSelectionModel().getSelectedCells().get(0);
        int row = pos.getRow();

            TableColumn col = pos.getTableColumn();

            Integer id = tablaEquipos.getItems().get(row).getId();

            Contexto contexto = new Contexto(Evento.AbrirMostrarEquipo, id);

            Controlador.obtenerInstancia().accion(contexto);
    }    
}
