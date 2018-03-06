/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author crash
 */
public enum Eventos {
//Eventos Menú principal

ACCION_CREAR_FORMULARIO,
ACCION_CARGAR_BBDD,


//Mensajes de confirmación/error

RES_CREAR_FORMULARIO_OK,
RES_CREAR_FORMULARIO_ERROR,

RES_CARGAR_BBDD_OK,
RES_CARGAR_BBDD_ERROR,

//Mostrar distintas GUIs
MOSTRAR_MENU,
MOSTRAR_CREAR_FORMULARIO,
MOSTRAR_CARGAR_BBDD,


//Ocultar distintas GUIs
OCULTAR_MENU,
OCULTAR_CREAR_FORMULARIO,
OCULTAR_CARGAR_BBDD,

//Mostrar alerta de "Hola mundo!"
MOSTRAR_HOLA_MUNDO,

//Eventos Ventana Login
COMPROBAR_LOGIN,

LOGIN_OK,
LOGIN_ERROR
}
