module com.cs321 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cs321 to javafx.fxml;

    exports com.cs321;
}
