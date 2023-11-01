module cs321 {
    requires javafx.controls;
    requires javafx.fxml;

    opens cs321 to javafx.fxml;
    exports cs321;
}
