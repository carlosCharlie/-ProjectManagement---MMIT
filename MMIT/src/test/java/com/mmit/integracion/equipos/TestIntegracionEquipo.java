package com.mmit.integracion.equipos;

import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.presentacion.controlador.Controlador;
import com.mmit.presentacion.controlador.Contexto;
import com.mmit.presentacion.Evento;
import java.util.ArrayList;
import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class TestIntegracionEquipo {

    /*Prueba si se muestra bien la información de un equipo*/
    @Test
    public void getByIDTest() {
        System.out.println("Prueba de Integracion de mostrar la información de un equipo que no existe");
        Controlador controlador = Controlador.obtenerInstancia();
        //Listar un equipo que no existe
        Contexto cont = new Contexto(Evento.ObtenerDatosEquipo, 0);
        
        controlador.accion(cont);
        Assert.assertNull(cont.getDatos());
    }

    @Test
    public void getByID2Test() {
        System.out.println("Prueba de Integracion de mostrar la información de un equipo con entrenador");
        Controlador controlador = Controlador.obtenerInstancia();
        //Listar un equipo con entrenador
        Contexto cont = new Contexto(Evento.ObtenerDatosEquipo, 7);
        EquipoTrans et = new EquipoTrans(7, "Alabama", 20, 16);
        EntrenadorTrans ent = new EntrenadorTrans(4, "Avery", "Johnson", 7);
        TOAEntrenadorEquipo toae = new TOAEntrenadorEquipo(ent, et);
        controlador.accion(cont);
        TOAEntrenadorEquipo nuevo = (TOAEntrenadorEquipo)(cont.getDatos());
        Assert.assertEquals(nuevo.getIdEquipo(), toae.getIdEquipo());
        Assert.assertEquals(nuevo.getIdEntrenador(), toae.getIdEntrenador());
        
    }

    @Test
    public void getByID3Test() {
        System.out.println("Prueba de Integracion de mostrar la información de un equipo sin entrenador");
        Controlador controlador = Controlador.obtenerInstancia();
        //Listar un equipo sin entrenador
        Contexto cont = new Contexto(Evento.ObtenerDatosEquipo, 31);
        EquipoTrans et = new EquipoTrans(31, "Brigham Young", 24, 11);
        TOAEntrenadorEquipo toae = new TOAEntrenadorEquipo(null, et);
        TOAEntrenadorEquipo nuevo = (TOAEntrenadorEquipo)(cont.getDatos());
        Assert.assertEquals(nuevo.getIdEquipo(), toae.getIdEquipo());
        Assert.assertNull(nuevo.getIdEntrenador());
        
    }
}
