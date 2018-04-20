package com.mmit.negocio.jugadores;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class JugadorTrans {

    //basico
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer idEquipo;
    private Integer edad;
    private double peso;
    private double altura;
  
    private String posicion;
  
    //estadisticas
    private Integer partidos;
    private Integer minutos;
    
    private Integer campoAnotados;
    private Integer campoIntentados;
    private double campoPorcentaje;
   
    private Integer dosAnotados;
    private Integer dosIntentados;
    private double dosPorcentaje;
    
    private Integer tresAnotados;
    private Integer tresIntentados;
    private double tresPorcentaje;
    
    private Integer libresAnotados;
    private Integer libresIntentados;
    private double libresPorcentaje;
    
    private Integer rebotesOfensivos;
    private Integer rebotesDefensivos;
    private int rebotesTotales;
    
    private Integer asistencias;
    private Integer robos;
    private Integer faltas;
    private Integer puntos;
    private Integer tapones;
    private Integer perdidas;
    
    private String mano;
    
    private double porcentajeTiros;

    public JugadorTrans(Integer id, String nombre, String apellidos, Integer idEquipo, Integer edad, double peso, double altura, String posicion, Integer partidos, Integer minutos, Integer campoAnotados, Integer campoIntentados, Integer dosAnotados, Integer dosIntentados, Integer tresAnotados, Integer tresIntentados, Integer libresAnotados, Integer libresIntentados, Integer rebotesOfensivos, Integer rebotesDefensivos, Integer asistencias, Integer robos, Integer faltas, Integer puntos, Integer tapones, Integer perdidas, String mano) {
       
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
        if(this.campoIntentados<1){
            this.campoPorcentaje=0;
        }else{
            this.campoPorcentaje = (Double.valueOf(this.campoAnotados) / Double.valueOf(this.campoIntentados)) * 100;
        }
        
        
        this.dosAnotados = dosAnotados;
        this.dosIntentados = dosIntentados;
        if(this.dosIntentados<1){
            this.dosPorcentaje = 0;
        }else{
            this.dosPorcentaje = (Double.valueOf(this.dosAnotados) / Double.valueOf(this.dosIntentados)) * 100;
        }
        
        this.tresAnotados = tresAnotados;
        this.tresIntentados = tresIntentados;
        if(this.tresIntentados<1){
            this.tresPorcentaje = 0;
            
        }else{
            this.tresPorcentaje = (Double.valueOf(this.tresAnotados) / Double.valueOf(this.tresIntentados)) * 100;
        }
        
        this.libresAnotados = libresAnotados;
        this.libresIntentados = libresIntentados;
        if(this.libresIntentados<1){
           this.libresPorcentaje = 0;
        }else{
             this.libresPorcentaje = (Double.valueOf(this.libresAnotados) / Double.valueOf(this.libresIntentados)) * 100;
        }
        
        this.rebotesOfensivos = rebotesOfensivos;
        this.rebotesDefensivos = rebotesDefensivos;
        this.rebotesTotales = this.rebotesOfensivos + this.rebotesDefensivos;
        
        this.asistencias = asistencias;
        this.robos = robos;
        this.faltas = faltas;
        this.puntos = puntos;
        this.tapones = tapones;
        this.perdidas = perdidas;
        
        this.mano = mano;
        if(campoIntentados+libresIntentados<1){
            this.porcentajeTiros = 0;
        }
        else{
            this.porcentajeTiros = ((Double.valueOf(campoAnotados) + Double.valueOf(libresAnotados)) /(Double.valueOf(campoIntentados) + Double.valueOf(libresIntentados))) * 100;
        }
     }

    
	public JugadorTrans(Integer id, String nombre, String apellidos, Integer idEquipo, Integer edad, double peso,
			double altura, String posicion, Integer partidos, Integer minutos, Integer libresAnotados, Integer libresIntentados, Integer tirosTotales, Integer tirosAnotados,
			Integer rebotesOfensivos, int rebotesTotales, Integer asistencias, Integer robos, Integer faltas,
			Integer puntos, Integer tapones, Integer perdidas, String mano) {
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
                
		this.libresAnotados = libresAnotados;
		this.libresIntentados = libresIntentados;
                this.libresPorcentaje = (Double.valueOf(this.libresAnotados) / Double.valueOf(this.libresIntentados)) * 100;
		
                this.rebotesOfensivos = rebotesOfensivos;
		this.rebotesDefensivos = rebotesTotales-rebotesOfensivos;
		this.rebotesTotales = rebotesTotales;
		
                this.asistencias = asistencias;
		
                this.robos = robos;
		
                this.faltas = faltas;
		
                this.puntos = puntos;
		
                this.tapones = tapones;
		
                this.perdidas = perdidas;
		
                this.mano = mano;
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

	public Integer getRebotesDefensivos() {
		return rebotesDefensivos;
	}

	public void setRebotesDefensivos(Integer rebotesDefensivos) {
		this.rebotesDefensivos = rebotesDefensivos;
	}

	public int getRebotesTotales() {
		return rebotesTotales;
	}

	public void setRebotesTotales(int rebotesTotales) {
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
        
        public String getMano(){
            return this.mano;     
        }
    
        public void setMano(String mano){
            this.mano = mano;
        }
        
}
