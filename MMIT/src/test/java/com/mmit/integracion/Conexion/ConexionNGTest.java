package com.mmit.integracion.Conexion;


import com.mmit.integracion.conexion.Conexion;
import static org.testng.Assert.assertNotNull;
import org.testng.annotations.Test;

public class ConexionNGTest {
    
    public ConexionNGTest() {
    }
    
    @Test
    public void probarConexion(){
        Conexion.getInstancia().abrir();
       assertNotNull(Conexion.getInstancia().getResource());
        Conexion.getInstancia().cerrar();
    }
}
