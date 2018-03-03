/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


/**
 *
 * @author Laura
 */
public class Eventos {
//Eventos Menú principal

final public static int ACCION_CREAR_FORMULARIO = 1;
final public static int ACCION_CARGAR_BBDD = 2;


//Mensajes de confirmación/error

final public static int RES_CREAR_FORMULARIO_OK = 3;
final public static int RES_CREAR_FORMULARIO_ERROR=4;

final public static int RES_CARGAR_BBDD_OK=5;
final public static int RES_CARGAR_BBDD_ERROR=6;

//Mostrar distintas GUIs
final public static int MOSTRAR_MENU=7;
final public static int MOSTRAR_CREAR_FORMULARIO=8;
final public static int MOSTRAR_CARGAR_BBDD=9;


//Ocultar distintas GUIs
final public static int OCULTAR_MENU=10;
final public static int OCULTAR_CREAR_FORMULARIO=11;
final public static int OCULTAR_CARGAR_BBDD=12;

//Mostrar alerta de "Hola mundo!"
final public static int MOSTRAR_HOLA_MUNDO=13;


}
