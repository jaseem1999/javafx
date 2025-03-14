package com.fx2.scenebuilder1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Arc;

import java.util.EventListener;

public class HelloController {

    @FXML
    private Arc arc;
    public double x;
    public double y;

    public void up(ActionEvent e){
        arc.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
        arc.setCenterY(y+=10);
    }
    public void left(ActionEvent e){
        arc.setCenterX(x-=10);
    }
    public void right(ActionEvent e){
        arc.setCenterX(x+=10);
    }
}