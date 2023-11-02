package com.cs321;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DataEntryController {

    @FXML
    private TextField name;
    @FXML
    private TextField spouse_name;

    @FXML
    private void createReport(ActionEvent event) throws IOException {
        DivorceReport dr = new DivorceReport(name.getText(), spouse_name.getText(), "N/A ATM");
        System.out.println(dr);
    }
}
