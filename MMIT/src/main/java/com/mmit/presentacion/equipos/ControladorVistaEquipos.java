package com.mmit.presentacion.equipos;

import com.mmit.negocio.equipos.EquipoTrans;
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
        
        ArrayList<EquipoTrans> listaEquipos = (ArrayList<EquipoTrans>) contexto.getDatos();
        
        if (listaEquipos != null){
            for (EquipoTrans equipo : listaEquipos){
                tablaEquipos.getItems().add(equipo);
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
