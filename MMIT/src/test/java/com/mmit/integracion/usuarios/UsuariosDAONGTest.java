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

import com.mmit.integracion.conexion.Conexion;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.negocio.usuarios.UsuarioTrans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author carlos
 */
public class UsuariosDAONGTest {
    
    public UsuariosDAONGTest() {
    }

    /**
     * Test of readByNombre method, of class UsuariosDAO.
     */
    @Test
    public void testReadByNombre() {
        try {
            System.out.println("readByNombre");
            UsuariosDAO instance = FactoriaIntegracion.getInstancia().crearUsuariosDAO();
            UsuarioTrans result = instance.readByNombre("admin");
            assertNotNull(result);
        } catch (Exception ex) {
            Assert.fail();
        }
        
    }
     
    @Test
    public void testReadByNombreSinNombre() {
        try {
            System.out.println("readByNombre");
            UsuariosDAO instance = FactoriaIntegracion.getInstancia().crearUsuariosDAO();
            UsuarioTrans result = instance.readByNombre(" ");
            assertNull(result);
        } catch (Exception ex) {
            Assert.fail();
        }

    }
        
     @Test
    public void testSignUpUser() {
        try {
            System.out.println("SignUpUser");
            UsuariosDAO instance = FactoriaIntegracion.getInstancia().crearUsuariosDAO();
            UsuarioTrans trans = new UsuarioTrans(200,"MonkeyD","Luffy",false);
            instance.singUpUser(trans);
            assertEquals(trans,instance.readByNombre("MonkeyD"));
            
            //Borrar usuario introducido
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps =  c.prepareStatement("Delete * from usuarios where nombre = ?");
            ps.setString(1, "MonkeyD");
            ResultSet rs = ps.executeQuery();
        } catch (Exception ex) {
            Assert.fail();
        }

    }
}
