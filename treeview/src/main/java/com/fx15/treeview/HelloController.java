package com.fx15.treeview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TreeView<String> treeView;

    @FXML
    private Label myLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("file1.png")));
        imageView.setFitWidth(15);
        imageView.setFitHeight(15);
        TreeItem<String> rootItem = new TreeItem<>
                ("Files",imageView);

        TreeItem<String> branch1 = new TreeItem<>("documents");
        TreeItem<String> branch2 = new TreeItem<>("downloads");
        TreeItem<String> branch3 = new TreeItem<>("Pictures");
        treeView.setRoot(rootItem);
        rootItem.getChildren().addAll(branch1,branch2,branch3);
        TreeItem<String> item1 = new TreeItem<>("jasee.word");
        TreeItem<String> item2 = new TreeItem<>("file.pdf");
        TreeItem<String> item3 = new TreeItem<>("hi.pdf");
        TreeItem<String> item4 = new TreeItem<>("project.pdf");
        TreeItem<String> item5 = new TreeItem<>("some.word");
        TreeItem<String> item6 = new TreeItem<>("took.pdf");
        TreeItem<String> item7 = new TreeItem<>("jaseem.png");
        TreeItem<String> item8 = new TreeItem<>("adil.jpg");
        TreeItem<String> item9 = new TreeItem<>("navneeth.png");

        branch2.getChildren().addAll(item1,item2,item3);
        branch1.getChildren().addAll(item4,item5,item6);
        branch3.getChildren().addAll(item7,item8,item9);

    }

    public void selectItem(){
        TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
        if(item != null){
            myLabel.setText(item.getValue());
        }
    }


}