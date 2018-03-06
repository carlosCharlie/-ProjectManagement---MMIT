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
public class FactoriaSAImp extends FactoriaSA {

    @Override
    public SAFormulario getSAFormulario() {
        return new SAFormulario();
    }

    @Override
    public SAListar getSAListar() {
         return new SAListar();
    }
    
}
