/*
 * Copyright (C) 2018 Your Organisation
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
package com.mmit.integracion.usuarios;

import com.mmit.negocio.usuarios.UsuarioTrans;

/**
 *
 * @author carlos
 */
public interface UsuariosDAO {
    
    /**
     *Devuelve los datos de un usuario dado su nombre
     * @param nombre nombre del usuario
     * @return datos del usuario
     */
    public UsuarioTrans readByNombre(String nombre) throws Exception;
}
