package com.cs321;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ApprovalController {

    private Approval approval;

    @FXML
    private TextField client_name;
    @FXML
    private TextField spouse_name;
    @FXML
    private TextField desired_status;

    public ApprovalController() {
        this.approval = new Approval();
    }

    @FXML
    private void sendApproval(ActionEvent event) throws IOException {
        System.out.println("APPROVED: " + client_name.getText() + " would like to change their marriage status with " + spouse_name.getText() + " to " + desired_status.getText() + ".");
    }

    @FXML
    private void denyApproval(ActionEvent event) throws IOException {
        System.out.println("DENIED: " + client_name.getText() + " would like to change their marriage status with " + spouse_name.getText() + " to " + desired_status.getText() + ".");
        System.out.println("Form has been sent back for review.");
    }

    @FXML
    private void load(){
        approval.setReport(Workflow.getApprovalItem());
    }

    @FXML void fill(){
        client_name.setText(approval.getReport().getUserInformation());
        spouse_name.setText(approval.getReport().getSpouseInformation());
        desired_status.setText(approval.getReport().getMarriageStatus());
    }
}
