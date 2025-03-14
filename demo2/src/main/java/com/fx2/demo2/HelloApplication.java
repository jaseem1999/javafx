package com.fx2.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        Scene scene = new Scene(root, 600,600,Color.LIGHTGREEN);
        //set Icon
        Image icon = new Image(getClass().getResourceAsStream("/jaseem.jpg"));
        stage.getIcons().add(icon);
        stage.setTitle("Adil Jaseem");


        Text welcome = new Text("Welcome......");
        welcome.setFill(Color.BLUEVIOLET);
        welcome.setX(50);
        welcome.setY(50);
        welcome.setFont(Font.font("Verdana",30));

        Line line = new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(400);
        line.setEndY(100);
        line.setFill(Color.GRAY);

        Rectangle rectangle = new Rectangle();

        rectangle.setY(110);
        rectangle.setX(50);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.RED);
        rectangle.setStrokeWidth(3);
        rectangle.setStroke(Color.BLUEVIOLET);

        ImageView profile = new ImageView(icon);
        profile.setX(50);
        profile.setY(110);
        profile.setFitWidth(100);
        profile.setFitHeight(100);
        profile.setOpacity(0.9);

        // Circular Clipping - Centering Correctly
        Circle clip = new Circle(profile.getX() + 50, profile.getY() + 50, 50);

        profile.setClip(clip);

        root.getChildren().add(welcome);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(profile);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}