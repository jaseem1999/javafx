module com.fx7.checkbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx7.checkbox to javafx.fxml;
    exports com.fx7.checkbox;
}