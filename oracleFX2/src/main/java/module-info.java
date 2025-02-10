module com.example.oraclefx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oraclefx2 to javafx.fxml;
    exports com.example.oraclefx2;
}