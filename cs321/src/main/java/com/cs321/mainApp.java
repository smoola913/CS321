package com.cs321;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    private static Scene dataentry;
    private static Scene review;
    private static Scene approval;

    /*
     * Stage and scene creation for the data entry, review, and approval steps.
     * 
     */
    @Override
    public void start(Stage reviewStage) throws IOException {
        dataentry = createScene("data-entry");
        review = createScene("review");
        approval = createScene("approval");

        reviewStage.setScene(review);
        reviewStage.setTitle("Review");
        reviewStage.setHeight(800);
        reviewStage.setWidth(600);
        reviewStage.show();

        Stage dataEntryStage = new Stage();
        dataEntryStage.setScene(dataentry);
        dataEntryStage.setTitle("Data Entry");
        dataEntryStage.setX(reviewStage.getX() + 700);
        dataEntryStage.setY(reviewStage.getY());
        dataEntryStage.show();

        Stage approvalStage = new Stage();
        approvalStage.setScene(approval);
        approvalStage.setTitle("Approval");
        approvalStage.setX(reviewStage.getX() - 700);
        approvalStage.setY(reviewStage.getY());
        approvalStage.show();
    }

    private static Scene createScene(String fxml) throws IOException {
        Parent root = FXMLLoader.load(MainApp.class.getResource(fxml + ".fxml"));
        return new Scene(root, 640, 480);
    }

    public static void main(String[] args) {
        launch();
    }
}
