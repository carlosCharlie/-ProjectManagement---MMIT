package com.mmit.presentacion.entrenadores;

import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.jugadores.JugadorTrans;
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
    private TableView<EntrenadorTrans> tablaEntrenadores;
    @FXML
    private TableColumn<EntrenadorTrans, String> colNombre;
    @FXML
    private TableColumn<EntrenadorTrans, String> colApellidos;
    @FXML
    private TableColumn<EntrenadorTrans, Integer> colEdad;
    @FXML
    private TableColumn<EntrenadorTrans, Integer> colId;
    @FXML
    private TableColumn<EntrenadorTrans, String> colEquipo;
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
        colId.setCellValueFactory(new PropertyValueFactory<EntrenadorTrans, Integer>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<EntrenadorTrans, String>("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<EntrenadorTrans, String>("apellidos"));
        colEdad.setCellValueFactory(new PropertyValueFactory<EntrenadorTrans, Integer>("edad"));
        colEquipo.setCellValueFactory(new PropertyValueFactory<EntrenadorTrans, String>("equipo"));
        
        Contexto contexto = new Contexto(Evento.ListarEntrenadores, null);
        Controlador.obtenerInstancia().accion(contexto);
        
        ArrayList<EntrenadorTrans> listaEntrenadores = (ArrayList<EntrenadorTrans>) contexto.getDatos();
        
        if (listaEntrenadores != null){
            for (EntrenadorTrans entrenador : listaEntrenadores){
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
