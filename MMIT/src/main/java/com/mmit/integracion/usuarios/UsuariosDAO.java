package com.mmit.integracion.usuarios;

import com.mmit.negocio.usuarios.UsuarioTrans;

public interface UsuariosDAO {
    
    public UsuarioTrans readByNombre(String nombre) throws Exception;

    public void write(UsuarioTrans usuarioTrans);
}
