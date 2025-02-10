module fxtut.teil3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens fxtut.teil3 to javafx.fxml;
    exports fxtut.teil3;
}