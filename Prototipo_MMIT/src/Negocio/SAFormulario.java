/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Integración.DAOFormulario;
import Integración.FactoriaDAO;
import java.util.ArrayList;



/**
 *
 * @author Laura
 */
public class SAFormulario {

    public boolean guardardatos(String datos) {
        DAOFormulario dao = FactoriaDAO.getInstancia().crearDAOFormulario();
        if (dao.leerPorNombre(datos) == null){
            return dao.guardardatos(datos);
        } else {
                return false;
        }
    }

    public ArrayList<String> leerDatos() {
        DAOFormulario dao = FactoriaDAO.getInstancia().crearDAOFormulario();
        return dao.leerDatos();
    }
}
