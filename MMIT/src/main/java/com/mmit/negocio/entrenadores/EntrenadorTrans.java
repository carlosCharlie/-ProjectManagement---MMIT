package com.mmit.negocio.entrenadores;


public class EntrenadorTrans {
    
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private Integer idEquipo;
    
    public EntrenadorTrans(Integer id, String nombre, String apellidos, Integer edad, Integer idEquipo){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public Integer getEdad() {
        return edad;
    }
    
    public Integer getIdEquipo(){
        return idEquipo;
    }
    
}
