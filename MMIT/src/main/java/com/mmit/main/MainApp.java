package com.mmit.main;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane menu = (AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/MenuNoLog.fxml"));
        AnchorPane index = (AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/Index.fxml"));
        
        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(menu);
        borderPane.setCenter(index);
        
        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("MMIT");
        stage.getIcons().add(new Image("/images/logo_nf.png"));
        stage.centerOnScreen(); 
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
