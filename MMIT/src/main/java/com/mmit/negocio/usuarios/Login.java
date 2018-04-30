package com.mmit.negocio.usuarios;

import com.mmit.negocio.brackets.BracketTrans;
import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;

/**
 * Es una clase estatica que almacena el usuario actual de la aplicacion
 */
public class Login {
    //En la base de datos hay insertado un admin por defecto: nombre="admin" password="adminP"
    
    static private UsuarioTrans usuario;
    static private ArrayList<EquipoTrans> bracket;

    /**
     * Inicia una nueva sesion
     * @param usuario transfer del usuario
     */
    public static void setNuevaSesion(UsuarioTrans usuario){
        Login.usuario = usuario;
        bracket = null;
    }
    
    /**
     * Devuelve el usuario actual
     * @return 
     */
    public static UsuarioTrans getUsuario(){
        return usuario;
    }
    
    public static void setBracket(ArrayList<EquipoTrans> bracket){
    	Login.bracket = bracket;
    }
    
    public static ArrayList<EquipoTrans> getBracket(){
    	return bracket;
    }

    public static void resetBracket() {
        for (int i = 16; i < bracket.size(); i++){
            bracket.set(i, new EquipoTrans());
        }
    }
  
    public static void cerrarSesion(){
        Login.usuario = null;
        for(int i=0;i<Login.bracket.size();i++){
            Login.bracket.set(i, null);
        }
    }
}
