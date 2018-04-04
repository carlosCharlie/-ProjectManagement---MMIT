package com.mmit.negocio.entrenadores;


public class EntrenadorTrans {
    
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer victorias;
    private Integer derrotas;
    private Integer edad;
    private Integer idEquipo;
    
    public EntrenadorTrans(Integer id, String nombre, String apellidos, Integer idEquipo){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idEquipo = idEquipo;
    }

    public EntrenadorTrans(Integer id, String nombre, String apellidos, Integer victorias, Integer derrotas, Integer edad, Integer idEquipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.edad = edad;
        this.idEquipo = idEquipo;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getVictorias() {
		return victorias;
	}

	public void setVictorias(Integer victorias) {
		this.victorias = victorias;
	}

	public Integer getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo = idEquipo;
	}
        
}
