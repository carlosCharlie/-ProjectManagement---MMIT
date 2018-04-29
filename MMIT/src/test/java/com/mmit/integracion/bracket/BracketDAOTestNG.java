package com.mmit.integracion.bracket;

import org.testng.Assert;
import static org.testng.Assert.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.mmit.integracion.brackets.BracketsDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.negocio.brackets.BracketSA;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;
import com.mmit.negocio.usuarios.Login;

public class BracketDAOTestNG {

	@Test
	public void crearBracketTestNG() {
		BracketsDAO bracket = FactoriaIntegracion.getInstancia().crearBracketsDAO();
		BracketSA bSA = FactoriaNegocio.getInstancia().crearBracketSA();
		bSA.loadInitBracket();
		try {
			bracket.crearBracket(Login.getBracket(), 1);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test
	public void readBracketByUserTestNG() {
		BracketsDAO bracket = FactoriaIntegracion.getInstancia().crearBracketsDAO();
		try {
			ArrayList<EquipoTrans> datos = bracket.readBracketByUser(1);
			Assert.assertNotNull(datos);
		} catch (Exception e) {
			Assert.fail();
		}

	}
}
