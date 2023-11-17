package com.cs321;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ReviewController {
    private Review review;

    @FXML
    private TextField user;
    @FXML
    private TextField spouse;
    @FXML
    private TextField marriage;

    public ReviewController() {
        review = new Review(null, null);
    }

    @FXML
    public void initialize() {
        System.out.println("Review initialized.");
    }

    /*
     * Shows the values of the current report in the input textfields.
     * 
     */
    @FXML
    private void view(ActionEvent event) throws IOException {
        if (review.getReport() != null) {
            user.setText(review.getReport().getUserInformation());
            spouse.setText(review.getReport().getSpouseInformation());
            marriage.setText(review.getReport().getMarriageStatus());
        }

        else {
            System.out.println("Report does not exist.");
        }
    }

    /*
     * Modifies the values in the review given the report currently exists and the
     * given strings are not empty.
     * 
     */
    @FXML
    private void edit(ActionEvent event) throws IOException {
        if (user.getText() != "" && review.getReport() != null)
            review.getReport().setUserInformation(user.getText());

        if (spouse.getText() != "" && review.getReport() != null)
            review.getReport().setSpouseInformation(spouse.getText());

        if (marriage.getText() != "" && review.getReport() != null)
            review.getReport().setMarriageStatus(marriage.getText());

        System.out.println(review.getReport());
    }

    /*
     * Gets the next review item in the workflow and sets it to review's report.
     * Shows the values of the newly obtained review item.
     * 
     */

    @FXML
    private void next() {
        review.setReport(Workflow.getReviewItem());

        user.setText(review.getReport().getUserInformation());
        spouse.setText(review.getReport().getSpouseInformation());
        marriage.setText(review.getReport().getMarriageStatus());
    }

    /*
     * Takes the divorce report and adds it to the workflow in the approval step
     * queue. Then resets the values shown in the review screen.
     * 
     */
    @FXML
    private void finish() {
        if (review.getReport() == null) {
            System.out.println("Report does not exist.");
        }

        else {
            System.out.println(review.getReport());

            Workflow.putReviewedItem(review.getReport());

            review.setReport(null);

            user.setText("");
            spouse.setText("");
            marriage.setText("");
        }
    }
}
