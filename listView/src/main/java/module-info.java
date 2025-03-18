module com.fx14.listview {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.fx14.listview to javafx.fxml;
    exports com.fx14.listview;
}