package com.mmit.negocio.equipos;

import com.mmit.integracion.FactoriaIntegracion.FactoriaIntegracion;
import com.mmit.integracion.equipos.EquiposDAO;
import java.util.ArrayList;

/**
 *
 * @author MMIT
 */
public class EquiposSAImp implements EquiposSA {
    
    @Override
    public ArrayList<EquipoTrans> listarEquipos(){
        FactoriaIntegracion instancia =  FactoriaIntegracion.getInstancia();
        EquiposDAO daoe= instancia.crearEquiposDAO();
       
    return daoe.listarEquipos();
}
}
