/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

/**
 *
 * @author Laura
 */


public abstract class FactoriaGUI {
	private static FactoriaGUI factoriaGUI;

	public static FactoriaGUI getInstancia() {
		if (factoriaGUI == null)
			factoriaGUI = new FactoriaGUIImp();
		return factoriaGUI;
	}

	

	public abstract IGUI crearGUIFormulario();

	public abstract IGUI crearGUIHolaMundo();

	public abstract IGUI crearGUIListar();
        
        public abstract IGUI crearGUIVista();

}