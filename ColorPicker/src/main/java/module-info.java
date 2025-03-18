module com.fx10.colorpicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx10.colorpicker to javafx.fxml;
    exports com.fx10.colorpicker;
}