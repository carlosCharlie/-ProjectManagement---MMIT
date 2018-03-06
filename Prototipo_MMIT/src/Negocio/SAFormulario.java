/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Integración.DAO;
import Integración.FactoriaDAO;
import java.util.ArrayList;



/**
 *
 * @author Laura
 */
public class SAFormulario {

    public boolean guardardatos(String datos, String table) {
        DAO dao = FactoriaDAO.getInstancia().crearDAO();
        return dao.guardardatos(table,datos);
    }

    public ArrayList<String> leerDatos() {
        DAO dao = FactoriaDAO.getInstancia().crearDAO();
        return dao.leerDatos();
    }
}
