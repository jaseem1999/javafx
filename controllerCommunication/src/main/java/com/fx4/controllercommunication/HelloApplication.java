package com.fx4.controllercommunication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest( event -> {
            event.consume();
            logout(stage);
        });
    }

    public void  logout( Stage stage){


        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Are you sure to logout...");
        alert.setContentText("click ok its will logout");

        if (alert.showAndWait().get() == ButtonType.OK){
            System.out.println("Logout successful");
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}