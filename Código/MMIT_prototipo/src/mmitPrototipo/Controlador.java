/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmitPrototipo;
import java.awt.List;
import Vista;
import Modelo;
/**
 *
 * @author Laura
 */
public class Controlador {
 private Vista GUIMenu, GUICrearFormulario, GUICargarBBDD;
 private Modelo modeloFormulario, modeloCargarBBDD;
 public Controlador(){   
  
 }
 
      public void accion(int evento, Object datos){
      
    	  vista = new Vista(); 
          switch(evento){
              case Eventos.MOSTRAR_MENU:
                  if(GUIMenu==null) GUIMenu = new Vista();
                  GUIMenu.actualizar(Eventos.MOSTRAR_MENU, null);
                  break;
                  
              case Eventos.MOSTRAR_CREAR_FORMULARIO:
                 if( GUICrearFormulario == null) GUICrearFormulario = new GUIFormulario();
                  GUICrearFormulario.actualizar(Eventos.MOSTRAR_CREAR_FORMULARIO, null);
                  break;
                  
              case Eventos.MOSTRAR_CARGAR_BBDD:
                  //poner un getInstance en cada GUI
                  if(GUICargarBBDD == null) GUICargarBBDD = new GUICargarBBDD();
                  GUICargarBBDD.actualizar(Eventos.MOSTRAR_CARGAR_BBDD, datos);
                  List<String> lista = modeloCargarBBDD.sacarTodosLosDatos();
                  if(lista!=null)
                      GUICargarBBDD.actualizar(Eventos.RES_CARGAR_BBDD_OK, lista);
                  else 
                      GUICargarBBDD.actualizar(Eventos.RES_CARGAR_BBDD_ERROR, lista);
              
              case Eventos.MOSTRAR_HOLA_MUNDO:
                if( GUIMenu == null) GUIMenu = new GUIMenu();
                 GUIMenu.actualizar(Eventos.MOSTRAR_HOLA_MUNDO, null);
                 break;
                 
              case Eventos.ACCION_CREAR_FORMULARIO:
                  int resCrearFormulario = modeloFormulario.crearFormulario((String) datos);
                  
                  if(resCrearFormulario>0){
                  GUICrearFormulario.actualizar(Eventos.RES_CREAR_FORMULARIO_OK, 
                  resCrearFormulario);
                  }
                  else GUICrearFormulario.actualizar(Eventos.RES_CREAR_FORMULARIO_ERROR,
                  resCrearFormulario);
                  break;
                  
              case Eventos.OCULTAR_MENU:
                  GUIMenu.actualizar(Eventos.OCULTAR_MENU, datos);
                  break;
                  
              case Eventos.OCULTAR_CREAR_FORMULARIO:
                  GUICrearFormulario.actualizar(Eventos.OCULTAR_CREAR_FORMULARIO, datos);
                  break;
                  
              case Eventos.OCULTAR_CARGAR_BBDD:
                  GUICargarBBDD.actualizar(Eventos.OCULTAR_CARGAR_BBDD, datos);
                  break;
              
          }
         
     }
      
}
