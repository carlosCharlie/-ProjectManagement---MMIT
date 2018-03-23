/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.negocio.equipos;

/**
 *
 * @author carlos
 */
public class EquipoTrans {
    private int id;
    private String nombre;
    private int victorias;
    private int derrotas;
    private int entrenador_id;
    
    public EquipoTrans(int id, String nombre, int victorias, int derrotas,int entrenador_id){
        this.id=id;
        this.nombre=nombre;
        this.victorias=victorias;
        this.derrotas=derrotas;
        this.entrenador_id=entrenador_id;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getVictorias() {
        return this.victorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public Object getEntrenador() {
        return this.entrenador_id;
    }
}
