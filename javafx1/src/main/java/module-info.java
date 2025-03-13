module com.fx1.javafx1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx1.javafx1 to javafx.fxml;
    exports com.fx1.javafx1;
}