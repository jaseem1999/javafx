module com.fx14.spinner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx14.spinner to javafx.fxml;
    exports com.fx14.spinner;
}