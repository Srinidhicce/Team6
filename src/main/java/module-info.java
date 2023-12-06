module com.example.expencetrackerapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.expencetrackerapp to javafx.fxml;
    exports com.example.expencetrackerapp;
}