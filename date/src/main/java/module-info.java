module com.fx9.date {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx9.date to javafx.fxml;
    exports com.fx9.date;
}