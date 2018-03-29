package com.mmit.presentacion.jugadores;

import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.jugadores.JugadorTrans;
import com.mmit.negocio.jugadores.TOAJugadorEquipo;
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
    private TableView<TOAJugadorEquipo> tablaJugadores;
    @FXML
    private TableColumn<TOAJugadorEquipo, String> colNombre;
    @FXML
    private TableColumn<TOAJugadorEquipo, String> colApellidos;
    @FXML
    private TableColumn<TOAJugadorEquipo, String> colEquipo;
    @FXML
    private TableColumn<TOAJugadorEquipo, Integer> colId;

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
        colId.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, Integer>("idJugador"));
        colNombre.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, String>("nombreJugador"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, String>("apellidosJugador"));
        colEquipo.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, String>("nombreEquipo"));
        
        Contexto contexto = new Contexto(Evento.ListarJugadores, null);
        Controlador.obtenerInstancia().accion(contexto);
        
        ArrayList<TOAJugadorEquipo> listaJugadores = (ArrayList<TOAJugadorEquipo>) contexto.getDatos();
        
        if (listaJugadores != null){
            for (TOAJugadorEquipo jugador : listaJugadores){
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
