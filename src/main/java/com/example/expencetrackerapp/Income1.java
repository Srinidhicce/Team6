package com.example.expencetrackerapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Income1{
    @FXML
    public Button submitButton;

    @FXML
    private void openIncomePage(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("graph.fxml"));
        Parent root = fxmlLoader.load();
        Stage primaryStage = (Stage) submitButton.getScene().getWindow();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void openExpensePage(ActionEvent actionEvent) {
    }

    public void initialize(ActionEvent actionEvent) {
    }
}
