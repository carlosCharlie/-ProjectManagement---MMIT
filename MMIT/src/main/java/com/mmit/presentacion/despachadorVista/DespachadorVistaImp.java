package com.mmit.presentacion.despachadorVista;


import com.mmit.negocio.usuarios.Login;
import com.mmit.presentacion.ControladorVista;
import com.mmit.presentacion.ControladorVistaMenu;
import com.mmit.presentacion.Evento;
import com.mmit.presentacion.controlador.Contexto;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DespachadorVistaImp extends DespachadorVista {
    
    Stage stage;
    ControladorVista controladorMenu;
    ControladorVista controladorContenido;

    @Override
    public void crearVista(Contexto contexto) {
        switch(contexto.getEvento()) {
            case AbrirMenuPrincipal:
                try{
                    if (stage != null){
                        stage.close();
                    }
                    stage = new Stage();
                    FXMLLoader loaderMenu = new FXMLLoader(getClass().getResource("/fxml/Menu.fxml"));
                    FXMLLoader loaderContenido = new FXMLLoader(getClass().getResource("/fxml/Index.fxml"));

                    AnchorPane menu = (AnchorPane) loaderMenu.load();
                    AnchorPane index = (AnchorPane) loaderContenido.load();
                    
                    controladorMenu = loaderMenu.getController();
                    controladorContenido = loaderContenido.getController();

                    BorderPane borderPane = new BorderPane();
                    borderPane.setLeft(menu);
                    borderPane.setCenter(index);

                    Scene scene = new Scene(borderPane);
                    scene.getStylesheets().add("/styles/Styles.css");

                    if (Login.getUsuario() == null){
                        stage.setTitle("MMIT - Usuario no Registrado");
                    } else {
                        stage.setTitle("MMIT - " + Login.getUsuario().getNombre());
                    }
                    stage.getIcons().add(new Image("/images/logo_nf.png"));
                    stage.centerOnScreen(); 
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException ex) {
                    Logger.getLogger(DespachadorVistaImp.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case AbrirLogin:
            case CerrarSesion:
                try{
                    if (stage != null){
                        stage.close();
                    }
                    
                    if (contexto.getEvento() == Evento.CerrarSesion){
                        Login.setNuevaSesion(null);
                    }
                    
                    stage = new Stage();
                    FXMLLoader loaderContenido = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));

                    AnchorPane index = (AnchorPane) loaderContenido.load();
                    
                    controladorContenido = loaderContenido.getController();

                    BorderPane borderPane = new BorderPane();
                    borderPane.setCenter(index);

                    Scene scene = new Scene(borderPane);
                    scene.getStylesheets().add("/styles/Styles.css");

                    stage.setTitle("MMIT");
                    stage.getIcons().add(new Image("/images/logo_nf.png"));
                    stage.centerOnScreen(); 
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException ex) {
                    Logger.getLogger(DespachadorVistaImp.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case AbrirListarEntrenadores:
                try {
                    BorderPane root = (BorderPane) stage.getScene().getRoot();
                    FXMLLoader loaderContenido = new FXMLLoader(getClass().getResource("/fxml/ListaEntrenadoresUsuarios.fxml"));
                             
                    root.setCenter((AnchorPane) loaderContenido.load());
                    controladorContenido = loaderContenido.getController();
                    controladorContenido.Actualizar(contexto);
                    controladorMenu.Actualizar(new Contexto(Evento.HabilitarMenu, null));
                } catch (IOException ex) {
                    Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case AbrirListarEquipos:
                try {
                    BorderPane root = (BorderPane) stage.getScene().getRoot();
                    FXMLLoader loaderContenido = new FXMLLoader(getClass().getResource("/fxml/ListaEquiposUsuarios.fxml"));
                             
                    root.setCenter((AnchorPane) loaderContenido.load());
                    controladorContenido = loaderContenido.getController();
                    controladorContenido.Actualizar(contexto);
                    controladorMenu.Actualizar(new Contexto(Evento.HabilitarMenu, null));
                } catch (IOException ex) {
                    Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case AbrirListarJugadores:
                try {
                    BorderPane root = (BorderPane) stage.getScene().getRoot();
                    FXMLLoader loaderContenido = new FXMLLoader(getClass().getResource("/fxml/ListaJugadoresUsuarios.fxml"));
                             
                    root.setCenter((AnchorPane) loaderContenido.load());
                    controladorContenido = loaderContenido.getController();
                    controladorContenido.Actualizar(contexto);
                    controladorMenu.Actualizar(new Contexto(Evento.HabilitarMenu, null));
                } catch (IOException ex) {
                    Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case AbrirMostrarEntrenador:
                try {
                    BorderPane root = (BorderPane) stage.getScene().getRoot();
                    FXMLLoader loaderContenido = new FXMLLoader(getClass().getResource("/fxml/InformacionEntrenadoresUsuarios.fxml"));
                             
                    root.setCenter((AnchorPane) loaderContenido.load());
                    controladorContenido = loaderContenido.getController();
                    controladorContenido.Actualizar(contexto);
                } catch (IOException ex) {
                    Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case AbrirMostrarEquipo:
                try {
                    BorderPane root = (BorderPane) stage.getScene().getRoot();
                    FXMLLoader loaderContenido = new FXMLLoader(getClass().getResource("/fxml/InformacionEquiposUsuarios.fxml"));
                             
                    root.setCenter((AnchorPane) loaderContenido.load());
                    controladorContenido = loaderContenido.getController();
                    controladorContenido.Actualizar(contexto);
                } catch (IOException ex) {
                    Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case AbrirMostrarJugador:
                try {
                    BorderPane root = (BorderPane) stage.getScene().getRoot();
                    FXMLLoader loaderContenido = new FXMLLoader(getClass().getResource("/fxml/InformacionJugadoresUsuarios.fxml"));
                             
                    root.setCenter((AnchorPane) loaderContenido.load());
                    controladorContenido = loaderContenido.getController();
                    controladorContenido.Actualizar(contexto);
                } catch (IOException ex) {
                    Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case ErrorUsuario:
            case ErrorContrasena:
                controladorContenido.Actualizar(contexto);
                break;
            case Preloader:
                try {
                    BorderPane root = (BorderPane) stage.getScene().getRoot();
                    FXMLLoader loaderContenido = new FXMLLoader(getClass().getResource("/fxml/Preloader.fxml"));
                             
                    root.setCenter((AnchorPane) loaderContenido.load());
                } catch (IOException ex) {
                    Logger.getLogger(ControladorVistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case ErrorSQL:
                controladorContenido.Actualizar(contexto);
                break;
            default:
                    break;
        }
}

}
