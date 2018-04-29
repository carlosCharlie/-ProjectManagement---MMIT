/*
 * Copyright (C) 2018 MMIT
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mmit.integracion.brackets;

import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public interface BracketsDAO {
    
    /**
     * Inserta el bracket en la base de datos o lo remplaza si ya existia uno con esa id
     * @param bracket nuevo bracket
     * @param idUser id del usuario al que se le asignara el bracket
     * @throws Exception 
     */
    public void crearBracket(ArrayList<EquipoTrans> bracket,int idUser)throws Exception;
    
    /**
     * Lee el bracket actual de un determinado usuario
     * @param idUser id del usuario
     * @return ultimo bracket guardado de ese usuario
     * @throws Exception 
     */
    public ArrayList<EquipoTrans> readBracketByUser(int idUser) throws Exception;
}
