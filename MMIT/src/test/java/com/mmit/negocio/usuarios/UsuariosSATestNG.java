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
package com.mmit.negocio.usuarios;

import com.mmit.integracion.conexion.Conexion;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.integracion.usuarios.UsuariosDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import junit.framework.Assert;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import org.testng.annotations.Test;

/**
 *
 * @author guill
 */
public class UsuariosSATestNG {
    @Test
    public void TestSingUpUserSinContraseña(){
        try{
            System.out.print("Registro usuario no existente sin contraseña");
            UsuariosSA instance = new UsuariosSAImp();
            UsuarioTrans us = new UsuarioTrans(300,"jaja"," ",true);
            instance.singUpUser(us);
            
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps =  c.prepareStatement("Select password from usuarios where id = 300");
            ResultSet rs = ps.executeQuery();
            
            PreparedStatement ts =  c.prepareStatement("delete from usuarios where id = 300");
            ts.execute();
            ps.close();
            ts.close();
            c.close();
            
            assertEquals(instance.singUpUser(us), -1);
            
        }catch(Exception e){
            Assert.fail();
        }
    }
    @Test
    public void TestSingUpUserSinNombre(){
        try{
            System.out.print("Registro usuario no existente sin nombre");
            UsuariosSA instance = new UsuariosSAImp();
            UsuarioTrans us = new UsuarioTrans(300," ","jaja",true);
            int respuesta = instance.singUpUser(us);
           
            
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps =  c.prepareStatement("Select nombre from usuarios where id = 300");
            ResultSet rs = ps.executeQuery();
            
            PreparedStatement ts =  c.prepareStatement("delete from usuarios where id = 300");
            ts.execute();
            ps.close();
            ts.close();
            c.close();
            
            assertEquals(instance.singUpUser(us), -1);
            
        }catch(Exception e){
            Assert.fail();
        }
    }
    @Test
    public void TestSingUpUserNuevoCorrecto(){
        try{
            System.out.print("Registro usuario nuevo correcto");
            UsuariosSA instance = new UsuariosSAImp();
            UsuarioTrans us = new UsuarioTrans(4500,"sergio","jaja",false);
            int respuesta = instance.singUpUser(us);
        
            
            Conexion.getInstancia().abrir();
            Connection c = Conexion.getInstancia().getResource();
            PreparedStatement ps =  c.prepareStatement("Select nombre from usuarios where id = "+us.getId());
            ResultSet rs = ps.executeQuery();
            
            PreparedStatement ts =  c.prepareStatement("delete from usuarios where id = "+us.getId());
            ts.execute();
            ps.close();
            ts.close();
            c.close();
            
            assertNotNull(instance.singUpUser(us));
            
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    
    @Test
    public void TestSingUpUserExisteYesAdmin(){
        try{
            System.out.print("Registro usuario existente admin");
            UsuariosSA instance = new UsuariosSAImp();
            UsuarioTrans us = new UsuarioTrans(1,"admin","adminP",true);
            int respuesta = instance.singUpUser(us);
            assertEquals(respuesta, -1);
            
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestSingUpUserExisteYesUser(){
        try{
            System.out.print("Registro usuario existente normal");
            UsuariosSA instance = new UsuariosSAImp();
            UsuariosDAO dao = FactoriaIntegracion.getInstancia().crearUsuariosDAO();
            UsuarioTrans us = dao.readById(1);
            int respuesta = instance.singUpUser(us);
            assertEquals(respuesta, -1);
            
            
        }catch(Exception e){
            Assert.fail();
        }
    }
    
}
