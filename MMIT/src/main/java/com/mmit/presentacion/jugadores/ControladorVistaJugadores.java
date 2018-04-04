package com.mmit.presentacion.jugadores;

import com.mmit.negocio.jugadores.TOAJugadorEquipo;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import com.mmit.presentacion.equipos.ControladorVistaEquipos;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class ControladorVistaJugadores implements Initializable {

    @FXML
    private TableView<TOAJugadorEquipo> tablaJugadores;
    @FXML
    private TableColumn<TOAJugadorEquipo, String> colNombre;
    @FXML
    private TableColumn<TOAJugadorEquipo, String> colApellidos;
    @FXML
    private TableColumn<TOAJugadorEquipo, String> colEquipo;
    @FXML
    private TableColumn<TOAJugadorEquipo, Integer> colId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (tablaJugadores != null){
            rellenarTabla();
        }       
    } 
    
    private void rellenarTabla(){
        colId.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, Integer>("idJugador"));
        colNombre.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, String>("nombreJugador"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, String>("apellidosJugador"));
        colEquipo.setCellValueFactory(new PropertyValueFactory<TOAJugadorEquipo, String>("nombreEquipo"));
        
        Contexto contexto = new Contexto(Evento.ListarJugadores, null);
        Controlador.obtenerInstancia().accion(contexto);
        
        ArrayList<TOAJugadorEquipo> listaJugadores = (ArrayList<TOAJugadorEquipo>) contexto.getDatos();
        
        if (listaJugadores != null){
            for (TOAJugadorEquipo jugador : listaJugadores){
                tablaJugadores.getItems().add(jugador);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                alert.setHeaderText("Error");
                alert.setContentText("Error al obtener los datos de la BBDD");
                alert.show();
        }
    }
    
    public void seleccionarJugador(){
       
        TablePosition pos = this.tablaJugadores.getSelectionModel().getSelectedCells().get(0);
        int row = pos.getRow();
        
        if (row != -1){
            TableColumn col = pos.getTableColumn();

            Integer id = tablaJugadores.getItems().get(row).getIdJugador();

            try {
                Contexto contexto = new Contexto(Evento.ObtenerDatosJugador, id);
                Controlador.obtenerInstancia().accion(contexto);

                TOAJugadorEquipo jug = (TOAJugadorEquipo) contexto.getDatos();

                BorderPane root = (BorderPane) this.tablaJugadores.getScene().getRoot();

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InformacionJugadoresUsuarios.fxml"));

                loader.setResources(new ResourceBundle() {
                    @Override
                    protected Object handleGetObject(String key) {
                        return jug;
                    }

                    @Override
                    public Enumeration<String> getKeys() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });

                root.setCenter(loader.load());

            } catch (IOException ex) {
                Logger.getLogger(ControladorVistaEquipos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }

    }
    
}
