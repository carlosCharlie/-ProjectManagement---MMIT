/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Laura
 */
public class FactoriaGUIImp extends FactoriaGUI {

    @Override
    public IGUI crearGUIFormulario() {
     return new Formulario();
    }

    @Override
    public IGUI crearGUIHolaMundo() {
      return new HolaMundo();
    }

    @Override
    public IGUI crearGUIListar() {
       return new Listar();
    }

    @Override
    public IGUI crearGUIVista() {
       return new Vista();
    }
    
}
