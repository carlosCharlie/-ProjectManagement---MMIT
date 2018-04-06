package com.mmit.negocio.entrenadores;

import java.util.ArrayList;


public interface EntrenadorSA {
    public ArrayList<TOAEntrenadorEquipo> listarEntrenadores() throws Exception;
    public TOAEntrenadorEquipo obtenerEntrenadorCompleto(Integer id) throws Exception;
    public EntrenadorTrans obtenerEntrenador(Integer id) throws Exception;
    public ArrayList<TOAEntrenadorEquipo> equiposEntrenador(int id) throws Exception;
}
