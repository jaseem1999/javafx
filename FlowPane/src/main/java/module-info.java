module com.fx17.flowpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx17.flowpane to javafx.fxml;
    exports com.fx17.flowpane;
}