package com.fx3.css1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ImageView profile;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (profile != null) {
            Circle clip = new Circle(profile.getFitWidth() / 2, profile.getFitHeight() / 2, profile.getFitWidth() / 2);
            profile.setClip(clip);
        } else {
            System.out.println("Error: ImageView 'profile' is null!");
        }
    }
}