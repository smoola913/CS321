package com.cs321;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ApprovalController {

    @FXML
    private TextField client_name;
    @FXML
    private TextField current_status;
    @FXML
    private TextField desired_status;

    @FXML
    private void sendApproval(ActionEvent event) throws IOException {
        System.out.println("APPROVED: " + client_name.getText() + " would like to change their marriage status from " + current_status.getText() + " to " + desired_status.getText() + ".");
    }

    @FXML
    private void denyApproval(ActionEvent event) throws IOException {
        System.out.println("DENIED: " + client_name.getText() + " would like to change their marriage status from " + current_status.getText() + " to " + desired_status.getText() + ".");
        System.out.println("Form has been sent back for review.");
    }
}
