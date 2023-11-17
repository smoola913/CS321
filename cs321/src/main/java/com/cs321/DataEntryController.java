package com.cs321;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DataEntryController {

    private Workflow workflow;

    @FXML
    private TextField name;
    @FXML
    private TextField spouse_name;
    @FXML
    private TextField status;

    @FXML
    private void createReport(ActionEvent event) throws IOException {
        DivorceReport dr = new DivorceReport(name.getText(), spouse_name.getText(), status.getText());
        Workflow.createWorkflowItem(dr);
    }

    @FXML
    private void cancel() {
        System.exit(0);
    }
}
