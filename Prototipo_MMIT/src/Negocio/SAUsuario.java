/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Controlador.Controlador;
import Controlador.ControladorImp;
import Controlador.Eventos;
import Integración.DAOFormulario;
import Integración.DAOUsuario;
import Integración.FactoriaDAO;
import Presentacion.Usuario;
import java.util.ArrayList;



/**
 *
 * @author Laura
 */
public class SAUsuario {

    public boolean comprobarLogin(Usuario user) {
        DAOUsuario dao = FactoriaDAO.getInstancia().crearDAOUsuario();
        String pass = dao.readByUser(user.getNombre());
        if (pass != null){
            if (pass.equals(user.getPassword())){
                return true;
            }
            else{
                ControladorImp.getInstancia().accion(Eventos.MOSTRAR_LOGIN, null);
            }
        }
        return false;
    }
}
