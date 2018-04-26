package com.mmit.negocio.usuarios;

import com.mmit.negocio.brackets.BracketTrans;

/**
 * Es una clase estatica que almacena el usuario actual de la aplicacion
 */
public class Login {
    //En la base de datos hay insertado un admin por defecto: nombre="admin" password="adminP"
    
    static private UsuarioTrans usuario;
    static private BracketTrans bracket;

    /**
     * Inicia una nueva sesion
     * @param usuario transfer del usuario
     */
    public static void setNuevaSesion(UsuarioTrans usuario){
        Login.usuario = usuario;
    }
    
    /**
     * Devuelve el usuario actual
     * @return 
     */
    public static UsuarioTrans getUsuario(){
        return usuario;
    }
    
    public static void setBracket(BracketTrans bracket){
    	Login.bracket = bracket;
    }
    
    public static BracketTrans getBracket(){
    	return bracket;
    }
  
}
