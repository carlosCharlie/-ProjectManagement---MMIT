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
package com.mmit.negocio.Registros;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author carlos
 */
public class LoginNGTest {
    
    public LoginNGTest() {
    }

    /**
     * Test of iniciarSesion method, of class Login.
     */
    @Test
    public void testIniciarSesion() {
        System.out.println("iniciarSesion");
        String nombre = "admin";
        String password = "adminP";
        boolean expResult = true;
        boolean result = Login.iniciarSesion(nombre, password);
        assertEquals(result, expResult);
        assertTrue(Login.getPermiso()==Permisos.admin);
        assertEquals(nombre,Login.getNombre());
        assertEquals(password,Login.getPassword());
        
         nombre = "asdf";
         password = "adminP";
         expResult = false;
         result = Login.iniciarSesion(nombre, password);
        assertEquals(result, expResult);
        assertTrue(Login.getPermiso()==Permisos.user);
        assertEquals("user",Login.getNombre());
        assertEquals("user",Login.getPassword());
        
    }
    
}
