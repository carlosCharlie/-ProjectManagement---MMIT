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

import com.mmit.integracion.conexion.Conexion;
import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.negocio.equipos.EquipoTrans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class BracketsDAOImp implements BracketsDAO{
    
    //Es un string y no un char para evitar problemas con las operaciones entre strings
    final String RESTRICCION = "-";
    
    
    
    //procedimientos para facilitar la conversion
    private String bracketToString(ArrayList<EquipoTrans> bracket){
        
        String s = "";
        
        for (EquipoTrans equipo:bracket){
            s += equipo.getId()+RESTRICCION;
        }
        
        return s;
    }
    
    
    private ArrayList<EquipoTrans> stringToBracket(String bracket) throws Exception{
        
        EquiposDAO equiposDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
        
        ArrayList<EquipoTrans> equipos= new ArrayList<>();
       
        //Separo el string
        String[] split = bracket.split(RESTRICCION);
        
        int idTmp;
        
        for(int i=0; i<split.length;i++){
            
            //lo transformo en numeros
            idTmp=Integer.parseInt(split[i]);
            
            equipos.add(equiposDao.readById(idTmp));
        }

        return equipos;
    }

    
    
    
    
    @Override
    public void crearBracket(ArrayList<EquipoTrans> bracket, int idUser) throws Exception{
       Conexion.getInstancia().abrir();
       Connection c = Conexion.getInstancia().getResource();
     
       PreparedStatement ps =  c.prepareStatement("replace INTO brackets VALUES (?,?)");
       ps.setInt(1, idUser);
       ps.setString(2, this.bracketToString(bracket));
       
       ps.executeUpdate();
      
    }

    @Override
    public ArrayList<EquipoTrans> readBracketByUser(int idUser) throws Exception {
        
       Conexion.getInstancia().abrir();
       Connection c = Conexion.getInstancia().getResource();
     
       PreparedStatement ps =  c.prepareStatement("Select * from brackets where id_usuario = ?");
       ps.setInt(1, idUser);
       
       ResultSet rs = ps.executeQuery();
      
       if(rs.next()){
           return this.stringToBracket(rs.getString("datos"));
       }
       
       return null;
    }
    
}
