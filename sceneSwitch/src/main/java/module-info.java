module com.fx4.sceneswitch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx4.sceneswitch to javafx.fxml;
    exports com.fx4.sceneswitch;
}