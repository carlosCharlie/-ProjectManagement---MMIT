package com.mmit.presentacion.bracket;

import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.presentacion.*;
import com.mmit.presentacion.controlador.Contexto;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
                InicializarBracket();
                break;
            default:
                break;
        }
    }
    
    private void InicializarBracket(){
        celdas = new ArrayList<EquipoTrans>();
        
        celdas.add(new EquipoTrans(1, "Movistar Estudiantes"));
        celdas.add(new EquipoTrans(2, "Real Madrid"));
        celdas.add(new EquipoTrans(3, null));
        
        Celda1.textProperty().bind(celdas.get(0).getPropiedadNombre());
        Celda2.textProperty().bind(celdas.get(1).getPropiedadNombre());
        Celda17.textProperty().bind(celdas.get(2).getPropiedadNombre());

    }
    
    @FXML
    private void PruebaCambio(ActionEvent event){
        if (event.getSource() == Celda1){
            celdas.get(2).setNombre(celdas.get(0).getNombre());
        } else if (event.getSource() == Celda2){
            celdas.get(2).setNombre(celdas.get(1).getNombre());
        }
    }
    
}
