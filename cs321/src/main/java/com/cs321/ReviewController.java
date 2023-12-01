package com.cs321;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ReviewController {
    private DivorceReport report;

    public DivorceReport getReport() {
        return report;
    }

    public void setReport(DivorceReport report) {
        this.report = report;
    }

    @FXML
    private TextField user;
    @FXML
    private TextField spouse;
    @FXML
    private TextField marriage;

    Alert nullInitialized;
    Alert nullWorkflow;
    Alert emptyField;
    Alert existingItem;

    @FXML
    public void initialize() {
        System.out.println("Review initialized.");

        nullInitialized = new Alert(AlertType.ERROR);
        nullInitialized.setTitle("Error");
        nullInitialized.setHeaderText("No Review Item Initialized");
        nullInitialized.setContentText("There is no review item currently initialized.");

        nullWorkflow = new Alert(AlertType.ERROR);
        nullWorkflow.setTitle("Error");
        nullWorkflow.setHeaderText("No Review Items in Workflow");
        nullWorkflow.setContentText("There are no items in the review workflow table.");

        emptyField = new Alert(AlertType.WARNING);
        emptyField.setTitle("Notice");
        emptyField.setHeaderText("Empty Field");
        emptyField.setContentText("One or more of the fields is empty. Empty fields will not be changed.");

        existingItem = new Alert(AlertType.ERROR);
        existingItem.setTitle("Error");
        existingItem.setHeaderText("Existing Review Item");
        existingItem.setContentText(
                "The existing review item needs to be handled before taking another item from the workflow.");
    }

    /*
     * Shows the values of the current report in the input textfields.
     * If the report is null then instead shows an alert.
     * 
     */
    @FXML
    private void view() {
        if (report != null) {
            user.setText(report.getUserInformation());
            spouse.setText(report.getSpouseInformation());
            marriage.setText(report.getMarriageStatus());
        }

        else {
            nullInitialized.showAndWait();
        }
    }

    /*
     * Modifies the values in the review given the report currently exists and the
     * given strings are not empty. If any of the strings are empty warn that some
     * fields are not being modified. If the report is null make an error alert.
     * 
     */
    @FXML
    private void edit() {
        if (report != null) {
            if (!user.getText().isEmpty()) {
                report.setUserInformation(user.getText());
            }

            if (!spouse.getText().isEmpty()) {
                report.setSpouseInformation(spouse.getText());
            }

            if (!marriage.getText().isEmpty()) {
                report.setMarriageStatus(marriage.getText());
            }

            if (user.getText().isEmpty() || spouse.getText().isEmpty() || marriage.getText().isEmpty()) {
                emptyField.showAndWait();
            }
        }

        else {
            nullInitialized.showAndWait();
        }
    }

    /*
     * Gets the next review item in the workflow if there is not already a review
     * item being handled. If a review item is already currently being handled it
     * returns an error alert.
     */

    @FXML
    private void next() {
        if (report == null) {
            report = Workflow.getReviewItem();

            if (report == null) {
                nullWorkflow.showAndWait();
            }
        }

        else {
            existingItem.showAndWait();
        }
    }

    /*
     * Takes the divorce report and adds it to the workflow in the approval step
     * queue. Then resets the values shown in the review screen. If the report is
     * null show an error alert instead.
     * 
     */
    @FXML
    public void finish() {
        if (report == null) {
            nullInitialized.showAndWait();
        }

        else {
            System.out.println(report);

            Workflow.putReviewedItem(report);

            report = null;

            user.setText("");
            spouse.setText("");
            marriage.setText("");
        }
    }
}
