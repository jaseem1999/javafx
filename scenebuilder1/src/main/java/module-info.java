module com.fx2.scenebuilder1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx2.scenebuilder1 to javafx.fxml;
    exports com.fx2.scenebuilder1;
}