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

    public boolean guardardatos(String datos, String table) {
        DAOFormulario dao = FactoriaDAO.getInstancia().crearDAOFormulario();
        return dao.guardardatos(table,datos);
    }

    public ArrayList<String> leerDatos() {
        DAOFormulario dao = FactoriaDAO.getInstancia().crearDAOFormulario();
        return dao.leerDatos();
    }
}
