package com.fx4.controllercommunication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
   private Stage stage;
   private Scene scene;
   private Parent root;

   @FXML
   private TextField nameField;

   public void login(ActionEvent event) throws IOException {
       String username = nameField.getText();

       FXMLLoader loader = new FXMLLoader(getClass().getResource("home-screen.fxml"));
       root = loader.load();

       HomeScreen homeScreen = loader.getController();
       homeScreen.displayName(username);
       stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();

   }
}