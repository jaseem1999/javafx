package com.fx16.menuitem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem deleteMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    // Method to close the application
    @FXML
    private void handleClose(ActionEvent event) {
        System.out.println("Closing application...");
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        if (stage != null) {
            stage.close();
        } else {
            System.err.println("Error: Stage is null");
        }
    }

    // Method to handle delete action
    @FXML
    private void handleDelete(ActionEvent event) {
        System.out.println("Delete action triggered!");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Delete Action");
        alert.setHeaderText(null);
        alert.setContentText("Delete functionality is triggered!");
        alert.showAndWait();
    }

    // Method to show about dialog
    @FXML
    private void handleAbout(ActionEvent event) {
        System.out.println("About clicked!");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("JavaFX Application");
        alert.setContentText("This is a simple JavaFX app with a menu.");
        alert.showAndWait();
    }
}