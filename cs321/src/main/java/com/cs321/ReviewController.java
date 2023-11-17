package com.cs321;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ReviewController {
    private DivorceReport report;

    @FXML
    private TextField user;
    @FXML
    private TextField spouse;
    @FXML
    private TextField marriage;


    @FXML
    public void initialize() {
        System.out.println("REVIEW");
    }

    /*
     * Shows the values of the current report in the input textfields.
     * 
     */
    @FXML
    private void view(ActionEvent event) throws IOException {
        user.setText(report.getUserInformation());
        spouse.setText(report.getSpouseInformation());
        marriage.setText(report.getMarriageStatus());
    }

    /*
     * Modifies the values in the review given the report currently exists and the
     * given strings are not empty.
     * 
     */
    @FXML
    private void edit(ActionEvent event) throws IOException {
        if (user.getText() != "" && report != null)
            report.setUserInformation(user.getText());

        if (spouse.getText() != "" && report != null)
            report.setSpouseInformation(spouse.getText());

        if (marriage.getText() != "" && report != null)
            report.setMarriageStatus(marriage.getText());

        System.out.println(report);
        
    }

    /*
     * Gets the next review item in the workflow and sets it to review's report.
     * 
     */

    @FXML
    private void next() {
        report = Workflow.getReviewItem();
    }

    /*
     * Takes the divorce report and adds it to the workflow in the approval step
     * queue. Then resets the values shown in the review screen.
     * 
     */
    @FXML
    private void finish() {
        if (report == null) {
            System.out.println("Report does not exist.");
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
