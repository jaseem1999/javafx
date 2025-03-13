module com.fx2.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx2.demo2 to javafx.fxml;
    exports com.fx2.demo2;
}