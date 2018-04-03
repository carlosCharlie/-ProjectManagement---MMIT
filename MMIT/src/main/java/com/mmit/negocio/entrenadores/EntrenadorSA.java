package com.mmit.negocio.entrenadores;

import java.util.ArrayList;


public interface EntrenadorSA {
     public ArrayList<TOAEntrenadorEquipo> listarEntrenadores();
     public ArrayList<TOAEntrenadorEquipo> buscarEntrenador(String nombre, String Apellidos);
     public TOAEntrenadorEquipo mostrarEntrenador(Integer id);
}
