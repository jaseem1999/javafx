module com.fx17.keyevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx17.keyevent to javafx.fxml;
    exports com.fx17.keyevent;
}