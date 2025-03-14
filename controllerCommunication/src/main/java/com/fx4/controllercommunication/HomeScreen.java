package com.fx4.controllercommunication;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeScreen {

    @FXML
    Label nameLabel;

    @FXML
    private Button logoutBtn;



    public void displayName(String name){
        nameLabel.setText("Hello "+name);
    }

    public void  logout(ActionEvent event){
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Are you sure to logout...");
        alert.setContentText("click ok its will logout");

        if (alert.showAndWait().get() == ButtonType.OK){
            System.out.println("Logout successful");
            stage.close();
        }
    }
}
