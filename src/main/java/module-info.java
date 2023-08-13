module com.example.turismoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.turismoapp to javafx.fxml;
    exports com.example.turismoapp;
}