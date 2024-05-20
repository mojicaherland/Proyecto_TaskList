package com.example.tasklist;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controlladores {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}