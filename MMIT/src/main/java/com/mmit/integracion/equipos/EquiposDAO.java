/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmit.integracion.equipos;

import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public interface EquiposDAO {
    
   public ArrayList<EquipoTrans>listarEquipos();
}
