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

public class BracketDAOTestNG {

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

}
