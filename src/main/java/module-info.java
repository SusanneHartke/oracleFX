module fxtut.oraclefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens fxtut.oraclefx to javafx.fxml;
    exports fxtut.oraclefx;
}