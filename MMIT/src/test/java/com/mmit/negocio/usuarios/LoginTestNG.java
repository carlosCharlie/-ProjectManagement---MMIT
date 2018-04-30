package com.mmit.negocio.usuarios;

import org.testng.Assert;
import static org.testng.Assert.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.mmit.negocio.brackets.BracketSA;
import com.mmit.negocio.equipos.EquipoTrans;
import com.mmit.negocio.factoriaNegocio.FactoriaNegocio;

public class LoginTestNG {

	@Test
	public void setNuevaSesionTestNG() {
		UsuarioTrans user = new UsuarioTrans(2, "pepe", "admin", false);
		Login.setNuevaSesion(user);
		Assert.assertNull(Login.getBracket());
	}

	@Test
	public void getUsuarioTestNG() {
		UsuarioTrans user = new UsuarioTrans(2, "pepe", "admin", false);
		Login.setNuevaSesion(user);
		Assert.assertEquals(Login.getUsuario().getNombre(), user.getNombre());
	}

	@Test
	public void getBracketTestNG() {
		BracketSA saB = FactoriaNegocio.getInstancia().crearBracketSA();
		saB.loadInitBracket();
		Assert.assertNotNull(Login.getBracket());
	}

	@Test
	public void setBracketTestNG() {
		BracketSA saB = FactoriaNegocio.getInstancia().crearBracketSA();
		saB.loadInitBracket();
		ArrayList<EquipoTrans> bracket = new ArrayList<EquipoTrans>();
		bracket.add(new EquipoTrans(2, "madrid"));
		Login.setBracket(bracket);
		Assert.assertEquals(Login.getBracket().get(0).getNombre(), "madrid");
	}

	@Test
	public void resetBracketsTestNG() {
		BracketSA saB = FactoriaNegocio.getInstancia().crearBracketSA();
		saB.loadInitBracket();
		Login.resetBracket();
		Assert.assertNotNull(Login.getBracket().get(25));
	}

	@Test
	public void cerrarSesionTestNG() {
		UsuarioTrans usuario = new UsuarioTrans(3, "admin", "admin", true);
		Login.setNuevaSesion(usuario);
		BracketSA saB = FactoriaNegocio.getInstancia().crearBracketSA();
		saB.loadInitBracket();
		Login.cerrarSesion();
		Assert.assertNull(Login.getUsuario());
	}

}
