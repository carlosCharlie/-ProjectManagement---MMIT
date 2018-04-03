package com.mmit.presentacion.equipos;

import com.mmit.negocio.equipos.TOAEntrenadorEquipoJugadores;
import com.mmit.negocio.jugadores.JugadorTrans;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControladorVistaInfoEquipos implements Initializable {

    private TOAEntrenadorEquipoJugadores equipo;
    @FXML
    private Label nombreEquipo;
    @FXML
    private Label nombreEntrenador;
    @FXML
    private Label apellidosEntrenador;
    @FXML
    private TableColumn<JugadorTrans, String> nombreJugador;
    @FXML
    private TableColumn<JugadorTrans, String> apellidosJugador;
    @FXML
    private TableView<JugadorTrans> tablaJugadores;
    @FXML
    private TableColumn<JugadorTrans, String> posicionJugador;
    @FXML
    private Label derrotas;
    @FXML
    private Label victorias;
    @FXML
    private Label porcentaje;
    @FXML
    private Label anotados;
    @FXML
    private Label recibidos;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        this.equipo = (TOAEntrenadorEquipoJugadores) rb.getObject("");
        this.nombreEquipo.setText(this.equipo.getNombreEquipo());
        if (this.equipo.getEntrenador() != null){
            this.nombreEntrenador.setText(this.equipo.getNombreEntrenador());
            this.apellidosEntrenador.setText(this.equipo.getApellidosEntrenador());
        } else {
            this.nombreEntrenador.setText("-");
        }
        rellenarTabla();
        rellenarEstadisticas();
    }
    
    private void rellenarTabla(){
        
        nombreJugador.setCellValueFactory(new PropertyValueFactory<JugadorTrans, String>("nombre"));
        apellidosJugador.setCellValueFactory(new PropertyValueFactory<JugadorTrans, String>("apellidos"));
        posicionJugador.setCellValueFactory(new PropertyValueFactory<JugadorTrans, String>("posicion"));
        
        ArrayList<JugadorTrans> listaJugadores = (ArrayList<JugadorTrans>) this.equipo.getJugadores();
        
        if (listaJugadores != null){
            for (JugadorTrans equipo : listaJugadores){
                tablaJugadores.getItems().add(equipo);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                alert.setHeaderText("Error");
                alert.setContentText("Error al obtener los datos de la BBDD");
                alert.show();
        }

    }
    
    private void rellenarEstadisticas(){
        this.victorias.setText(String.valueOf(this.equipo.getEquipo().getVictorias()) + "V");
        this.derrotas.setText(String.valueOf(this.equipo.getEquipo().getDerrotas()) + "D");
        this.porcentaje.setText("(" + String.valueOf(this.equipo.getEquipo().getPorcentaje()) + ")");
        this.anotados.setText(String.valueOf(5678));
        this.recibidos.setText(String.valueOf(1234));
        //this.anotados.setText(String.valueOf(this.equipo.getEquipo().getAnotados()));
        //this.recibidos.setText(String.valueOf(this.equipo.getEquipo().getRecibidos()));
    }
}