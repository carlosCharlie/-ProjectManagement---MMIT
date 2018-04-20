package com.mmit.presentacion.jugadores;

import com.grafico.graficotriangular.GraficoTriangular;
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
    @FXML
    private GraficoTriangular grafico;

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
                rellenarGrafico();
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
        
        if (this.jugador.getJugador().getEdad() != null){
            this.edad.setText(String.valueOf(this.jugador.getJugador().getEdad()));
        } else {
            this.edad.setText("-");
        }
        
        if (this.jugador.getJugador().getPeso() != 0.0){
            this.peso.setText(String.valueOf(this.jugador.getJugador().getPeso()));
        } else {
            this.peso.setText("-");
        }
        
        if (this.jugador.getJugador().getAltura() != 0.0){
            this.altura.setText(String.valueOf(this.jugador.getJugador().getAltura()));
        } else {
            this.altura.setText("-");
        }
        
        if (this.jugador.getEquipo() != null){
            this.nombreEquipo.setText(this.jugador.getEquipo().getNombre());
        } else {
            this.nombreEquipo.setText("-");
        }
        
        if (this.jugador.getJugador().getPosicion() != null){
            this.posicion.setText(this.jugador.getJugador().getPosicion());
        } else {
            this.posicion.setText("-");
        }
        
        if (this.jugador.getJugador().getMano() != null){
            this.mano.setText(this.jugador.getJugador().getMano());
        } else {
            this.mano.setText("-");
        }
    }
    
    private void rellenarEstadisticas(){
        if (this.jugador.getJugador().getPuntos() != null){
            this.puntos.setText(String.valueOf(this.jugador.getJugador().getPuntos()));
        } else {
            this.puntos.setText("-");
        }
        
        if (this.jugador.getJugador().getCampoAnotados() <= this.jugador.getJugador().getCampoIntentados()){
            this.campoAnotados.setText(String.valueOf(this.jugador.getJugador().getCampoAnotados()));
            this.campoIntentados.setText(String.valueOf(this.jugador.getJugador().getCampoIntentados())); 
            this.porcentajeCampo.setText(this.jugador.getJugador().getCampoPorcentaje());
        } else {
            this.campoAnotados.setText("-");
            this.campoIntentados.setText("-"); 
            this.porcentajeCampo.setText("-");
        }
        
        if (this.jugador.getJugador().getDosIntentados() <= this.jugador.getJugador().getDosIntentados()){
            this.dosAnotados.setText(String.valueOf(this.jugador.getJugador().getDosAnotados()));
            this.dosIntentados.setText(String.valueOf(this.jugador.getJugador().getDosIntentados()));
            this.porcentajeDos.setText(String.valueOf(this.jugador.getJugador().getDosPorcentaje()));
        } else {
            this.dosAnotados.setText("-");
            this.dosIntentados.setText("-");
            this.porcentajeDos.setText("-");
        }
        
        if (this.jugador.getJugador().getTresAnotados() <= this.jugador.getJugador().getTresIntentados()){
            this.triplesAnotados.setText(String.valueOf(this.jugador.getJugador().getTresAnotados()));
            this.triplesIntentados.setText(String.valueOf(this.jugador.getJugador().getTresIntentados()));
            this.porcentajeTriples.setText(String.valueOf(this.jugador.getJugador().getTresPorcentaje()));
        } else {
            this.triplesAnotados.setText("-");
            this.triplesIntentados.setText("-");
            this.porcentajeTriples.setText("-");
        }
        
        if (this.jugador.getJugador().getLibresAnotados() <= this.jugador.getJugador().getLibresIntentados()){
            this.libresAnotados.setText(String.valueOf(this.jugador.getJugador().getLibresAnotados()));
            this.libresIntentados.setText(String.valueOf(this.jugador.getJugador().getLibresIntentados()));
            this.porcentajeLibres.setText(String.valueOf(this.jugador.getJugador().getLibresPorcentaje()));
        } else {
            this.libresAnotados.setText("-");
            this.libresIntentados.setText("-");
            this.porcentajeLibres.setText("-");
        }
        
        if (this.jugador.getJugador().getRebotesOfensivos() != null){
            this.rebotesOfensivos.setText(String.valueOf(this.jugador.getJugador().getRebotesOfensivos()));
        } else {
            this.rebotesOfensivos.setText("-");
        }
        
        if (this.jugador.getJugador().getRebotesDefensivos() != null){
            this.rebotesDefensivos.setText(String.valueOf(this.jugador.getJugador().getRebotesDefensivos()));
        } else {
            this.rebotesDefensivos.setText("-");
        }
        
        if (this.jugador.getJugador().getAsistencias() != null){
            this.asistencias.setText(String.valueOf(this.jugador.getJugador().getAsistencias()));
        } else {
            this.asistencias.setText("-");
        }
        
        if (this.jugador.getJugador().getRobos() != null){
            this.robos.setText(String.valueOf(this.jugador.getJugador().getRobos()));
        } else {
            this.robos.setText("-");
        }
        
        if (this.jugador.getJugador().getTapones() != null){
            this.tapones.setText(String.valueOf(this.jugador.getJugador().getTapones()));
        } else {
            this.tapones.setText("-");
        }
        
        if (this.jugador.getJugador().getFaltas() != null){
            this.faltas.setText(String.valueOf(this.jugador.getJugador().getFaltas()));
        } else {
            this.faltas.setText("-");
        }
        
        if (this.jugador.getJugador().getPerdidas() != null){
            this.perdidas.setText(String.valueOf(this.jugador.getJugador().getPerdidas()));
        } else {
            this.perdidas.setText("-");
        }
        
    }

    private void rellenarGrafico(){
        this.grafico.setPorcentajeA(Double.valueOf(this.jugador.getJugador().getDosPorcentaje()));
        this.grafico.setVariableA("Tiros de 2");
        this.grafico.setPorcentajeB(Double.valueOf(this.jugador.getJugador().getTresPorcentaje()));
        this.grafico.setVariableB("Tiros de 3");
        this.grafico.setPorcentajeC(Double.valueOf(this.jugador.getJugador().getLibresPorcentaje()));
        this.grafico.setVariableC("Tiros Libres");
    }
}
