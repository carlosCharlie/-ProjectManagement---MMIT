package com.mmit.presentacion.equipos;

import com.mmit.negocio.equipos.TOAEntrenadorEquipoJugadores;
import com.mmit.negocio.jugadores.JugadorTrans;
import com.mmit.presentacion.ControladorVista;
import com.mmit.presentacion.controlador.Contexto;
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

public class ControladorVistaInfoEquipos implements Initializable, ControladorVista {

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
    private Label puntosAnotados;
    @FXML
    private Label puntosRecibidos;
    @FXML
    private Label triplesAnotados;
    @FXML
    private Label porcentajeTriples;
    @FXML
    private Label libresAnotados;
    @FXML
    private Label porcentajeLibres;
    @FXML
    private Label perdidas;
    @FXML
    private Label rebotesOfensivos;
    @FXML
    private Label tapones;
    @FXML
    private Label asistencias;
    @FXML
    private Label faltas;
    @FXML
    private Label robos;
    @FXML
    private Label triplesIntentados;
    @FXML
    private Label libresIntentados;
    @FXML
    private Label rebotesTotales;
    @FXML
    private Label dosAnotados;
    @FXML
    private Label dosIntentados;
    @FXML
    private Label porcentajeDos;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        
    }
    
    @Override
    public void Actualizar(Contexto contexto) {
        switch(contexto.getEvento()){
            case AbrirMostrarEquipo:
                this.equipo = (TOAEntrenadorEquipoJugadores) contexto.getDatos();
                rellenarInformacionBasica();
                rellenarTabla();
                rellenarEstadisticas();
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
    
    private void rellenarInformacionBasica(){
        this.nombreEquipo.setText(this.equipo.getNombreEquipo());
        if (this.equipo.getEntrenador() != null){
            this.nombreEntrenador.setText(this.equipo.getNombreEntrenador());
            this.apellidosEntrenador.setText(this.equipo.getApellidosEntrenador());
        } else {
            this.nombreEntrenador.setText("-");
        }
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
        
        if (this.equipo.getEquipo().getAnotados() != null){
            this.puntosAnotados.setText(String.valueOf(this.equipo.getEquipo().getAnotados()));
        } else {
            this.puntosAnotados.setText("-");
        }
        
        if (this.equipo.getEquipo().getRecibidos() != null){
            this.puntosRecibidos.setText(String.valueOf(this.equipo.getEquipo().getRecibidos()));
        } else {
            this.puntosRecibidos.setText("-");
        }
        
        if (this.equipo.getEquipo().getVictorias() != null && this.equipo.getEquipo().getDerrotas() != null){
            this.victorias.setText(String.valueOf(this.equipo.getEquipo().getVictorias()) + "V");
            this.derrotas.setText(String.valueOf(this.equipo.getEquipo().getDerrotas()) + "D");
            this.porcentaje.setText("(" + this.equipo.getEquipo().getPorcentaje() + "%)");
        } else {
            this.victorias.setText("-V");
            this.derrotas.setText("-D");
            this.porcentaje.setText("(-%)");
        }
        
        if (this.equipo.getEquipo().getDosAnotados() != null && this.equipo.getEquipo().getDosIntentados() != null){
            this.dosAnotados.setText(String.valueOf(this.equipo.getEquipo().getDosAnotados()));
            this.dosIntentados.setText(String.valueOf(this.equipo.getEquipo().getDosIntentados()));
            this.porcentajeDos.setText(String.valueOf(this.equipo.getEquipo().getDosPorcentaje()));
        } else {
            this.dosAnotados.setText("-");
            this.dosIntentados.setText("-");
            this.porcentajeDos.setText("-");
        }
       
        if (this.equipo.getEquipo().getTresAnotados() != null && this.equipo.getEquipo().getTresIntentados() != null){
            this.triplesAnotados.setText(String.valueOf(this.equipo.getEquipo().getTresAnotados()));
            this.triplesIntentados.setText(String.valueOf(this.equipo.getEquipo().getTresIntentados()));
            this.porcentajeTriples.setText(String.valueOf(this.equipo.getEquipo().getTresPorcentaje()));
        } else {
            this.triplesAnotados.setText("-");
            this.triplesIntentados.setText("-");
            this.porcentajeTriples.setText("-");
        }
        
        if (this.equipo.getEquipo().getLibresAnotados() != null && this.equipo.getEquipo().getLibresIntentados() != null){
            this.libresAnotados.setText(String.valueOf(this.equipo.getEquipo().getLibresAnotados()));
            this.libresIntentados.setText(String.valueOf(this.equipo.getEquipo().getLibresIntentados()));
            this.porcentajeLibres.setText(String.valueOf(this.equipo.getEquipo().getLibresPorcentaje()));
        } else {
            this.libresAnotados.setText("-");
            this.libresIntentados.setText("-");
            this.porcentajeLibres.setText("-");
        }
        
        if (this.equipo.getEquipo().getRebotesOfensivos() != null){
            this.rebotesOfensivos.setText(String.valueOf(this.equipo.getEquipo().getRebotesOfensivos()));
        } else {
            this.rebotesOfensivos.setText("-");
        }
        
        if (this.equipo.getEquipo().getRebotesTotales() != null){
            this.rebotesTotales.setText(String.valueOf(this.equipo.getEquipo().getRebotesTotales()));
        } else {
            this.rebotesTotales.setText("-");
        }
        
        if (this.equipo.getEquipo().getAsistencias() != null){        
            this.asistencias.setText(String.valueOf(this.equipo.getEquipo().getAsistencias()));
        } else {
            this.asistencias.setText("-");
        }
        
        if (this.equipo.getEquipo().getFaltas() != null){   
            this.faltas.setText(String.valueOf(this.equipo.getEquipo().getFaltas()));
        } else {
            this.faltas.setText("-");
        }
        
        if (this.equipo.getEquipo().getPerdidas() != null){
            this.perdidas.setText(String.valueOf(this.equipo.getEquipo().getPerdidas()));
        } else {
            this.perdidas.setText("-");
        }
        
        if (this.equipo.getEquipo().getFaltas() != null){
            this.tapones.setText(String.valueOf(this.equipo.getEquipo().getTapones()));
        } else {
            this.perdidas.setText("-");
        }
        
        if (this.equipo.getEquipo().getFaltas() != null){
            this.robos.setText(String.valueOf(this.equipo.getEquipo().getRobos()));
        } else {
            this.perdidas.setText("-");
        }

    }
}