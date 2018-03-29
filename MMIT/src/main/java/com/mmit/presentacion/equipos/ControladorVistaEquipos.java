package com.mmit.presentacion.equipos;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class ControladorVistaEquipos implements Initializable {

    @FXML
    private TableView<EquipoTrans> tablaEquipos;
    @FXML
    private TableColumn<EquipoTrans, String> colNombre;
    @FXML
    private TableColumn<EquipoTrans, Integer> colPJ;
    @FXML
    private TableColumn<EquipoTrans, Integer> colPG;
    @FXML
    private TableColumn<EquipoTrans, Integer> colPP;
    @FXML
    private TableColumn<EquipoTrans, Double> colPor;
    @FXML
    private TableColumn<EquipoTrans, Integer> colId;
   
    private ArrayList<EquipoTrans> listaEquipos=null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        if (tablaEquipos != null){
            rellenarTabla();
        }       
    } 
    
    private void rellenarTabla(){
        
        colId.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<EquipoTrans, String>("nombre"));
        colPG.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("victorias"));
        colPP.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("derrotas"));
        colPJ.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Integer>("jugados"));
        colPor.setCellValueFactory(new PropertyValueFactory<EquipoTrans, Double>("porcentaje"));        
        
        Contexto contexto = new Contexto(Evento.ListarEquipos, null);
        Controlador.obtenerInstancia().accion(contexto);
        
        listaEquipos = (ArrayList<EquipoTrans>) contexto.getDatos();
        
        if (listaEquipos != null){
            for (EquipoTrans equipo : listaEquipos){
                tablaEquipos.getItems().add(equipo);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                alert.setHeaderText("Error");
                alert.setContentText("Error al obtener los datos de la BBDD");
                alert.show();
        }

    }
    
    public void seleccionarEquipo(){
       int filaSeleccionada = this.tablaEquipos.getSelectionModel().getSelectedIndex();
       
       if(filaSeleccionada!=-1){
           
           try {
               Contexto contexto = new Contexto(Evento.ObtenerDatosEquipo,this.listaEquipos.get(filaSeleccionada).getId());
               Controlador.obtenerInstancia().accion(contexto);
               
               BorderPane root = (BorderPane) this.tablaEquipos.getScene().getRoot();
               FXMLLoader fxmlLoader = new FXMLLoader();
               
               ControladorVistaInfoEquipos c = new ControladorVistaInfoEquipos();
               
               
               FXMLLoader loader;
               loader = new FXMLLoader(getClass().getResource("/fxml/InformacionEquiposUsuarios.fxml"));
               loader.setController(c);
               
               root.setCenter((AnchorPane) loader.load());
               
               TOAEntrenadorEquipo eq = (TOAEntrenadorEquipo)contexto.getDatos();

               if(eq.getEntrenador()!= null){
               c.setEntrenador(eq.getNombreEntrenador()+" "+eq.getApellidosEntrenador());
               }
               else{
                   c.setEntrenador("Entrenador no asignado");
               }
               c.setNombre(eq.getNombreEquipo());
           
           } catch (IOException ex) {
               Logger.getLogger(ControladorVistaEquipos.class.getName()).log(Level.SEVERE, null, ex);
           }
        
       }
    }
    
}
