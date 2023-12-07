package com.example.expencetrackerapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

//import javafx.scene.Node;
         //import javafx.scene.layout.GridPane;
        // import javafx.scene.layout.StackPane;
       // import javafx.scene.layout.TilePane;
      //import javafx.scene.layout.VBox;
     //import javafx.scene.control.PasswordField;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        primaryStage.setTitle("Expense tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        // launch the application
        launch(args);
    }
}