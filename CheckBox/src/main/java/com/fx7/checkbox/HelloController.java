package com.fx7.checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private CheckBox checkBox;
    @FXML
    private Label nyLabel;

    public void manage(ActionEvent event){
        if (checkBox.isSelected()){
            nyLabel.setText("ON");
        }else{
            nyLabel.setText("OFF");
        }
    }
}