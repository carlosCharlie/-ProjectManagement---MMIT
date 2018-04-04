/*
 * Copyright (C) 2018 Your Organisation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mmit.presentacion.entrenadores;

import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author crash
 */
public class ControladorVistaInfoEntrenadores implements Initializable {

    private TOAEntrenadorEquipo entrenador;
    @FXML
    private Label nombreEquipo;
    @FXML
    private Label nombreEntrenador;
    @FXML
    private Label apellidosEntrenador;
    @FXML
    private Label edad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.entrenador = (TOAEntrenadorEquipo) rb.getObject("");
        rellenarInformacionBasica();
    }    
    
    private void rellenarInformacionBasica(){
        this.nombreEntrenador.setText(this.entrenador.getNombreEntrenador());
        this.apellidosEntrenador.setText(this.entrenador.getApellidosEntrenador());
        this.edad.setText(String.valueOf(this.entrenador.getEntrenador().getEdad()));
        if (this.entrenador.getEquipo() != null){
            this.nombreEquipo.setText(this.entrenador.getEquipo().getNombre());
        } else {
            this.nombreEquipo.setText("-");
        }
    }
    
}
