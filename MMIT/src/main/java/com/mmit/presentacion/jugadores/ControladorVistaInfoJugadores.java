package com.mmit.presentacion.jugadores;

import com.mmit.negocio.jugadores.TOAJugadorEquipo;
import com.mmit.presentacion.ControladorVista;
import com.mmit.presentacion.controlador.Contexto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class ControladorVistaInfoJugadores implements Initializable, ControladorVista {
    
    private TOAJugadorEquipo jugador;
    @FXML
    private Label nombreJugador;
    @FXML
    private Label apellidosJugador;
    @FXML
    private Label nombreEquipo;
    @FXML
    private Label edad;
    @FXML
    private Label peso;
    @FXML
    private Label altura;
    @FXML
    private Label mano;
    @FXML
    private Label posicion;
    @FXML
    private Label puntos;
    @FXML
    private Label campoAnotados;
    @FXML
    private Label campoIntentados;
    private Label triplesAnotados;
    private Label triplesIntentados;
    private Label porcentajeTriples;
    private Label libresAnotados;
    private Label libresIntentados;
    private Label porcentajeLibres;
    private Label perdidas;
    private Label rebotesOfensivos;
    private Label rebotesDefensivos;
    private Label tapones;
    private Label asistencias;
    private Label faltas;
    private Label robos;
    @FXML
    private Label porcentajeCampo;
    private Label dosAnotados;
    private Label dosIntentados;
    private Label porcentajeDos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }   
    
    @Override
    public void Actualizar(Contexto contexto) {
        switch(contexto.getEvento()){
            case AbrirMostrarJugador:
                this.jugador = (TOAJugadorEquipo) contexto.getDatos();
                rellenarInformacionBasica();
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
        this.nombreJugador.setText(this.jugador.getNombreJugador());
        this.apellidosJugador.setText(this.jugador.getApellidosJugador());
        this.edad.setText(String.valueOf(this.jugador.getJugador().getEdad()));
        this.peso.setText(String.valueOf(this.jugador.getJugador().getPeso()));
        this.altura.setText(String.valueOf(this.jugador.getJugador().getAltura()));
        if (this.jugador.getEquipo() != null){
            this.nombreEquipo.setText(this.jugador.getEquipo().getNombre());
        } else {
            this.nombreEquipo.setText("-");
        }
        this.posicion.setText(this.jugador.getJugador().getPosicion());
        this.mano.setText(this.jugador.getJugador().getMano());
    }
    
    private void rellenarEstadisticas(){
        this.puntos.setText(String.valueOf(this.jugador.getJugador().getPuntos()));
        this.campoAnotados.setText(String.valueOf(this.jugador.getJugador().getTirosTotalesAnotados()));
        this.campoIntentados.setText(String.valueOf(this.jugador.getJugador().getTirosTotalesIntentados()));
        this.porcentajeCampo.setText(this.jugador.getJugador().getPorcentajeTirosTotales());/*
        this.dosAnotados.setText(String.valueOf(this.jugador.getJugador().getDosAnotados()));
        this.dosIntentados.setText(String.valueOf(this.jugador.getJugador().getDosIntentados()));
        this.porcentajeDos.setText(String.valueOf(this.jugador.getJugador().getDosPorcentaje()));
        this.triplesAnotados.setText(String.valueOf(this.jugador.getJugador().getTresAnotados()));
        this.triplesIntentados.setText(String.valueOf(this.jugador.getJugador().getTresIntentados()));
        this.porcentajeTriples.setText(String.valueOf(this.jugador.getJugador().getTresPorcentaje()));
        this.libresAnotados.setText(String.valueOf(this.jugador.getJugador().getLibresAnotados()));
        this.libresIntentados.setText(String.valueOf(this.jugador.getJugador().getLibresIntentados()));
        this.porcentajeLibres.setText(String.valueOf(this.jugador.getJugador().getLibresPorcentaje()));
        this.rebotesOfensivos.setText(String.valueOf(this.jugador.getJugador().getRebotesOfensivos()));
        this.rebotesDefensivos.setText(String.valueOf(this.jugador.getJugador().getRebotesDefensivos()));
        this.asistencias.setText(String.valueOf(this.jugador.getJugador().getAsistencias()));
        this.robos.setText(String.valueOf(this.jugador.getJugador().getRobos()));
        this.tapones.setText(String.valueOf(this.jugador.getJugador().getTapones()));
        this.faltas.setText(String.valueOf(this.jugador.getJugador().getFaltas()));
        this.perdidas.setText(String.valueOf(this.jugador.getJugador().getPerdidas()));*/
    }

}
