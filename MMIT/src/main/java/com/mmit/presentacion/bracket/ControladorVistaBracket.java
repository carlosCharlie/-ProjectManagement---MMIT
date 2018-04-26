package com.mmit.presentacion.bracket;

import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.usuarios.Login;
import com.mmit.presentacion.*;
import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ControladorVistaBracket implements Initializable, ControladorVista{

    @FXML
    private Label Celda1;
    @FXML
    private Label Celda2;
    @FXML
    private Label Celda3;
    @FXML
    private Label Celda4;
    @FXML
    private Label Celda5;
    @FXML
    private Label Celda6;
    @FXML
    private Label Celda7;
    @FXML
    private Label Celda8;
    @FXML
    private Label Celda9;
    @FXML
    private Label Celda10;
    @FXML
    private Label Celda11;
    @FXML
    private Label Celda12;
    @FXML
    private Label Celda13;
    @FXML
    private Label Celda14;
    @FXML
    private Label Celda15;
    @FXML
    private Label Celda16;
    @FXML
    private Label Celda17;
    @FXML
    private Label Celda18;
    @FXML
    private Label Celda19;
    @FXML
    private Label Celda20;
    @FXML
    private Label Celda21;
    @FXML
    private Label Celda22;
    @FXML
    private Label Celda23;
    @FXML
    private Label Celda24;
    @FXML
    private Label Celda25;
    @FXML
    private Label Celda26;
    @FXML
    private Label Celda27;
    @FXML
    private Label Celda28;
    @FXML
    private Label Celda29;
    @FXML
    private Label Celda30;
    @FXML
    private Label Celda31;
    
    ArrayList<EquipoTrans> celdas;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    @Override
    public void Actualizar(Contexto contexto) {
        switch (contexto.getEvento()){
            case AbrirHacerBracket:
                Controlador.obtenerInstancia().accion(new Contexto(Evento.RellenarBracket, null));
                break;
            case RellenarBracket:
                InicializarBracket();
                break;
            default:
                break;
        }
    }
    
    private void InicializarBracket(){
        celdas = Login.getBracket();
        
        Celda1.textProperty().bind(celdas.get(0).getPropiedadNombre());
        Celda2.textProperty().bind(celdas.get(1).getPropiedadNombre());
        Celda3.textProperty().bind(celdas.get(2).getPropiedadNombre());
        Celda4.textProperty().bind(celdas.get(3).getPropiedadNombre());
        Celda5.textProperty().bind(celdas.get(4).getPropiedadNombre());
        Celda6.textProperty().bind(celdas.get(5).getPropiedadNombre());
        Celda7.textProperty().bind(celdas.get(6).getPropiedadNombre());
        Celda8.textProperty().bind(celdas.get(7).getPropiedadNombre());
        
        Celda9.textProperty().bind(celdas.get(8).getPropiedadNombre());
        Celda10.textProperty().bind(celdas.get(9).getPropiedadNombre());
        Celda11.textProperty().bind(celdas.get(10).getPropiedadNombre());
        Celda12.textProperty().bind(celdas.get(11).getPropiedadNombre());
        Celda13.textProperty().bind(celdas.get(12).getPropiedadNombre());
        Celda14.textProperty().bind(celdas.get(13).getPropiedadNombre());
        Celda15.textProperty().bind(celdas.get(14).getPropiedadNombre());
        Celda16.textProperty().bind(celdas.get(15).getPropiedadNombre());
        
        Celda17.textProperty().bind(celdas.get(16).getPropiedadNombre());
        Celda18.textProperty().bind(celdas.get(17).getPropiedadNombre());
        Celda19.textProperty().bind(celdas.get(18).getPropiedadNombre());
        Celda20.textProperty().bind(celdas.get(19).getPropiedadNombre());
        
        Celda21.textProperty().bind(celdas.get(20).getPropiedadNombre());
        Celda22.textProperty().bind(celdas.get(21).getPropiedadNombre());
        Celda23.textProperty().bind(celdas.get(22).getPropiedadNombre());
        Celda24.textProperty().bind(celdas.get(23).getPropiedadNombre());
        
        Celda25.textProperty().bind(celdas.get(24).getPropiedadNombre());
        Celda26.textProperty().bind(celdas.get(25).getPropiedadNombre());
        
        Celda27.textProperty().bind(celdas.get(26).getPropiedadNombre());
        Celda28.textProperty().bind(celdas.get(27).getPropiedadNombre());
        
        Celda29.textProperty().bind(celdas.get(28).getPropiedadNombre());
        Celda30.textProperty().bind(celdas.get(29).getPropiedadNombre());
        
        Celda31.textProperty().bind(celdas.get(30).getPropiedadNombre());
  
    }
    
    @FXML
    private void PruebaCambio(MouseEvent event){
        if (event.getSource() == Celda1){
            celdas.get(2).setNombre(celdas.get(0).getNombre());
        } else if (event.getSource() == Celda2){
            celdas.get(2).setNombre(celdas.get(1).getNombre());
        }
    }
    
}
