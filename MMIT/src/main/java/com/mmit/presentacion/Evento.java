
package com.mmit.presentacion;

public enum Evento {
    //Eventos Comunes
    ErrorSQL,
    AbrirMenuPrincipal,
    AbrirLogin,
    Preloader,
    HabilitarMenu,
    
    //Eventos Equipos
    ListarEquipos,
    ObtenerDatosEquipo,
    AbrirListarEquipos,
    AbrirMostrarEquipo,
    
    //Eventos Entrenadores
    ListarEntrenadores,
    ObtenerDatosEntrenador,
    AbrirListarEntrenadores,
    AbrirMostrarEntrenador,
    
    //Eventos Jugadores
    ListarJugadores,
    ObtenerDatosJugador,
    AbrirListarJugadores,
    AbrirMostrarJugador, 
    
    //Eventos Usuarios
    ComprobarLogin,
    UsuarioCorrecto,
    ErrorUsuario,
    ErrorContrasena,
    CerrarSesion,
    RegistroUsuario,
    ErrorUsuarioDuplicado,
    
    
    //Eventos Bracket
    AbrirHacerBracket, 
    RellenarBracket, 
    
}
