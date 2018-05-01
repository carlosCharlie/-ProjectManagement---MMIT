package com.mmit.negocio.usuarios;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.integracion.usuarios.UsuariosDAO;

public class UsuariosSAImp implements UsuariosSA {

        @Override
	public int comprobarLogin(UsuarioTrans usuarioTrans) {
            int respuesta = 0;
            try{
                UsuariosDAO usuariosDao = FactoriaIntegracion.getInstancia().crearUsuariosDAO();
                UsuarioTrans tUsuario = usuariosDao.readByNombre(usuarioTrans.getNombre());
                if (tUsuario == null) {
                    respuesta = -1;
                } else if (!tUsuario.getPassword().equals(usuarioTrans.getPassword())) {
                    respuesta= -2;
                } else {
                    usuarioTrans = tUsuario;
                    respuesta = 0;
                }
                
            } catch (Exception ex) {
                respuesta = -5;
            }
            return respuesta;
	}

        @Override
        public int singUpUser(UsuarioTrans usuarioTrans){
            int respuesta = 0;
            try{
                UsuariosDAO usuariosDao = FactoriaIntegracion.getInstancia().crearUsuariosDAO();
                UsuarioTrans tUsuario = usuariosDao.readByNombre(usuarioTrans.getNombre());
                
                if (tUsuario == null) {
                    usuariosDao.write(usuarioTrans);
                }
                else{
                    respuesta = -1;                   
                }
                
            } catch (Exception ex) {
                respuesta = -5;
            }
            return respuesta;
        }
}
