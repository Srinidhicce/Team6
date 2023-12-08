package com.example.expencetrackerapp;

import javafx.scene.control.Alert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class DatabaseConnection {
    static String user = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/expensetracker";
    static String driver = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            showErrorAlert(e.getMessage());
        }
        return connection;
    }

    private static void showErrorAlert(String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Database Connection Error");
        alert.setHeaderText("Error connecting to the database");
        alert.setContentText(content);
        alert.showAndWait();
    }
}
