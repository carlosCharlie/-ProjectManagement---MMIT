package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Presentacion.FactoriaGUI;
import Presentacion.Formulario;
import Presentacion.HolaMundo;
import Presentacion.IGUI;
import Presentacion.Listar;
import Presentacion.Vista;
import Negocio.FactoriaSA;
import Negocio.SAFormulario;
import Negocio.SAUsuario;
import Presentacion.Login;
import Presentacion.Usuario;
import java.util.ArrayList;
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
 
 public void accion(Eventos evento, Object datos){    
     if(evento == Eventos.ACCION_CARGAR_BBDD){
        FactoriaSA f= FactoriaSA.getInstancia();
        SAFormulario ff = f.getSAFormulario();
         Vista.actualizar(Eventos.RES_CARGAR_BBDD_OK, ff.leerDatos());
     }
     else if(evento == Eventos.MOSTRAR_MENU){
                  Vista = new Vista();
                  Vista.actualizar(Eventos.MOSTRAR_MENU, null);
          } else if (evento == Eventos.MOSTRAR_CREAR_FORMULARIO){
                  Vista = FactoriaGUI.getInstancia().crearGUIFormulario();
                  Vista.actualizar(Eventos.MOSTRAR_CREAR_FORMULARIO, null);
          } else if (evento == Eventos.MOSTRAR_CARGAR_BBDD){
                  //poner un getInstance en cada GUI
                  Vista = FactoriaGUI.getInstancia().crearGUIListar();
                  Vista.actualizar(Eventos.MOSTRAR_CARGAR_BBDD, datos);
                  /*ArrayList<String> lista = saListar.leerdatos();
                  if(lista!=null)
                      GUICargarBBDD.actualizar(Eventos.RES_CARGAR_BBDD_OK, lista);
                  else 
                      GUICargarBBDD.actualizar(Eventos.RES_CARGAR_BBDD_ERROR, lista);
                  */
                  
          } else if (evento == Eventos.MOSTRAR_HOLA_MUNDO){
                 Vista = new HolaMundo();
                 Vista.actualizar(Eventos.MOSTRAR_HOLA_MUNDO, null);   
          } else if (evento == Eventos.ACCION_CREAR_FORMULARIO){
                  
                  boolean resCrearFormulario = saFormulario.guardardatos((String) datos, "formulario");
                  if(resCrearFormulario){
                  Vista.actualizar(Eventos.RES_CREAR_FORMULARIO_OK, 
                  null);
                  }

                  else Vista.actualizar(Eventos.RES_CREAR_FORMULARIO_ERROR,
                  null);
                  
          } else if (evento ==  Eventos.OCULTAR_MENU){
                  Vista.actualizar(Eventos.OCULTAR_MENU, (String) datos);                
          } else if (evento == Eventos.OCULTAR_CREAR_FORMULARIO){
                  Vista.actualizar(Eventos.OCULTAR_CREAR_FORMULARIO, (String) datos);  
          } else if (evento == Eventos.OCULTAR_CARGAR_BBDD){
                  Vista.actualizar(Eventos.OCULTAR_CARGAR_BBDD, (String) datos);
          } else if (evento == Eventos.MOSTRAR_LOGIN) {
                  Vista = new Login();
                  Vista.actualizar(Eventos.MOSTRAR_LOGIN, null);
          } else if (evento == Eventos.COMPROBAR_LOGIN){
              SAUsuario saUsuario = FactoriaSA.getInstancia().getSAUsuario();
              if (saUsuario.comprobarLogin((Usuario) datos)){
                  Vista.actualizar(Eventos.LOGIN_OK, null);
              } else {
                  Vista.actualizar(Eventos.LOGIN_ERROR, null);
              }
          }
         
     }
      
}