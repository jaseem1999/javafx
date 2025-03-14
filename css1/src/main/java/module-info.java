module com.fx3.css1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx3.css1 to javafx.fxml;
    exports com.fx3.css1;
}