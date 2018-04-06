package com.mmit.negocio.entrenadores;

import java.util.ArrayList;


public interface EntrenadorSA {
    public ArrayList<TOAEntrenadorEquipo> listarEntrenadores();
    public TOAEntrenadorEquipo obtenerEntrenadorCompleto(Integer id);
    public EntrenadorTrans obtenerEntrenador(Integer id);
}
