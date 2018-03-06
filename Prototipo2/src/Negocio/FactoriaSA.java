/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Laura
 */
public abstract class FactoriaSA {
	private static FactoriaSA factoriaSA;
	
	public static FactoriaSA getInstancia() {
		if (factoriaSA == null)
			factoriaSA = new FactoriaSAImp();
		return factoriaSA;
	}
	
	public abstract SAFormulario getSAFormulario();
	
	public abstract SAListar getSAListar();
	


}