package com.fx12.slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Slider mySlider;

    @FXML
    private Label myLabel;

    int temperature;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                temperature = (int) mySlider.getValue();
                myLabel.setText(Integer.toString(temperature)+" *C");
            }
        });
    }
}