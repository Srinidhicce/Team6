package com.example.expencetrackerapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExpensePage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Expense Tracker");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER); // Set alignment to TOP_LEFT

        Label expenseIdLabel = new Label("Expense ID:");
        TextField expenseIdField = new TextField();

        Label categoryIdLabel = new Label("Category ID:");
        TextField categoryIdField = new TextField();

        Label amountLabel = new Label("Amount:");
        TextField amountField = new TextField();

        Label dateLabel = new Label("Date:");
        DatePicker datePicker = new DatePicker();

        Label descriptionLabel = new Label("Description:");
        TextField descriptionField = new TextField();

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(event -> {
            // Retrieve data from fields and process as needed
            int expenseId = Integer.parseInt(expenseIdField.getText());
            int categoryId = Integer.parseInt(categoryIdField.getText());
            double amount = Double.parseDouble(amountField.getText());
            String date = datePicker.getValue().toString();
            String description = descriptionField.getText();

            // You can perform further actions with the data, such as storing it in a database
            // For simplicity, just print the data for now
            System.out.println("Expense ID: " + expenseId);
            System.out.println("Category ID: " + categoryId);
            System.out.println("Amount: " + amount);
            System.out.println("Date: " + date);
            System.out.println("Description: " + description);
        });

        grid.add(expenseIdLabel, 0, 0);
        grid.add(expenseIdField, 1, 0);
        grid.add(categoryIdLabel, 0, 1);
        grid.add(categoryIdField, 1, 1);
        grid.add(amountLabel, 0, 2);
        grid.add(amountField, 1, 2);
        grid.add(dateLabel, 0, 3);
        grid.add(datePicker, 1, 3);
        grid.add(descriptionLabel, 0, 4);
        grid.add(descriptionField, 1, 4);
        grid.add(submitButton, 1, 5);

        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
