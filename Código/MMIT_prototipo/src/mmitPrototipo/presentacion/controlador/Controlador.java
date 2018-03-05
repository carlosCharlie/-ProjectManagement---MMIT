/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmitPrototipo.presentacion.controlador;
import java.awt.List;
import java.util.ArrayList;
import mmitPrototipo.presentacion.vistas.*;
import mmitPrototipo.integracion.Dao;
import mmitPrototipo.presentacion.Eventos;
/**
 *
 * @author Laura
 */
public class Controlador {
 private Vista GUIMenu;
 private Formulario GUICrearFormulario;
 private Listar GUICargarBBDD;
 private HolaMundo GUIHolaMundo;
 private Dao modeloFormulario;
 private Dao modeloCargarBBDD;
 
 public Controlador(){   
  
 }
 
 public void accion(int evento, Object datos){
       
          switch(evento){
              case Eventos.MOSTRAR_MENU:
                  if(GUIMenu==null) GUIMenu = new Vista();
                  GUIMenu.actualizar(Eventos.MOSTRAR_MENU, null);
                  break;
                  
              case Eventos.MOSTRAR_CREAR_FORMULARIO:
                 if( GUICrearFormulario == null) GUICrearFormulario = new Formulario();
                  GUICrearFormulario.actualizar(Eventos.MOSTRAR_CREAR_FORMULARIO, null);
                  break;
                  
              case Eventos.MOSTRAR_CARGAR_BBDD:
                  //poner un getInstance en cada GUI
                  if(GUICargarBBDD == null) GUICargarBBDD = new Listar();
                  GUICargarBBDD.actualizar(Eventos.MOSTRAR_CARGAR_BBDD, datos);
                  ArrayList<String> lista = modeloCargarBBDD.leerdatos();
                  if(lista!=null)
                      GUICargarBBDD.actualizar(Eventos.RES_CARGAR_BBDD_OK, lista);
                  else 
                      GUICargarBBDD.actualizar(Eventos.RES_CARGAR_BBDD_ERROR, lista);
              
              case Eventos.MOSTRAR_HOLA_MUNDO:
                if( GUIMenu == null) GUIHolaMundo = new HolaMundo();
                 GUIHolaMundo.actualizar(Eventos.MOSTRAR_HOLA_MUNDO, null);
                 break;
                 
              case Eventos.ACCION_CREAR_FORMULARIO:
            	  // Ni idea...
                  boolean resCrearFormulario = modeloFormulario.guardardatos((String) datos, niPutaIdea);
                  // Ni idea...
                  if(resCrearFormulario){
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
