module com.fx4.controllercommunication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx4.controllercommunication to javafx.fxml;
    exports com.fx4.controllercommunication;
}