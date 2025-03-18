module com.fx12.slider {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx12.slider to javafx.fxml;
    exports com.fx12.slider;
}