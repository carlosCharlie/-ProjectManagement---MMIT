package com.mmit.negocio.entrenadores;


public class EntrenadorTrans {
    
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer victorias;
    private Integer derrotas;
    private Integer idEquipo;
    
    public EntrenadorTrans(Integer id, String nombre, String apellidos, Integer idEquipo){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idEquipo = idEquipo;
    }
    
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public Integer getIdEquipo(){
        return idEquipo;
    }
    
}
