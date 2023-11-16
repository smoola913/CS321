package com.cs321;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class mainApp extends Application {
    private static Scene de;
    private static Scene review;
    private static Scene approval;

    @Override
    public void start(Stage primaryStage) throws IOException {
        de = createScene("data-entry");
        review = createScene("review");
        approval = createScene("approval");

        primaryStage.setScene(de);
        primaryStage.setTitle("Data Entry");
        primaryStage.show();

        // Create and show additional stages for scene 2 and scene 3
        Stage stage2 = new Stage();
        stage2.setScene(review);
        stage2.setTitle("Review");
        stage2.show();

        Stage stage3 = new Stage();
        stage3.setScene(approval);
        stage3.setTitle("Approval");
        stage3.show();
    }

    private static Scene createScene(String fxml) throws IOException {
        Parent root = FXMLLoader.load(mainApp.class.getResource(fxml + ".fxml"));
        return new Scene(root, 640, 480);
    }

    public static void main(String[] args) {
        launch();
    }
}
