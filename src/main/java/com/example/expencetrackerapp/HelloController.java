package com.example.expencetrackerapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button signupButton;
    @FXML
    private Button signinButton;

    @FXML
    protected void signUpAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SIGNUP-view.fxml"));
        Parent root = fxmlLoader.load();
        Stage primaryStage = (Stage) signupButton.getScene().getWindow();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}