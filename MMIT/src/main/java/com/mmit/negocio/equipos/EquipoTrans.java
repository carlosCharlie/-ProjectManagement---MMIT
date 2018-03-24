/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.negocio.equipos;

import java.text.NumberFormat;

/**
 *
 * @author carlos
 */
public class EquipoTrans {
    private int id;
    private String nombre;
    private Integer jugados;
    private Integer victorias;
    private Integer derrotas;
    private int entrenador_id;
    private double porcentaje;
    private NumberFormat nf;
    
    public EquipoTrans(int id, String nombre, Integer victorias, Integer derrotas, Integer entrenador_id){
        this.id = id;
        this.nombre = nombre;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.entrenador_id = entrenador_id;
        this.jugados = this.victorias + this.derrotas;
        this.porcentaje = (Double.valueOf(this.victorias) / Double.valueOf(this.jugados)) * 100;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getVictorias() {
        return this.victorias;
    }

    public Integer getDerrotas() {
        return this.derrotas;
    }
    
    public Integer getJugados() {
        return this.jugados;
    }
    
    public Double getPorcentaje() {
        return this.porcentaje;
    }

    public Object getEntrenador() {
        return this.entrenador_id;
    }
}
