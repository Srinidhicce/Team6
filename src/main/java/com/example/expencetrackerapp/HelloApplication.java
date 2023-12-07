package com.example.expencetrackerapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
          //import javafx.scene.Node;
         //import javafx.scene.layout.GridPane;
        // import javafx.scene.layout.StackPane;
       // import javafx.scene.layout.TilePane;
      //import javafx.scene.layout.VBox;
     //import javafx.scene.control.PasswordField;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Set title for the stage
        primaryStage.setTitle("EXPENSE TRACKER");

        // Call the Expenses method to set the scene
        Expenses(primaryStage);

        // Show the stage
        primaryStage.show();
    }

    public void Expenses(Stage primaryStage) {
        // Create a label
        Label label = new Label("BUDGETS");
        label.setStyle("-fx-font-family:'Eras Demi ITC';-fx-font-weight:bold;-fx-font-size:54");
        label.setAlignment(Pos.TOP_CENTER);
        TextField texts = new TextField();
        Scene scene = new Scene(label, 300, 200);
        primaryStage.setTitle("EXPENSE TRACKER");
       // HBox vb = new HBox();
        Button btnback = new Button("BACK");
        Button btncancel = new Button("CANCEL");
        Button btnset = new Button("SET BUDGET");
       /* vb.getChildren().addAll(btnback, btnset, btncancel);
        primaryStage.setScene(scene);
        btncancel.setDefaultButton(true);
        btnback.setDefaultButton(true);
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(20);
        // Scene scene = new Scene(label, 400, 200);
        primaryStage.setTitle("Budget Limiting");
        primaryStage.show();*/
        StackPane layout=new StackPane();
        layout.getChildren().addAll(btnback, btncancel, btnset);
        //Scene scene=new Scene(layout,300,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Budget Limiting");
        primaryStage.show();
    }
    public static void main(String[] args) {
        // launch the application
        launch(args);
    }
}