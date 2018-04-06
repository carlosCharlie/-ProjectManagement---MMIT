package com.mmit.presentacion.jugadores;

import com.mmit.negocio.jugadores.TOAJugadorEquipo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ControladorVistaInfoJugadores implements Initializable {
    
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
    @FXML
    private Label triplesAnotados;
    @FXML
    private Label triplesIntentados;
    @FXML
    private Label porcentajeTriples;
    @FXML
    private Label libresAnotados;
    @FXML
    private Label libresIntentados;
    @FXML
    private Label porcentajeLibres;
    @FXML
    private Label perdidas;
    @FXML
    private Label rebotesOfensivos;
    @FXML
    private Label rebotesDefensivos;
    @FXML
    private Label tapones;
    @FXML
    private Label asistencias;
    @FXML
    private Label faltas;
    @FXML
    private Label robos;
    @FXML
    private Label porcentajeCampo;
    @FXML
    private Label dosAnotados;
    @FXML
    private Label dosIntentados;
    @FXML
    private Label porcentajeDos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.jugador = (TOAJugadorEquipo) rb.getObject("");
        rellenarInformacionBasica();
        rellenarEstadisticas();
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
        this.campoAnotados.setText(String.valueOf(this.jugador.getJugador().getCampoAnotados()));
        this.campoIntentados.setText(String.valueOf(this.jugador.getJugador().getCampoIntentados()));
        this.porcentajeCampo.setText(String.valueOf(this.jugador.getJugador().getCampoPorcentaje()));
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
        this.perdidas.setText(String.valueOf(this.jugador.getJugador().getPerdidas()));
    }
}
