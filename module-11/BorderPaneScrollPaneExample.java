/*
* 07/16/2025
* BorderPaneScrollPaneExample.java
*
* This program creates a window with a BorderPane layout, placing labels 
* at the top and bottom, buttons on the left and right, and a scrollable 
* text area in the center. The ScrollPane allows scrolling through the text 
* when it’s too long to fit, while the other parts stay fixed. It shows how to 
* combine layout and scrolling in JavaFX..*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class BorderPaneScrollPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the main layout
        BorderPane borderPane = new BorderPane();

        // Top - Header
        Label topLabel = new Label("Application Header");
        topLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-padding: 10;");
        borderPane.setTop(topLabel);

        // Bottom - Footer
        Label bottomLabel = new Label("Footer: Status messages or version info.");
        bottomLabel.setStyle("-fx-padding: 10;");
        borderPane.setBottom(bottomLabel);

        // Left - Menu or Sidebar
        Label leftLabel = new Label("Tools");
        leftLabel.setStyle("-fx-padding: 10;");
        borderPane.setLeft(leftLabel);

        // Right - Settings or Info
        Label rightLabel = new Label("User Info");
        rightLabel.setStyle("-fx-padding: 10;");
        borderPane.setRight(rightLabel);

        // Center - Scrollable Content
        VBox contentBox = new VBox(10);
        contentBox.setPadding(new Insets(10));

        for (int i = 1; i <= 50; i++) {
            Label line = new Label("Line " + i + ": Scrollable content inside the center area.");
            contentBox.getChildren().add(line);
        }

        ScrollPane scrollPane = new ScrollPane(contentBox);
        scrollPane.setFitToWidth(true);
        borderPane.setCenter(scrollPane);

        // Set up the scene and stage
        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setTitle("JavaFX BorderPane and ScrollPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
