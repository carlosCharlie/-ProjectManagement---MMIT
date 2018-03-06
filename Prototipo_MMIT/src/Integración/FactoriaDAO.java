/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integración;

/**
 *
 * @author Laura
 */
public abstract class FactoriaDAO {
	private static FactoriaDAO factoriaDAO;
	
	public static FactoriaDAO getInstancia() {
		if (factoriaDAO == null)
			factoriaDAO = new FactoriaDAOImp();
		
		return factoriaDAO;
	}
	
	public abstract DAOFormulario crearDAOFormulario();
        
        public abstract DAOUsuario crearDAOUsuario();
}
