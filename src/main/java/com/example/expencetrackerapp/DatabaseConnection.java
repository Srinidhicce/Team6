package com.example.expencetrackerapp;

import javafx.scene.control.Alert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class DatabaseConnection {
    static String user = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/expence_tracker";
    static String driver = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            showErrorAlert("Database Connection Error", "Error connecting to the database", e.getMessage());
        }
        return connection;
    }

    private static void showErrorAlert(String title,String header,String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
