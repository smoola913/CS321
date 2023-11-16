package com.cs321;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ReviewController {
    private DivorceReport report;
    private Workflow workflow;
    private Review review;

    @FXML
    private TextField user;
    @FXML
    private TextField spouse;
    @FXML
    private TextField marriage;

    public ReviewController() {
        report = new DivorceReport("John", "Jane", "Married");
        // workflow = new Workflow(report, "Review");

        review = new Review(false, workflow);
    }

    @FXML
    private void view(ActionEvent event) throws IOException {
        user.setText(review.getReport().getUserInformation());
        spouse.setText(review.getReport().getSpouseInformation());
        marriage.setText(review.getReport().getMarriageStatus());
    }

    @FXML
    private void edit(ActionEvent event) throws IOException {
        if (user.getText() != "")
            review.getReport().setUserInformation(user.getText());
        if (spouse.getText() != "")
            review.getReport().setSpouseInformation(spouse.getText());
        if (marriage.getText() != "")
            review.getReport().setMarriageStatus(marriage.getText());

        System.out.println(report);
    }

    @FXML
    private void finish() {
        System.out.println(report);
        System.exit(0);
    }
}
