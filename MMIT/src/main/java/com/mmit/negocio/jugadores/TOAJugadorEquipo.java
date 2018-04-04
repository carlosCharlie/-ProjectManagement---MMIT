package com.mmit.negocio.jugadores;

import com.mmit.negocio.equipos.EquipoTrans;

public class TOAJugadorEquipo {
    
    private EquipoTrans equipo;
    private JugadorTrans jugador;
    
    public TOAJugadorEquipo(JugadorTrans jugador, EquipoTrans equipo){
        this.equipo = equipo;
        this.jugador = jugador;
    }
    
    public EquipoTrans getEquipo(){
        return this.equipo;
    }
    
    public JugadorTrans getJugador(){
        return this.jugador;
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
        
    public Integer getIdEquipo(){
        return this.equipo.getId();
    }
    
    public String getNombreEquipo(){
        if (this.equipo == null){
            return "-";
        } else {
            return this.equipo.getNombre();
        }
        
    }
}
