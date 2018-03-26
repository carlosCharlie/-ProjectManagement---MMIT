package com.mmit.negocio.entrenadores;


public class EntrenadorTrans {
    
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String equipo;
    
    public EntrenadorTrans(Integer id, String nombre, String apellidos, Integer edad, String equipo){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.equipo = equipo;
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
    
}
