package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GUIs.FactoriaGUI;
import GUIs.Formulario;
import GUIs.HolaMundo;
import GUIs.IGUI;
import GUIs.Listar;
import GUIs.Vista;
import Negocio.FactoriaSA;
import Negocio.SAFormulario;
import Negocio.SAListar;
import java.util.ArrayList;
/**
 *
 * @author Laura
 */
public class ControladorImp extends Controlador{
 private IGUI GUIMenu, GUICrearFormulario, GUICargarBBDD, GUIHolaMundo;
 
private final SAFormulario saFormulario;
private final SAListar saListar;

ControladorImp(){
    
    this.saFormulario=FactoriaSA.getInstancia().getSAFormulario();
    this.saListar=FactoriaSA.getInstancia().getSAListar();
}
 
 public void accion(Eventos evento, String datos){    
          if(evento == Eventos.MOSTRAR_MENU){
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
                  /*
                  boolean resCrearFormulario = saFormulario.guardardatos((String) datos, null);
                  if(resCrearFormulario){
                  GUICrearFormulario.actualizar(Eventos.RES_CREAR_FORMULARIO_OK, 
                  resCrearFormulario);
                  }
                  else GUICrearFormulario.actualizar(Eventos.RES_CREAR_FORMULARIO_ERROR,
                  resCrearFormulario);
                  break;
*/
                  
          } else if (evento ==  Eventos.OCULTAR_MENU){
                  GUIMenu.actualizar(Eventos.OCULTAR_MENU, (String) datos);                
          } else if (evento == Eventos.OCULTAR_CREAR_FORMULARIO){
                  GUICrearFormulario.actualizar(Eventos.OCULTAR_CREAR_FORMULARIO, (String) datos);  
          } else if (evento == Eventos.OCULTAR_CARGAR_BBDD){
                  GUICargarBBDD.actualizar(Eventos.OCULTAR_CARGAR_BBDD, (String) datos);
          }
         
     }
      
}