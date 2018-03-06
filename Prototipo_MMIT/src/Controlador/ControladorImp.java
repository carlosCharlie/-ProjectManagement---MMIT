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
import Presentacion.Usuario;
import java.util.ArrayList;
/**
 *
 * @author Laura
 */
public class ControladorImp extends Controlador{
 private IGUI GUIMenu, GUICrearFormulario, GUICargarBBDD, GUIHolaMundo, Login;
 
private final SAFormulario saFormulario;


ControladorImp(){
    
    this.saFormulario=FactoriaSA.getInstancia().getSAFormulario();

}
 
 public void accion(Eventos evento, Object datos){    
     if(evento == Eventos.ACCION_CARGAR_BBDD){
        FactoriaSA f= FactoriaSA.getInstancia();
        SAFormulario ff = f.getSAFormulario();
         GUIMenu.actualizar(Eventos.RES_CARGAR_BBDD_OK, ff.leerDatos());
     }
     else if(evento == Eventos.MOSTRAR_MENU){
                  if(GUIMenu==null) GUIMenu = new Vista();
                  GUIMenu.actualizar(Eventos.MOSTRAR_MENU, null);
          } else if (evento == Eventos.MOSTRAR_CREAR_FORMULARIO){
                  GUICrearFormulario=FactoriaGUI.getInstancia().crearGUIFormulario();
                  GUICrearFormulario.actualizar(Eventos.MOSTRAR_CREAR_FORMULARIO, null);
          } else if (evento == Eventos.MOSTRAR_CARGAR_BBDD){
                  //poner un getInstance en cada GUI
                  GUICargarBBDD = FactoriaGUI.getInstancia().crearGUIListar();
                  GUICargarBBDD.actualizar(Eventos.MOSTRAR_CARGAR_BBDD, datos);
                  /*ArrayList<String> lista = saListar.leerdatos();
                  if(lista!=null)
                      GUICargarBBDD.actualizar(Eventos.RES_CARGAR_BBDD_OK, lista);
                  else 
                      GUICargarBBDD.actualizar(Eventos.RES_CARGAR_BBDD_ERROR, lista);
                  */
                  
          } else if (evento == Eventos.MOSTRAR_HOLA_MUNDO){
                if( GUIHolaMundo == null){
                    GUIHolaMundo = new HolaMundo();
                }
                 GUIHolaMundo.actualizar(Eventos.MOSTRAR_HOLA_MUNDO, null);   
          } else if (evento == Eventos.ACCION_CREAR_FORMULARIO){
                  
                  boolean resCrearFormulario = saFormulario.guardardatos((String) datos, "formulario");
                  if(resCrearFormulario){
                  GUIMenu.actualizar(Eventos.RES_CREAR_FORMULARIO_OK, 
                  null);
                  }

                  else GUIMenu.actualizar(Eventos.RES_CREAR_FORMULARIO_ERROR,
                  null);
                  
          } else if (evento ==  Eventos.OCULTAR_MENU){
                  GUIMenu.actualizar(Eventos.OCULTAR_MENU, (String) datos);                
          } else if (evento == Eventos.OCULTAR_CREAR_FORMULARIO){
                  GUICrearFormulario.actualizar(Eventos.OCULTAR_CREAR_FORMULARIO, (String) datos);  
          } else if (evento == Eventos.OCULTAR_CARGAR_BBDD){
                  GUICargarBBDD.actualizar(Eventos.OCULTAR_CARGAR_BBDD, (String) datos);
          } else if (evento == Eventos.COMPROBAR_LOGIN){
              SAUsuario saUsuario = FactoriaSA.getInstancia().getSAUsuario();
              if (saUsuario.comprobarLogin((Usuario) datos)){
                  Login.actualizar(Eventos.LOGIN_OK, null);
              } else {
                  Login.actualizar(Eventos.LOGIN_ERROR, null);
              }
          }
         
     }
      
}