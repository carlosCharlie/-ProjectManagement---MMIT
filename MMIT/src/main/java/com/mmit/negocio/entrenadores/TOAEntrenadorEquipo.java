/*
 * Copyright (C) 2018 Your Organisation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mmit.negocio.entrenadores;

import com.mmit.negocio.equipos.EquipoTrans;

/**
 *
 * @author dielam
 */
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
    
    public Integer getEdadEntrenador(){
        return this.entrenador.getEdad();
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
