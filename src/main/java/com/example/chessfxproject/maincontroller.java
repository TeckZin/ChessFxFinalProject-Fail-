package com.example.chessfxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class maincontroller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}