package com.fx14.listview;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ListView<String> myListView;

    @FXML
    private Label myLabel;

    String subject[] = {"DAA","ASE","ADS","DFS"};

    private String currentSub;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myListView.getItems().addAll(subject);

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                currentSub=myListView.getSelectionModel().getSelectedItem();
                myLabel.setText(currentSub);
            }
        });

    }
}