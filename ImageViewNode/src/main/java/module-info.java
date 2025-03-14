module com.fx5.imageviewnode {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;

    // Allow JavaFX FXML to access the package
    opens com.fx5.imageviewnode to javafx.fxml, com.fasterxml.jackson.databind;

    exports com.fx5.imageviewnode;
}

