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
package com.mmit.presentacion.jugadores;

import com.mmit.negocio.equipos.TOAEntrenadorEquipoJugadores;
import com.mmit.negocio.jugadores.TOAJugadorEquipo;
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
public class ControladorVistaInfoJugadores implements Initializable {
    
    private TOAJugadorEquipo jugador;
    @FXML
    private Label nombreJugador;
    @FXML
    private Label apellidosJugador;
    @FXML
    private Label nombreEquipo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.jugador = (TOAJugadorEquipo) rb.getObject("");
        this.nombreJugador.setText(this.jugador.getNombreJugador());
        this.apellidosJugador.setText(this.jugador.getApellidosJugador());
        if (this.jugador.getEquipo() != null){
            this.nombreEquipo.setText(this.jugador.getEquipo().getNombre());
        } else {
            this.nombreEquipo.setText("-");
        }
    }    
    
}
