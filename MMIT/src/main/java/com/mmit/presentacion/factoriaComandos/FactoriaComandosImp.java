package com.mmit.presentacion.factoriaComandos;

import com.mmit.presentacion.Evento;
import com.mmit.presentacion.comando.Comando;
import com.mmit.presentacion.comando.ComandoAbrirLogin;
import com.mmit.presentacion.comando.ComandoAbrirMenuPrincipal;
import com.mmit.presentacion.comando.ComandoPreloader;
import com.mmit.presentacion.comando.ComandoRegistroUsuario;
import com.mmit.presentacion.comando.entrenadores.ComandoAbrirListarEntrenadores;
import com.mmit.presentacion.comando.entrenadores.ComandoAbrirMostrarEntrenador;
import com.mmit.presentacion.comando.equipos.ComandoAbrirListarEquipos;
import com.mmit.presentacion.comando.equipos.ComandoAbrirMostrarEquipo;
import com.mmit.presentacion.comando.jugadores.ComandoAbrirListarJugadores;
import com.mmit.presentacion.comando.jugadores.ComandoAbrirMostrarJugador;
import com.mmit.presentacion.comando.usuarios.ComandoCerrarSesion;
import com.mmit.presentacion.comando.usuarios.ComandoComprobarLogin;

public class FactoriaComandosImp extends FactoriaComandos{

    @Override
    public Comando obtenerComando(Evento evento) {
       switch(evento){
            case AbrirMenuPrincipal:
                return new ComandoAbrirMenuPrincipal();
            case AbrirLogin:
                return new ComandoAbrirLogin();
            case CerrarSesion:
                return new ComandoCerrarSesion();
            case AbrirListarJugadores:
                return new ComandoAbrirListarJugadores();
            case AbrirListarEquipos:
                return new ComandoAbrirListarEquipos();
            case AbrirListarEntrenadores:
                return new ComandoAbrirListarEntrenadores();
            case AbrirMostrarJugador:
                return new ComandoAbrirMostrarJugador();
            case AbrirMostrarEquipo:
                return new ComandoAbrirMostrarEquipo();
            case AbrirMostrarEntrenador:
                return new ComandoAbrirMostrarEntrenador();
            case ComprobarLogin:
                return new ComandoComprobarLogin();
            case RegistroUsuario:
                return new ComandoRegistroUsuario();
            case Preloader:
                return new ComandoPreloader();
            default:
                return null;
        }
    }
    
}
