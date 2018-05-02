
package com.mmit.negocio.brackets;

import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;

public interface BracketSA {
    /**
     * Rellena el bracket inicial
     * @return salida del programa
     */
   public int loadInitBracket();
   
   /**
    * Crea un nuevo  bracket en la base de datos
    * @return codigo de error
    */
   public int crearBracket(ArrayList<EquipoTrans> bracketNuevo, int idUsuario);
   
   /**
    * Devuelve el bracket de la base de datos de un determinado usuario
    * @param idUsuario id del usuario
    * @return bracket o null si algo ha salido mal
    */
   public ArrayList<EquipoTrans> getBracketByUser(int idUsuario);
}
