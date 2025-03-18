module com.fx11.choicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx11.choicebox to javafx.fxml;
    exports com.fx11.choicebox;
}