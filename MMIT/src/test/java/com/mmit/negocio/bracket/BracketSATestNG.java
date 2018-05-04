package com.mmit.negocio.bracket;

import org.junit.Assert;
import static org.testng.Assert.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.negocio.brackets.BracketSA;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.usuarios.Login;

public class BracketSATestNG {

	@Test
	public void loadInitBracketTestNG() {
		System.out.println("Load bracket: Cargar correcto");
		BracketSA bracket = FactoriaNegocio.getInstancia().crearBracketSA();
		int resultado = bracket.loadInitBracket();
		Assert.assertEquals(resultado, 0);
	}

	@Test
	public void loadInitBracketResultTestNG() {
		System.out.println("Load bracket: Comprobar resultados");
		BracketSA bracket = FactoriaNegocio.getInstancia().crearBracketSA();
		int resultado = bracket.loadInitBracket();
		EquiposDAO equipos = FactoriaIntegracion.getInstancia().crearEquiposDAO();
		try {
			ArrayList<EquipoTrans> equiposconsulta = equipos.readAll();
			ArrayList<EquipoTrans> brackets = Login.getBracket();
			Assert.assertEquals(brackets.get(0).getNombre(), equiposconsulta.get(0).getNombre());
		} catch (Exception ex) {
			Assert.fail();
		}
	}

	@Test
	public void crearBracketTestNG() {
		System.out.println("Crear Bracket");
		BracketSA saB = FactoriaNegocio.getInstancia().crearBracketSA();
		int resultado = saB.loadInitBracket();
		int crear = saB.crearBracket(Login.getBracket(), 1);
		Assert.assertEquals(crear, 0);

	}

	// get bracket by user (existe y no existe use)
	@Test
	public void getBracketbyUserTestNG() {
		System.out.println("Get bracket by user");
		BracketSA saB = FactoriaNegocio.getInstancia().crearBracketSA();
		int resultado = saB.loadInitBracket();
		saB.crearBracket(Login.getBracket(), 1);
		int getb = saB.getBracketByUser(1);
		Assert.assertEquals(getb, 0);
	}

	@Test
	public void getBracketbyUserFailTestNG() {
		System.out.println("Get bracket by user: Null");
		BracketSA saB = FactoriaNegocio.getInstancia().crearBracketSA();
		int getb = saB.getBracketByUser(76554);
		Assert.assertEquals(-1, getb);
	}

}
