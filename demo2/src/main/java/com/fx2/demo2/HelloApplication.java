package com.fx2.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        Group root = new Group();
        Scene scene = new Scene(root, Color.GREEN);
        //set Icon
        Image icon = new Image(getClass().getResourceAsStream("/jaseem.jpg"));
        stage.getIcons().add(icon);
        stage.setTitle("Adil Jaseem");
        stage.setWidth(400);
        stage.setHeight(400);
//        stage.setX(50);
//        stage.setY(100);
//        stage.setFullScreen(true); // full screen
////        stage.setResizable(false); resizable disable
//        stage.setFullScreenExitHint("Escape enter a ");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("a"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}