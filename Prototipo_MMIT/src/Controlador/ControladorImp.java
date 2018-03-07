package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Presentacion.IGUI;
import Negocio.FactoriaSA;
import Negocio.SAFormulario;
import Negocio.SAUsuario;
import Presentacion.Login;
import Presentacion.MenuPrincipal;
import Presentacion.Usuario;
/**
 *
 * @author Laura
 */
public class ControladorImp extends Controlador{
 private IGUI Vista;
 
private final SAFormulario saFormulario;


ControladorImp(){
    
    this.saFormulario=FactoriaSA.getInstancia().getSAFormulario();

}
 
 @Override
 public void accion(Eventos evento, Object datos){ 
     
    switch (evento) {
        case setFinalistaDe:
        case setFinalistaIz:
            Vista.actualizar(evento, datos);
            break;
        case ACCION_CARGAR_BBDD:
            FactoriaSA f= FactoriaSA.getInstancia();
            SAFormulario ff = f.getSAFormulario();
            Vista.actualizar(Eventos.RES_CARGAR_BBDD_OK, ff.leerDatos());
            break;
        case ACCION_INSERTAR_FORMULARIO:
            boolean resCrearFormulario = saFormulario.guardardatos((String) datos);
            if (resCrearFormulario){
                Vista.actualizar(Eventos.RES_CREAR_FORMULARIO_OK,
                        null);
            } else {
                Vista.actualizar(Eventos.RES_CREAR_FORMULARIO_ERROR,
                    null);
            }
            break;
        case MOSTRAR_MENU:
            Vista = new MenuPrincipal();
            Vista.actualizar(Eventos.MOSTRAR_MENU, null);
            break;
        case MOSTRAR_HOLA_MUNDO:
            Vista.actualizar(Eventos.MOSTRAR_HOLA_MUNDO, null);
            break;
        case MOSTRAR_LOGIN:
            Vista = new Login();
            Vista.actualizar(Eventos.MOSTRAR_LOGIN, null);
            break;
        case COMPROBAR_LOGIN:
            SAUsuario saUsuario = FactoriaSA.getInstancia().getSAUsuario();
            if (saUsuario.comprobarLogin((Usuario) datos)){
                Vista.actualizar(Eventos.LOGIN_OK, null);
            } else {
                Vista.actualizar(Eventos.LOGIN_ERROR, null);
            }
            break;
        default:
            break;
        }
         
     }
      
}