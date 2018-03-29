package com.mmit.negocio.equipos;

public class EquipoTrans {
    private int id;
    private String nombre;
    private Integer jugados;
    private Integer victorias;
    private Integer derrotas;
    private int entrenador_id;
    private double porcentaje;
    
    public EquipoTrans(int id, String nombre, Integer victorias, Integer derrotas){
        this.id = id;
        this.nombre = nombre;
        this.victorias = victorias;
        this.derrotas = derrotas;
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
