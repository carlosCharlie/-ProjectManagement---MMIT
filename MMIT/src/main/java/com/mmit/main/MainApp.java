package com.mmit.main;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane menu = (AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/Menu.fxml"));
        AnchorPane index = (AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/Index.fxml"));
        
        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(menu);
        borderPane.setCenter(index);
        
        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("MMIT");
        stage.centerOnScreen(); 
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
