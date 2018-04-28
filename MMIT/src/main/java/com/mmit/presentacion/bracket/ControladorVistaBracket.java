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
        
        Celda1.textProperty().bind(Login.getBracket().get(0).getPropiedadNombre());
        Celda2.textProperty().bind(Login.getBracket().get(1).getPropiedadNombre());
        Celda3.textProperty().bind(Login.getBracket().get(2).getPropiedadNombre());
        Celda4.textProperty().bind(Login.getBracket().get(3).getPropiedadNombre());
        Celda9.textProperty().bind(Login.getBracket().get(4).getPropiedadNombre());
        Celda10.textProperty().bind(Login.getBracket().get(5).getPropiedadNombre());
        Celda11.textProperty().bind(Login.getBracket().get(6).getPropiedadNombre());
        Celda12.textProperty().bind(Login.getBracket().get(7).getPropiedadNombre());
        
        Celda5.textProperty().bind(Login.getBracket().get(8).getPropiedadNombre());
        Celda6.textProperty().bind(Login.getBracket().get(9).getPropiedadNombre());
        Celda7.textProperty().bind(Login.getBracket().get(10).getPropiedadNombre());
        Celda8.textProperty().bind(Login.getBracket().get(11).getPropiedadNombre());     
        Celda13.textProperty().bind(Login.getBracket().get(12).getPropiedadNombre());
        Celda14.textProperty().bind(Login.getBracket().get(13).getPropiedadNombre());
        Celda15.textProperty().bind(Login.getBracket().get(14).getPropiedadNombre());
        Celda16.textProperty().bind(Login.getBracket().get(15).getPropiedadNombre());
        
        Celda17.textProperty().bind(Login.getBracket().get(16).getPropiedadNombre());
        Celda18.textProperty().bind(Login.getBracket().get(17).getPropiedadNombre());
        Celda21.textProperty().bind(Login.getBracket().get(18).getPropiedadNombre());
        Celda22.textProperty().bind(Login.getBracket().get(19).getPropiedadNombre());
        
        Celda19.textProperty().bind(Login.getBracket().get(20).getPropiedadNombre());
        Celda20.textProperty().bind(Login.getBracket().get(21).getPropiedadNombre());      
        Celda23.textProperty().bind(Login.getBracket().get(22).getPropiedadNombre());
        Celda24.textProperty().bind(Login.getBracket().get(23).getPropiedadNombre());
        
        Celda25.textProperty().bind(Login.getBracket().get(24).getPropiedadNombre());
        Celda27.textProperty().bind(Login.getBracket().get(25).getPropiedadNombre());
        
        Celda26.textProperty().bind(Login.getBracket().get(26).getPropiedadNombre());
        Celda28.textProperty().bind(Login.getBracket().get(27).getPropiedadNombre());
        
        Celda29.textProperty().bind(Login.getBracket().get(28).getPropiedadNombre());
        Celda30.textProperty().bind(Login.getBracket().get(29).getPropiedadNombre());
        
        Celda31.textProperty().bind(Login.getBracket().get(30).getPropiedadNombre());
  
    }
    
    @FXML
    private void ElegirEquipo(MouseEvent event){
        if (!event.getSource().equals("")){
            
            if (event.getSource() == Celda1 && Login.getBracket().get(24).getNombre() == null){
                
                Login.getBracket().get(16).setNombre(Login.getBracket().get(0).getNombre());
                
            } else if (event.getSource() == Celda2 && Login.getBracket().get(24).getNombre() == null){
                
                Login.getBracket().get(16).setNombre(Login.getBracket().get(1).getNombre());
                
            } else if (event.getSource() == Celda3 && Login.getBracket().get(24).getNombre() == null){
                
                Login.getBracket().get(17).setNombre(Login.getBracket().get(2).getNombre());
                
            } else if (event.getSource() == Celda4 && Login.getBracket().get(24).getNombre() == null){
                
                Login.getBracket().get(17).setNombre(Login.getBracket().get(3).getNombre());
                
            } else if (event.getSource() == Celda5 && Login.getBracket().get(26).getNombre() == null){
                
                Login.getBracket().get(20).setNombre(Login.getBracket().get(8).getNombre());
                
            } else if (event.getSource() == Celda6 && Login.getBracket().get(26).getNombre() == null){
                
                Login.getBracket().get(20).setNombre(Login.getBracket().get(9).getNombre());
                
            } else if (event.getSource() == Celda7 && Login.getBracket().get(26).getNombre() == null){
                
                Login.getBracket().get(21).setNombre(Login.getBracket().get(10).getNombre());
                
            } else if (event.getSource() == Celda8 && Login.getBracket().get(26).getNombre() == null){
                
                Login.getBracket().get(21).setNombre(Login.getBracket().get(11).getNombre());
                
            } else if (event.getSource() == Celda9 && Login.getBracket().get(25).getNombre() == null){
                
                Login.getBracket().get(18).setNombre(Login.getBracket().get(4).getNombre());
                
            } else if (event.getSource() == Celda10 && Login.getBracket().get(25).getNombre() == null){
                
                Login.getBracket().get(18).setNombre(Login.getBracket().get(5).getNombre());
                
            } else if (event.getSource() == Celda11 && Login.getBracket().get(25).getNombre() == null){
                
                Login.getBracket().get(19).setNombre(Login.getBracket().get(6).getNombre());
                
            } else if (event.getSource() == Celda12 && Login.getBracket().get(25).getNombre() == null){
                
                Login.getBracket().get(19).setNombre(Login.getBracket().get(7).getNombre());
                
            } else if (event.getSource() == Celda13 && Login.getBracket().get(27).getNombre() == null){
                
                Login.getBracket().get(22).setNombre(Login.getBracket().get(12).getNombre());
                
            } else if (event.getSource() == Celda14 && Login.getBracket().get(27).getNombre() == null){
                
                Login.getBracket().get(22).setNombre(Login.getBracket().get(13).getNombre());
                
            } else if (event.getSource() == Celda15 && Login.getBracket().get(27).getNombre() == null){
                
                Login.getBracket().get(23).setNombre(Login.getBracket().get(14).getNombre());
                
            } else if (event.getSource() == Celda16 && Login.getBracket().get(27).getNombre() == null){
                
                Login.getBracket().get(23).setNombre(Login.getBracket().get(15).getNombre());
                
            } else if (event.getSource() == Celda17 && Login.getBracket().get(17).getNombre() != null && Login.getBracket().get(28).getNombre() == null){
                
                Login.getBracket().get(24).setNombre(Login.getBracket().get(16).getNombre());
                
            } else if (event.getSource() == Celda18 && Login.getBracket().get(16).getNombre() != null && Login.getBracket().get(28).getNombre() == null){
                
                Login.getBracket().get(24).setNombre(Login.getBracket().get(17).getNombre());
                
            } else if (event.getSource() == Celda19 && Login.getBracket().get(21).getNombre() != null && Login.getBracket().get(29).getNombre() == null){
                
                Login.getBracket().get(26).setNombre(Login.getBracket().get(20).getNombre());
                
            } else if (event.getSource() == Celda20 && Login.getBracket().get(20).getNombre() != null && Login.getBracket().get(29).getNombre() == null){
                
                Login.getBracket().get(26).setNombre(Login.getBracket().get(21).getNombre());
                
            } else if (event.getSource() == Celda21 && Login.getBracket().get(19).getNombre() != null && Login.getBracket().get(28).getNombre() == null){
                
                Login.getBracket().get(25).setNombre(Login.getBracket().get(18).getNombre());
                
            } else if (event.getSource() == Celda22 && Login.getBracket().get(18).getNombre() != null && Login.getBracket().get(28).getNombre() == null){
                
                Login.getBracket().get(25).setNombre(Login.getBracket().get(19).getNombre());
                
            } else if (event.getSource() == Celda23 && Login.getBracket().get(23).getNombre() != null && Login.getBracket().get(29).getNombre() == null){
                
                Login.getBracket().get(27).setNombre(Login.getBracket().get(22).getNombre());
                
            } else if (event.getSource() == Celda24 && Login.getBracket().get(22).getNombre() != null && Login.getBracket().get(29).getNombre() == null){
                
                Login.getBracket().get(27).setNombre(Login.getBracket().get(23).getNombre());
                
            } else if (event.getSource() == Celda25 && Login.getBracket().get(26).getNombre() != null && Login.getBracket().get(30).getNombre() == null){
                
                Login.getBracket().get(28).setNombre(Login.getBracket().get(24).getNombre());
                
            } else if (event.getSource() == Celda26 && Login.getBracket().get(24).getNombre() != null && Login.getBracket().get(30).getNombre() == null){
                
                Login.getBracket().get(29).setNombre(Login.getBracket().get(26).getNombre());
                
            } else if (event.getSource() == Celda27 && Login.getBracket().get(27).getNombre() != null && Login.getBracket().get(30).getNombre() == null){
                
                Login.getBracket().get(28).setNombre(Login.getBracket().get(25).getNombre());
                
            } else if (event.getSource() == Celda28 && Login.getBracket().get(25).getNombre() != null && Login.getBracket().get(30).getNombre() == null){
                
                Login.getBracket().get(29).setNombre(Login.getBracket().get(27).getNombre());
                
            } else if (event.getSource() == Celda29 && Login.getBracket().get(29).getNombre() != null){
                
                Login.getBracket().get(30).setNombre(Login.getBracket().get(28).getNombre());
                
            } else if (event.getSource() == Celda30 && Login.getBracket().get(28).getNombre() != null){
                
                Login.getBracket().get(30).setNombre(Login.getBracket().get(29).getNombre());
                
            }
            
        }
    }
    
}
