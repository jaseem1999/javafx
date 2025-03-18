package com.fx8.radiobutton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {

    @FXML
    private RadioButton ok, no, off, yes;

    @FXML
    private Label label;

    public void radioButtonManage(ActionEvent event){
        if(ok.isSelected()){
            label.setText(ok.getText());
        }else if (no.isSelected()){
            label.setText(no.getText());
        }else if (off.isSelected()){
            label.setText(off.getText());
        }else if (yes.isSelected()){
            label.setText(yes.getText());
        }else {
            label.setText("Please select");
        }
    }

}