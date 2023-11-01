package com.cs321;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        DivorceReport dr = new DivorceReport(null, null, null)
        App.setRoot("secondary");
    }
}
