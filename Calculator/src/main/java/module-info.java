module com.fx6.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx6.calculator to javafx.fxml;
    exports com.fx6.calculator;
}