package com.cs321;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DataEntryController {

    @FXML
    private void createReport(ActionEvent  event) throws IOException {
        System.out.println(event.toString());
        App.setRoot("secondary");
    }
}
