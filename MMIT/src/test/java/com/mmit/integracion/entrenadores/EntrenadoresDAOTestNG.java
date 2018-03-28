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
package com.mmit.integracion.entrenadores;

import com.mmit.negocio.entrenadores.EntrenadorTrans;
import java.util.ArrayList;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class EntrenadoresDAOTestNG {
    
    public EntrenadoresDAOTestNG() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testReadAll(){
        try{
            System.out.println("Listar entrenadores");
            EntrenadorDAO instance = new EntrenadorDAOImp();
            ArrayList<EntrenadorTrans> result = instance.listarEntrenadores();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    
}
