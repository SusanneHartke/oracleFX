module com.example.oraclefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oraclefx to javafx.fxml;
    exports com.example.oraclefx;
}