package com.components;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class GraficoHexagonal extends GridPane {
    
    private Double XA;
    private Double YA;
    private Double XB;
    private Double YB;
    private Double XC;
    private Double YC;
    private Double XD;
    private Double YD;
    private Double XE;
    private Double YE;
    private Double XF;
    private Double YF;    
    private String variableA;
    private String variableB;
    private String variableC;
    private String variableD;
    private String variableE;
    private String variableF;
    @FXML
    private Label textVariableA;
    @FXML
    private Label textVariableB;
    @FXML
    private Label textVariableC;
    @FXML
    private Label textVariableD;
    @FXML
    private Label textVariableE;
    @FXML
    private Label textVariableF;
    @FXML
    private Polygon areaEstadistica;
    @FXML
    private Double xa;
    @FXML
    private Double ya;
    @FXML
    private Double xb;
    @FXML
    private Double yb;
    @FXML
    private Double xc;
    @FXML
    private Double yc;
    @FXML
    private Double xd;
    @FXML
    private Double yd;
    @FXML
    private Double xe;
    @FXML
    private Double ye;
    @FXML
    private Double xf;
    @FXML
    private Double yf;
    @FXML
    private Circle puntoC;
    @FXML
    private Circle puntoB;
    @FXML
    private Circle puntoA;
    
    public GraficoHexagonal(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/components/GraficoHexagonal.fxml"));
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
    
    public GraficoHexagonal(Double porcentajeA, String variableA, Double porcentajeB, String variableB, Double porcentajeC, String variableC){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/components/GraficoHexagonal.fxml"));
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
        
        puntoA.setCenterX(this.XA);
        puntoA.setCenterY(this.YA);
        
        this.areaEstadistica.getPoints().set(0, this.XA);
        this.areaEstadistica.getPoints().set(1, this.YA);
    }
    
    public void setPorcentajeB(Double porcentaje){
        
        puntoB.setCenterX(this.XB);
        puntoB.setCenterY(this.YB);
        
        this.areaEstadistica.getPoints().set(2, this.XB);
        this.areaEstadistica.getPoints().set(3, this.YB);
    }
    
    public void setPorcentajeC(Double porcentaje){
        
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
