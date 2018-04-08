package com.mmit.negocio.usuarios;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.integracion.usuarios.UsuariosDAO;

public class UsuariosSAImp implements UsuariosSA {

	public int comprobarLogin(String name, String pass) {
		int result = -5;
		UsuariosDAO usuariosDao = FactoriaIntegracion.getInstancia().crearUsuariosDAO();
		UsuarioTrans tUsuario = usuariosDao.readByNombre(name);
			if (tUsuario == null) {
				result = -1;
			} else if (!tUsuario.getPassword().equals(pass)) {
				result = -2;
			} else {
				result = 0;
			}
		return result;
	}
}
