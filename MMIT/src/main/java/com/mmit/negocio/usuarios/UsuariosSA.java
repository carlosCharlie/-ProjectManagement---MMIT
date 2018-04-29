package com.mmit.negocio.usuarios;

public interface UsuariosSA {
	

        /**
         * Comprueba que el usuario existe en la base de datos y que la password sea correcta
         * @param usuarioTrans usuario a comprobar
         * @return codigo de salida: correcto = 0, usuario no existente=-1, password incorrecta=-2, error SQL=-5
         */
	public int comprobarLogin(UsuarioTrans usuarioTrans);
        
        /**
         * Cierra la  sesion  actual
         */
        public void cerrarSesion();
	
}
