package com.mmit.negocio.entrenadores;

import com.mmit.integracion.entrenadores.EntrenadorDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import java.util.ArrayList;


public class EntrenadorSAImp implements EntrenadorSA {

    @Override
    public ArrayList<EntrenadorTrans> listarEntrenadores() {
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EntrenadorDAO daoe = instancia.crearEntrenadoresDAO();
       
        return daoe.listarEntrenadores();
    }
    
}
