package com.mmit.negocio.jugadores;

public class JugadorTrans {
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private double peso;
    private double altura;
    private Integer idEquipo;

    public JugadorTrans(Integer id, String nombre, String apellidos, double altura, Integer edad, double peso, Integer idEquipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
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
    
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    public Integer getIdEquipo(){
        return idEquipo;
    }
    
}
