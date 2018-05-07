/*
 * Copyright (C) 2018 MMIT
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
package com.mmit.presentacion.equipos;

import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.presentacion.ControladorVista;
import com.mmit.presentacion.controlador.Contexto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author crash
 */
public class ControladorVistaAñadirEquipos implements Initializable, ControladorVista {

    @FXML
    private TextField campoGanados;
    @FXML
    private TextField campoPerdidos;
    @FXML
    private TextField campoNombre;
    @FXML
    private ChoiceBox<EntrenadorTrans> selectorEntrenador;
    @FXML
    private Button botonGuardar;
    @FXML
    private Button botonCancelar;
    @FXML
    private TextField campoPunAnotados;
    @FXML
    private TextField campoPunRecibidos;
    @FXML
    private TextField campoDosAnotados;
    @FXML
    private TextField campoDosIntentados;
    @FXML
    private TextField campoTresAnotados;
    @FXML
    private TextField campoTresIntentados;
    @FXML
    private TextField campoLibresAnotados;
    @FXML
    private TextField campoLibresIntentados;
    @FXML
    private TextField campoPerdidas;
    @FXML
    private TextField campoRebOfensivos;
    @FXML
    private TextField campoRebTotales;
    @FXML
    private TextField campoTapones;
    @FXML
    private TextField campoAsistencias;
    @FXML
    private TextField campoFaltas;
    @FXML
    private TextField campoRobos;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Actualizar(Contexto contexto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
