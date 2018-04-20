package com.mmit.negocio.equipos;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class EquipoTrans {
    private int id;
    private String nombre;
    
    private Integer victorias;
    private Integer derrotas;
    private Integer jugados;
    private double porcentaje;
    
    private Integer anotados;
    private Integer recibidos;
    
    private Integer campoAnotados;
    private Integer campoIntentados;
    private Integer campoFallados;
    private double campoPorcentaje;
    
    private Integer dosAnotados;
    private Integer dosIntentados;
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
    private Integer rebotesTotales;
    private Integer rebotesDefensivos;
    
    private Integer asistencias;
    private Integer robos;
    private Integer faltas;
    private Integer tapones;
    private Integer perdidas;
	
    public EquipoTrans(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
     
    public EquipoTrans(int id, String nombre, Integer victorias, Integer derrotas){
        this.id = id;
        this.nombre = nombre;
        
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.jugados = this.victorias + this.derrotas;
        this.porcentaje = (Double.valueOf(this.victorias) / Double.valueOf(this.jugados)) * 100;

    }

    public EquipoTrans(int id, String nombre, Integer victorias, Integer derrotas,
			Integer anotados, Integer recibidos, Integer campoAnotados, Integer campoIntentados,
			Integer tresAnotados, Integer tresIntentados, Integer libresAnotados, Integer libresIntentados,
			Integer rebotesOfensivos, Integer rebotesTotales, Integer asistencias, Integer robos, Integer faltas,
			Integer tapones, Integer perdidas) {
		this.id = id;
		this.nombre = nombre;
                
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.jugados = this.victorias + this.derrotas;
                if (this.jugados > 0){
                    this.porcentaje = (Double.valueOf(this.victorias) / Double.valueOf(this.jugados)) * 100;
                } else {
                    this.porcentaje = 0;
                }
                                
		this.anotados = anotados;
		this.recibidos = recibidos;
                
		this.campoAnotados = campoAnotados;
		this.campoIntentados = campoIntentados;
		this.campoFallados = this.campoIntentados - this.campoAnotados;
                if (this.campoIntentados > 0){
                    this.campoPorcentaje = (Double.valueOf(this.campoAnotados) / Double.valueOf(this.campoIntentados)) * 100;
                } else {
                    this.campoPorcentaje = 0;
                }
                
                this.dosAnotados = campoAnotados - tresAnotados;
		this.dosIntentados = campoIntentados - tresIntentados;
                if (this.dosIntentados > 0){
                    this.dosPorcentaje = (Double.valueOf(this.dosAnotados) / Double.valueOf(this.dosIntentados)) * 100;
                } else {
                    this.dosPorcentaje = 0;
                }
                
		this.tresAnotados = tresAnotados;
		this.tresIntentados = tresIntentados;
		this.tresFallados = this.tresIntentados - this.tresAnotados;
                if (this.tresIntentados > 0){
                    this.tresPorcentaje = (Double.valueOf(this.tresAnotados) / Double.valueOf(this.tresIntentados)) * 100;
                } else {
                    this.tresPorcentaje = 0;
                }
                
		this.libresAnotados = libresAnotados;
		this.libresIntentados = libresIntentados;
		this.libresFallados = this.libresIntentados - this.libresAnotados;
                if (this.libresIntentados > 0){
                    this.libresPorcentaje = (Double.valueOf(this.libresAnotados) / Double.valueOf(this.libresIntentados)) * 100;
                } else {
                    this.libresPorcentaje = 0;
                }
                
		this.rebotesOfensivos = rebotesOfensivos;
		this.rebotesTotales = rebotesTotales;
		this.rebotesDefensivos = this.rebotesTotales - this.rebotesOfensivos;
                
		this.asistencias = asistencias;
		this.robos = robos;
		this.faltas = faltas;
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

	public String getPorcentaje() {
            DecimalFormatSymbols symbol = new DecimalFormatSymbols();
            symbol.setDecimalSeparator('.');
            DecimalFormat df = new DecimalFormat("00.00", symbol);        
            df.setRoundingMode(RoundingMode.DOWN);
            String valor = df.format(porcentaje);
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

	public Integer getCampoFallados() {
		return campoFallados;
	}

	public void setCampoFallados(Integer campoFallados) {
		this.campoFallados = campoFallados;
	}

	public String getCampoPorcentaje() {
            DecimalFormatSymbols symbol = new DecimalFormatSymbols();
            symbol.setDecimalSeparator('.');
            DecimalFormat df = new DecimalFormat("00.00", symbol);        
            df.setRoundingMode(RoundingMode.DOWN);
            String valor = df.format(campoPorcentaje);
            return valor;
	}

	public void setCampoPorcentaje(double campoPorcentaje) {
		this.campoPorcentaje = campoPorcentaje;
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

	public String getTresPorcentaje() {
            DecimalFormatSymbols symbol = new DecimalFormatSymbols();
            symbol.setDecimalSeparator('.');
            DecimalFormat df = new DecimalFormat("00.00", symbol);        
            df.setRoundingMode(RoundingMode.DOWN);
            String valor = df.format(tresPorcentaje);
            return valor;
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

	public String getLibresPorcentaje() {
            DecimalFormatSymbols symbol = new DecimalFormatSymbols();
            symbol.setDecimalSeparator('.');
            DecimalFormat df = new DecimalFormat("00.00", symbol);        
            df.setRoundingMode(RoundingMode.DOWN);
            String valor = df.format(libresPorcentaje);
            return valor;
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

	public Integer getRebotesTotales() {
		return rebotesTotales;
	}

	public void setRebotesTotales(Integer rebotesTotales) {
		this.rebotesTotales = rebotesTotales;
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
        
        public Integer getDosAnotados() {
		return dosAnotados;
	}
        
        public void setDosAnotados(Integer dosAnotados) {
		this.dosAnotados = dosAnotados;
	}

	public Integer getDosIntentados() {
		return dosIntentados;
	}

	public void setdosIntentados(Integer dosIntentados) {
		this.dosIntentados = dosIntentados;
	}

	public String getDosPorcentaje() {
            DecimalFormatSymbols symbol = new DecimalFormatSymbols();
            symbol.setDecimalSeparator('.');
            DecimalFormat df = new DecimalFormat("00.00", symbol);        
            df.setRoundingMode(RoundingMode.DOWN);
            String valor = df.format(dosPorcentaje);
            return valor;
	}

	public void setDosPorcentaje(double dosPorcentaje) {
		this.dosPorcentaje = dosPorcentaje;
	}
}
