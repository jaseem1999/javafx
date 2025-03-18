module com.fx15.treeview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx15.treeview to javafx.fxml;
    exports com.fx15.treeview;
}