package com.cs321;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class mainApp extends Application {
    private static Scene dataentry;
    private static Scene review;
    private static Scene approval;

    /*
     * Stage and scene creation for the data entry, review, and approval steps.
     * 
     */
    @Override
    public void start(Stage dataEntryStage) throws IOException {
        dataentry = createScene("data-entry");
        review = createScene("review");
        approval = createScene("approval");

        dataEntryStage.setScene(dataentry);
        dataEntryStage.setTitle("Data Entry");
        dataEntryStage.show();

        Stage reviewStage = new Stage();
        reviewStage.setScene(review);
        reviewStage.setTitle("Review");
        reviewStage.setX(dataEntryStage.getX());
        reviewStage.setY(dataEntryStage.getY());
        reviewStage.setHeight(800);
        reviewStage.setWidth(600);
        reviewStage.show();

        Stage approvalStage = new Stage();
        approvalStage.setScene(approval);
        approvalStage.setTitle("Approval");
        approvalStage.setX(dataEntryStage.getX() + 700);
        approvalStage.setY(dataEntryStage.getY());
        approvalStage.show();

        dataEntryStage.setX(dataEntryStage.getX() - 700);
    }

    private static Scene createScene(String fxml) throws IOException {
        Parent root = FXMLLoader.load(mainApp.class.getResource(fxml + ".fxml"));
        return new Scene(root, 640, 480);
    }

    public static void main(String[] args) {
        launch();
    }
}
