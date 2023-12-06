package com.example.circlecolorchangefx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ColorController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Circle Color Changer");
    }
}
