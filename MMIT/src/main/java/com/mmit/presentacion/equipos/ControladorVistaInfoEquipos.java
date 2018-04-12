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
    private Label campoAnotados;
    @FXML
    private Label porcentajeCampo;
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
    private Label campoIntentados;
    @FXML
    private Label triplesIntentados;
    @FXML
    private Label libresIntentados;
    @FXML
    private Label rebotesTotales;
    private Label tirosAnotados;
    private Label tirosIntentados;
    private Label porcentajeTiros;

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
        this.puntosAnotados.setText(String.valueOf(this.equipo.getEquipo().getAnotados()));
        this.puntosRecibidos.setText(String.valueOf(this.equipo.getEquipo().getRecibidos()));
        
        this.victorias.setText(String.valueOf(this.equipo.getEquipo().getVictorias()) + "V");
        this.derrotas.setText(String.valueOf(this.equipo.getEquipo().getDerrotas()) + "D");
        this.porcentaje.setText("(" + this.equipo.getEquipo().getPorcentaje() + "%)");
        this.campoAnotados.setText(String.valueOf(this.equipo.getEquipo().getCampoAnotados()));
        this.campoIntentados.setText(String.valueOf(this.equipo.getEquipo().getCampoIntentados()));
        this.porcentajeCampo.setText(String.valueOf(this.equipo.getEquipo().getCampoPorcentaje()));
        this.triplesAnotados.setText(String.valueOf(this.equipo.getEquipo().getTresAnotados()));
        this.triplesIntentados.setText(String.valueOf(this.equipo.getEquipo().getTresIntentados()));
        this.porcentajeTriples.setText(String.valueOf(this.equipo.getEquipo().getTresPorcentaje()));
        this.libresAnotados.setText(String.valueOf(this.equipo.getEquipo().getTresAnotados()));
        this.libresIntentados.setText(String.valueOf(this.equipo.getEquipo().getTresIntentados()));
        this.porcentajeLibres.setText(String.valueOf(this.equipo.getEquipo().getLibresPorcentaje()));
        this.rebotesOfensivos.setText(String.valueOf(this.equipo.getEquipo().getRebotesOfensivos()));
        this.rebotesTotales.setText(String.valueOf(this.equipo.getEquipo().getRebotesTotales()));
        this.asistencias.setText(String.valueOf(this.equipo.getEquipo().getAsistencias()));
        this.faltas.setText(String.valueOf(this.equipo.getEquipo().getFaltas()));
        this.perdidas.setText(String.valueOf(this.equipo.getEquipo().getPerdidas()));
        this.tapones.setText(String.valueOf(this.equipo.getEquipo().getTapones()));
        this.robos.setText(String.valueOf(this.equipo.getEquipo().getRobos()));

    }
}