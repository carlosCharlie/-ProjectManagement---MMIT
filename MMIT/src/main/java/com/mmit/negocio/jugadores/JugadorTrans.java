package com.mmit.negocio.jugadores;

public class JugadorTrans {
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer idEquipo;

    public JugadorTrans(Integer id, String nombre, String apellidos, Integer idEquipo) {
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
