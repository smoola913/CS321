package com.cs321;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void createReport(String username, String spouseName, String status) throws IOException {
        DivorceReport dr = new DivorceReport(username, spouseName, status);
        System.out.println(dr);
        App.setRoot("secondary");
    }
}
