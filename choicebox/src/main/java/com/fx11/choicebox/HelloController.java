package com.fx11.choicebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox<String> myChoiceBox;

    @FXML
    private Label myLabel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String food[] = {"Biriyani","Mandi","Alfam"};
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::onChoice);
    }

    public void onChoice(ActionEvent event){
        String choice=myChoiceBox.getValue();
        myLabel.setText(choice);
    }
}