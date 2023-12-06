// Code corrected with JavaFX on 12/6/23
// Pierce Mohney
// SDEV 200
// M05 assignment 2
// This program will make a circle entity that is default set to the color of white. 
// When the left click on the mouse is pressed on the circle, the color is the circle is changed to black. 
// Then when the left click on the mouse is released it will turn back to white. 

package com.example.circlecolorchangefx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleColorChangeFX extends Application {

    private Color circleColor = Color.WHITE;
//Sets initial circle color to white 

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Color Changer");

        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setFill(circleColor);
//Creates circle element

        StackPane root = new StackPane();
        root.setBackground(new Background(new BackgroundFill(Color.GREY, null, null)));
        root.getChildren().add(circle);
//Creates window and sets background color to grey 

        root.setOnMousePressed(e -> {
            circleColor = Color.BLACK;
            circle.setFill(circleColor);
        });
//Changes circle color to black when mouse is clicked 

        root.setOnMouseReleased(e -> {
            circleColor = Color.WHITE;
            circle.setFill(circleColor);
        });
//Reverts back to white when mouse is released 

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }
}
