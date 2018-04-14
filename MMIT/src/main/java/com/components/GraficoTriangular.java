package com.components;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class GraficoTriangular extends GridPane {
    
    private Double XA = 0.0;
    private Double YA;
    private Double XB;
    private Double YB;
    private Double XC;
    private Double YC;
    private String variableA;
    private String variableB;
    private String variableC;
    @FXML
    private Label textVariableA;
    @FXML
    private Label textVariableB;
    @FXML
    private Label textVariableC;
    @FXML
    private Polygon areaEstadistica;
    @FXML
    private Double vary_1;
    @FXML
    private Double varx_2;
    @FXML
    private Double vary_2;
    @FXML
    private Double varx_3;
    @FXML
    private Double vary_3;
    @FXML
    private Circle puntoC;
    @FXML
    private Circle puntoB;
    @FXML
    private Circle puntoA;
    
    public GraficoTriangular(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/components/GraficoTriangular.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        
        setPorcentajeA(100.0);
        setPorcentajeB(100.0);
        setPorcentajeC(100.0);
    }
    
    public GraficoTriangular(Double porcentajeA, String variableA, Double porcentajeB, String variableB, Double porcentajeC, String variableC){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/components/GraficoTriangular.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        setPorcentajeA(porcentajeA);
        setPorcentajeB(porcentajeA);
        setPorcentajeC(porcentajeA);   
    }
    
    public void setPorcentajeA(Double porcentaje){
        this.YA = this.vary_1 * (porcentaje / 100);
        
        puntoA.setCenterX(this.XA);
        puntoA.setCenterY(this.YA);
        
        this.areaEstadistica.getPoints().set(0, this.XA);
        this.areaEstadistica.getPoints().set(1, this.YA);
    }
    
    public void setPorcentajeB(Double porcentaje){
        this.XB = this.varx_2 * (porcentaje / 100);
        this.YB = this.XB / -2;
        
        puntoB.setCenterX(this.XB);
        puntoB.setCenterY(this.YB);
        
        this.areaEstadistica.getPoints().set(2, this.XB);
        this.areaEstadistica.getPoints().set(3, this.YB);
    }
    
    public void setPorcentajeC(Double porcentaje){
        this.XC = this.varx_3 * (porcentaje / 100);
        this.YC = this.XC / 2;
        
        puntoC.setCenterX(this.XC);
        puntoC.setCenterY(this.YC);

        this.areaEstadistica.getPoints().set(4, this.XC);
        this.areaEstadistica.getPoints().set(5, this.YC);
    }
    
    public void setVariableA(String variable){
        this.variableA = variable;
        
        this.textVariableA.setText(this.variableA);
    }
    
    public String getVariableA(){
        return variableA;
    }
    
    public void setVariableB(String variable){
        this.variableB = variable;
        
        this.textVariableB.setText(this.variableB);
    }
    
    public String getVariableB(){
        return variableB;
    }
    
    public void setVariableC(String variable){
        this.variableC = variable;
        
        this.textVariableC.setText(this.variableC);
    }
    
    public String getVariableC(){
        return variableC;
    }
   
}
