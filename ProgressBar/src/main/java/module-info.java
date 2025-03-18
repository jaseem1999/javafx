module com.fx13.progressbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx13.progressbar to javafx.fxml;
    exports com.fx13.progressbar;
}