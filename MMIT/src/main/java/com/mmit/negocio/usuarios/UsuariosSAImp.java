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
        /*
        -1 si se ha hecho el registro
        -2 si ya existe admin
        -3 si existe y no es admin
        -4 volver a introducir datos correctamente
        -5 si ha habido fallo
        */
        @Override
        public int singUpUser(UsuarioTrans usuarioTrans){
            int respuesta = 0;
            try{
                UsuariosDAO usuariosDao = FactoriaIntegracion.getInstancia().crearUsuariosDAO();
                UsuarioTrans tUsuario = usuariosDao.readByNombre(usuarioTrans.getNombre());
                
                if (tUsuario == null) {
                    
                    if(usuarioTrans.getPassword() != null && usuarioTrans.getNombre() != null)
                        usuariosDao.singUpUser(usuarioTrans);//Nuevo usuario
                }
                else if(usuarioTrans.getPassword() == null || usuarioTrans.getNombre() == null){
                    respuesta = -3;
                }
                else{
                    //if(tUsuario.getAdmin()){
                    respuesta = -2;
                    //}
                    //else  respuesta = -3;
                    
                }
                
            } catch (Exception ex) {
                respuesta = -5;
            }
            return respuesta;
        }
}
