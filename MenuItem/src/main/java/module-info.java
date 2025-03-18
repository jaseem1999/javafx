module com.fx16.menuitem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx16.menuitem to javafx.fxml;
    exports com.fx16.menuitem;
}