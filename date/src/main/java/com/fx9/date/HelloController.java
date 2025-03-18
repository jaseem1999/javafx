package com.fx9.date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloController {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label dateLabel;

    public void dateShow(ActionEvent event){
        LocalDate date = datePicker.getValue();
        String dateString = date.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
        dateLabel.setText(dateString);
    }
}