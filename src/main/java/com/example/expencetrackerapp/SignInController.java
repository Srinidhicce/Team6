package com.example.expencetrackerapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SignInController {

    @FXML
    private Button signupButton;
    @FXML
    protected void openExpensePage(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SIGNUP-view.fxml"));
        Parent root = fxmlLoader.load();
        Stage primaryStage = (Stage) signupButton.getScene().getWindow();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }



}
