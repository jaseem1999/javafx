module com.fx8.radiobutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx8.radiobutton to javafx.fxml;
    exports com.fx8.radiobutton;
}