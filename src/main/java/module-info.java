module com.example.expencetrackerapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.expencetrackerapp to javafx.fxml;
    exports com.example.expencetrackerapp;
}