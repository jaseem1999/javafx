package com.fx13.progressbar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ProgressBar myProgressbar;

    @FXML
    private Label myLabel;

    @FXML
    private Button myBtn;

    private BigDecimal progress = BigDecimal.valueOf(0.0);

    public void increase(){

        if (progress.doubleValue() < 1){
            progress = progress.add(BigDecimal.valueOf(0.1)); // Correctly increment progress
            myProgressbar.setProgress(progress.doubleValue()); // Update progress bar correctly
            myLabel.setText((int) Math.round(progress.doubleValue() * 100) + "%");

        }else{
            myBtn.setText("100% completed");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myProgressbar.setStyle("-fx-accent : #00FF00;");
    }


}