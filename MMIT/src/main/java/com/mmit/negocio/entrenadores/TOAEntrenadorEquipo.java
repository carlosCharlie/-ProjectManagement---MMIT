package com.mmit.negocio.entrenadores;

import com.mmit.negocio.equipos.EquipoTrans;

public class TOAEntrenadorEquipo {
    
    private EquipoTrans equipo;
    private EntrenadorTrans entrenador;
    
    public TOAEntrenadorEquipo(EntrenadorTrans entrenador, EquipoTrans equipo){
        this.equipo = equipo;
        this.entrenador = entrenador;
    }
    
    public EntrenadorTrans getEntrenador(){
        return entrenador;
    }
    public Integer getIdEntrenador(){
        return this.entrenador.getId();
    }
    
    public String getNombreEntrenador(){
        return this.entrenador.getNombre();
    }
    
    public String getApellidosEntrenador(){
        return this.entrenador.getApellidos();
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
