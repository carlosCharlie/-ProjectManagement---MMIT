package com.mmit.negocio.jugadores;

public class JugadorTrans {

    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer idEquipo;
    private Integer edad;
    private double peso;
    private double altura;
    private String posicion;
    private Integer partidos;
    private Integer minutos;
    private Integer campoAnotados;
    private Integer campoIntentados;
    private Integer campoFallados;
    private double campoPorcentaje;
    private Integer dosAnotados;
    private Integer dosIntentados;
    private Integer dosFallados;
    private double dosPorcentaje;
    private Integer tresAnotados;
    private Integer tresIntentados;
    private Integer tresFallados;
    private double tresPorcentaje;
    private Integer libresAnotados;
    private Integer libresIntentados;
    private Integer libresFallados;
    private double libresPorcentaje;
    private Integer rebotesOfensivos;
    private Integer rebotesDefensivos;
    private Integer asistencias;
    private Integer robos;
    private Integer faltas;
    private Integer puntos;
    private Integer tapones;
    private Integer perdidas;

    public JugadorTrans(Integer id, String nombre, String apellidos, Integer idEquipo, Integer edad, double peso, double altura, String posicion, Integer partidos, Integer minutos, Integer campoAnotados, Integer campoIntentados, Integer dosAnotados, Integer dosIntentados, Integer tresAnotados, Integer tresIntentados, Integer libresAnotados, Integer libresIntentados, Integer rebotesOfensivos, Integer rebotesDefensivos, Integer asistencias, Integer robos, Integer faltas, Integer puntos, Integer tapones, Integer perdidas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idEquipo = idEquipo;
        this.edad = edad;
		this.peso = peso;
		this.altura = altura;
        this.posicion = posicion;
        this.partidos = partidos;
        this.minutos = minutos;
        this.campoAnotados = campoAnotados;
        this.campoIntentados = campoIntentados;
        this.campoFallados = this.campoIntentados - this.campoAnotados;
        this.campoPorcentaje = (Double.valueOf(this.campoAnotados) / Double.valueOf(this.campoIntentados)) * 100;
        this.dosAnotados = dosAnotados;
        this.dosIntentados = dosIntentados;
        this.dosFallados = this.dosIntentados - this.dosAnotados;
        this.dosPorcentaje = (Double.valueOf(this.dosAnotados) / Double.valueOf(this.dosIntentados)) * 100;
        this.tresAnotados = tresAnotados;
        this.tresIntentados = tresIntentados;
        this.tresFallados = this.tresIntentados - this.tresAnotados;
        this.tresPorcentaje = (Double.valueOf(this.tresAnotados) / Double.valueOf(this.tresIntentados)) * 100;
        this.libresAnotados = libresAnotados;
        this.libresIntentados = libresIntentados;
        this.libresFallados = this.libresIntentados - this.libresAnotados;
        this.libresPorcentaje = (Double.valueOf(this.libresAnotados) / Double.valueOf(this.libresIntentados)) * 100;
        this.rebotesOfensivos = rebotesOfensivos;
        this.rebotesDefensivos = rebotesOfensivos;
        this.asistencias = asistencias;
        this.robos = robos;
        this.faltas = faltas;
        this.puntos = puntos;
        this.tapones = tapones;
        this.perdidas = perdidas;
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

	public Integer getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo = idEquipo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Integer getPartidos() {
		return partidos;
	}

	public void setPartidos(Integer partidos) {
		this.partidos = partidos;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
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

	public Integer getCampoFallados() {
		return campoFallados;
	}

	public void setCampoFallados(Integer campoFallados) {
		this.campoFallados = campoFallados;
	}

	public double getCampoPorcentaje() {
		return campoPorcentaje;
	}

	public void setCampoPorcentaje(double campoPorcentaje) {
		this.campoPorcentaje = campoPorcentaje;
	}

	public Integer getDosAnotados() {
		return dosAnotados;
	}

	public void setDosAnotados(Integer dosAnotados) {
		this.dosAnotados = dosAnotados;
	}

	public Integer getDosIntentados() {
		return dosIntentados;
	}

	public void setDosIntentados(Integer dosIntentados) {
		this.dosIntentados = dosIntentados;
	}

	public Integer getDosFallados() {
		return dosFallados;
	}

	public void setDosFallados(Integer dosFallados) {
		this.dosFallados = dosFallados;
	}

	public double getDosPorcentaje() {
		return dosPorcentaje;
	}

	public void setDosPorcentaje(double dosPorcentaje) {
		this.dosPorcentaje = dosPorcentaje;
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

	public Integer getTresFallados() {
		return tresFallados;
	}

	public void setTresFallados(Integer tresFallados) {
		this.tresFallados = tresFallados;
	}

	public double getTresPorcentaje() {
		return tresPorcentaje;
	}

	public void setTresPorcentaje(double tresPorcentaje) {
		this.tresPorcentaje = tresPorcentaje;
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

	public Integer getLibresFallados() {
		return libresFallados;
	}

	public void setLibresFallados(Integer libresFallados) {
		this.libresFallados = libresFallados;
	}

	public double getLibresPorcentaje() {
		return libresPorcentaje;
	}

	public void setLibresPorcentaje(double libresPorcentaje) {
		this.libresPorcentaje = libresPorcentaje;
	}

	public Integer getRebotesOfensivos() {
		return rebotesOfensivos;
	}

	public void setRebotesOfensivos(Integer rebotesOfensivos) {
		this.rebotesOfensivos = rebotesOfensivos;
	}

	public Integer getRebotesDefensivos() {
		return rebotesDefensivos;
	}

	public void setRebotesDefensivos(Integer rebotesDefensivos) {
		this.rebotesDefensivos = rebotesDefensivos;
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
