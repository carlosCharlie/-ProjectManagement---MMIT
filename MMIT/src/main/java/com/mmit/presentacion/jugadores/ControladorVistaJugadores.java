package com.mmit.presentacion.jugadores;

import com.mmit.negocio.equipos.EquipoTrans;
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

public class ControladorVistaJugadores implements Initializable {

    @FXML
    private TableView<JugadorTrans> tablaJugadores;
    @FXML
    private TableColumn<JugadorTrans, String> colNombre;
    @FXML
    private TableColumn<JugadorTrans, String> colApellidos;
    @FXML
    private TableColumn<JugadorTrans, Integer> colEdad;
    @FXML
    private TableColumn<JugadorTrans, Double> colPeso;
    @FXML
    private TableColumn<JugadorTrans, Double> colAltura;
    @FXML
    private TableColumn<JugadorTrans, String> colEquipo;
    @FXML
    private TableColumn<JugadorTrans, Integer> colId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (tablaJugadores != null){
            rellenarTabla();
        }       
    } 
    
    private void rellenarTabla(){
        colId.setCellValueFactory(new PropertyValueFactory<JugadorTrans, Integer>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<JugadorTrans, String>("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<JugadorTrans, String>("apellidos"));
        colEdad.setCellValueFactory(new PropertyValueFactory<JugadorTrans, Integer>("edad"));
        colPeso.setCellValueFactory(new PropertyValueFactory<JugadorTrans, Double>("peso"));
        colAltura.setCellValueFactory(new PropertyValueFactory<JugadorTrans, Double>("altura"));
        colEquipo.setCellValueFactory(new PropertyValueFactory<JugadorTrans, String>("equipo"));
        
        Contexto contexto = new Contexto(Evento.ListarJugadores, null);
        Controlador.obtenerInstancia().accion(contexto);
        
        ArrayList<JugadorTrans> listaJugadores = (ArrayList<JugadorTrans>) contexto.getDatos();
        
        if (listaJugadores != null){
            for (JugadorTrans jugador : listaJugadores){
                tablaJugadores.getItems().add(jugador);
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
