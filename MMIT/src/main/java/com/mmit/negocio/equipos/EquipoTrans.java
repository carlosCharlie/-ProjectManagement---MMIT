package com.mmit.negocio.equipos;

import java.text.DecimalFormat;

public class EquipoTrans {
    private int id;
    private String nombre;
    private Integer victorias;
    private Integer derrotas;
    private Integer jugados;
    private int entrenador_id;
    private double porcentaje;
    private Integer anotados;
    private Integer recibidos;
    private Integer campoAnotados;
    private Integer campoIntentados;
    private Integer tresAnotados;
    private Integer tresIntentados;
    private Integer libresAnotados;
    private Integer libresIntentados;
    private Integer rebotesOfensivos;
    private Integer rebotesTotales;
    private Integer asistencias;
    private Integer robos;
    private Integer faltas;
    private Integer puntos;
    private Integer tapones;
    private Integer perdidas;

    
    public EquipoTrans(int id, String nombre, Integer victorias, Integer derrotas){
        this.id = id;
        this.nombre = nombre;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.jugados = this.victorias + this.derrotas;
        this.porcentaje = (Double.valueOf(this.victorias) / Double.valueOf(this.jugados)) * 100;
    }

    public EquipoTrans(int id, String nombre, Integer victorias, Integer derrotas, int entrenador_id,
			Integer anotados, Integer recibidos, Integer campoAnotados, Integer campoIntentados,
			Integer tresAnotados, Integer tresIntentados, Integer libresAnotados, Integer libresIntentados,
			Integer rebotesOfensivos, Integer rebotesTotales, Integer asistencias, Integer robos, Integer faltas,
			Integer puntos, Integer tapones, Integer perdidas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.jugados = this.victorias + this.derrotas;
		this.entrenador_id = entrenador_id;
		this.porcentaje = (Double.valueOf(this.victorias) / Double.valueOf(this.jugados)) * 100;
		this.anotados = anotados;
		this.recibidos = recibidos;
		this.campoAnotados = campoAnotados;
		this.campoIntentados = campoIntentados;
		this.tresAnotados = tresAnotados;
		this.tresIntentados = tresIntentados;
		this.libresAnotados = libresAnotados;
		this.libresIntentados = libresIntentados;
		this.rebotesOfensivos = rebotesOfensivos;
		this.rebotesTotales = rebotesTotales;
		this.asistencias = asistencias;
		this.robos = robos;
		this.faltas = faltas;
		this.puntos = puntos;
		this.tapones = tapones;
		this.perdidas = perdidas;
	}

    
	public int getId() {
		return id;
	}


	

	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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


	public Integer getJugados() {
		return jugados;
	}


	public void setJugados(Integer jugados) {
		this.jugados = jugados;
	}


	public int getEntrenador_id() {
		return entrenador_id;
	}


	public void setEntrenador_id(int entrenador_id) {
		this.entrenador_id = entrenador_id;
	}


	public Double getPorcentaje() {
            DecimalFormat df = new DecimalFormat("#,00");
            Double valor = Double.valueOf(df.format(porcentaje));
            return valor;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}


	public Integer getAnotados() {
		return anotados;
	}


	public void setAnotados(Integer anotados) {
		this.anotados = anotados;
	}


	public Integer getRecibidos() {
		return recibidos;
	}


	public void setRecibidos(Integer recibidos) {
		this.recibidos = recibidos;
	}


	public Integer getCampoAnotados() {
		return campoAnotados;
	}


	public void setCampoAnotados(Integer campoAnotados) {
		this.campoAnotados = campoAnotados;
	}


	public Integer getCampoIntentados() {
		return campoIntentados;
	}


	public void setCampoIntentados(Integer campoIntentados) {
		this.campoIntentados = campoIntentados;
	}


	public Integer getTresAnotados() {
		return tresAnotados;
	}


	public void setTresAnotados(Integer tresAnotados) {
		this.tresAnotados = tresAnotados;
	}


	public Integer getTresIntentados() {
		return tresIntentados;
	}


	public void setTresIntentados(Integer tresIntentados) {
		this.tresIntentados = tresIntentados;
	}


	public Integer getLibresAnotados() {
		return libresAnotados;
	}


	public void setLibresAnotados(Integer libresAnotados) {
		this.libresAnotados = libresAnotados;
	}


	public Integer getLibresIntentados() {
		return libresIntentados;
	}


	public void setLibresIntentados(Integer libresIntentados) {
		this.libresIntentados = libresIntentados;
	}


	public Integer getRebotesOfensivos() {
		return rebotesOfensivos;
	}


	public void setRebotesOfensivos(Integer rebotesOfensivos) {
		this.rebotesOfensivos = rebotesOfensivos;
	}


	public Integer getRebotesTotales() {
		return rebotesTotales;
	}


	public void setRebotesTotales(Integer rebotesTotales) {
		this.rebotesTotales = rebotesTotales;
	}


	public Integer getAsistencias() {
		return asistencias;
	}


	public void setAsistencias(Integer asistencias) {
		this.asistencias = asistencias;
	}


	public Integer getRobos() {
		return robos;
	}


	public void setRobos(Integer robos) {
		this.robos = robos;
	}


	public Integer getFaltas() {
		return faltas;
	}


	public void setFaltas(Integer faltas) {
		this.faltas = faltas;
	}


	public Integer getPuntos() {
		return puntos;
	}


	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}


	public Integer getTapones() {
		return tapones;
	}


	public void setTapones(Integer tapones) {
		this.tapones = tapones;
	}


	public Integer getPerdidas() {
		return perdidas;
	}


	public void setPerdidas(Integer perdidas) {
		this.perdidas = perdidas;
	}


}
