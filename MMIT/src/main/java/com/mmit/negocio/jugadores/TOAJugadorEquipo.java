package com.mmit.negocio.jugadores;

import com.mmit.negocio.equipos.EquipoTrans;

public class TOAJugadorEquipo {
    
    private EquipoTrans equipo;
    private JugadorTrans jugador;
    
    public TOAJugadorEquipo(JugadorTrans jugador, EquipoTrans equipo){
        this.equipo = equipo;
        this.jugador = jugador;
    }
    
    public Integer getIdJugador(){
        return this.jugador.getId();
    }
    
    public String getNombreJugador(){
        return this.jugador.getNombre();
    }
    
    public String getApellidosJugador(){
        return this.jugador.getApellidos();
    }
    
    public Double getAlturaJugador(){
        return this.jugador.getAltura();
    }
    
    public Double getPesoJugador(){
        return this.jugador.getPeso();
    }
    
    public Integer getEdadJugador(){
        return this.jugador.getEdad();
    }
    
    public Integer getIdEquipo(){
        return this.equipo.getId();
    }
    
    public String getNombreEquipo(){
        return this.equipo.getNombre();
    }
}
