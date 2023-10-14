module com.example.calculater2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculater2 to javafx.fxml;
    exports com.example.calculater2;
}