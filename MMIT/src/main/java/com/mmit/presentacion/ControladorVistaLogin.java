package com.mmit.presentacion;

import com.mmit.negocio.usuarios.Login;
import com.mmit.negocio.usuarios.UsuarioTrans;
import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.controlador.Controlador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField; 

public class ControladorVistaLogin implements Initializable, ControladorVista{

    @FXML
    private TextField usuario;
    @FXML
    private PasswordField contrasena;
    @FXML
    private Label errorUsuario;
    @FXML
    private Label errorContrasena;
    @FXML
    private Label errorUsuarioVacio;
    @FXML
    private Label errorContrasenaVacia;
    @FXML
    private Button sinInicio;
    @FXML
    private Button botonRegistro;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @Override
    public void Actualizar(Contexto contexto) {
        switch(contexto.getEvento()){
            case ErrorUsuario:
                this.errorUsuario.setVisible(true);
                this.contrasena.setText("");
                break;
            case ErrorContrasena:
                this.errorContrasena.setVisible(true);
                this.contrasena.setText("");
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
    
    @FXML
    private void aceptar(){
        this.errorUsuario.setVisible(false);
        this.errorContrasena.setVisible(false);
        this.errorUsuarioVacio.setVisible(false);
        this.errorContrasenaVacia.setVisible(false);
        if (!this.usuario.getText().equals("") && !this.contrasena.getText().equals("")){
            UsuarioTrans usuarioTrans = new UsuarioTrans(this.usuario.getText(), this.contrasena.getText());
            Controlador.obtenerInstancia().accion(new Contexto(Evento.ComprobarLogin, usuarioTrans));
        } else {
            if (this.usuario.getText().equals("")){
                this.errorUsuarioVacio.setVisible(true);
            }
            if (this.contrasena.getText().equals("")){
                this.errorContrasenaVacia.setVisible(true);
            }
        }
    }
    
    @FXML
    private void noLogin(){
            Login.setNuevaSesion(new UsuarioTrans(null, null));
            Controlador.obtenerInstancia().accion(new Contexto(Evento.AbrirMenuPrincipal, null));
    }
    
    @FXML
    private void registrar(){
        this.errorUsuario.setVisible(false);
        this.errorContrasena.setVisible(false);
        this.errorUsuarioVacio.setVisible(false);
        this.errorContrasenaVacia.setVisible(false);
        if (!this.usuario.getText().equals("") && !this.contrasena.getText().equals("")){
            UsuarioTrans usuarioTrans = new UsuarioTrans(this.usuario.getText(), this.contrasena.getText());
            Controlador.obtenerInstancia().accion(new Contexto(Evento.RegistroUsuario, usuarioTrans));
        } else {
            if (this.usuario.getText().equals("")){
                this.errorUsuarioVacio.setVisible(true);
            }
            if (this.contrasena.getText().equals("")){
                this.errorContrasenaVacia.setVisible(true);
            }
        }
    }
    
}
