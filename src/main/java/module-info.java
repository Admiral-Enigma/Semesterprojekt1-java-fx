module com.st1.semesterprojekt1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.st1 to javafx.fxml;
    exports com.st1;
    exports com.st1.controllers;
    opens com.st1.components to javafx.fxml;
    opens com.st1.controllers to javafx.fxml;
    exports com.st1.scene;
    opens com.st1.components to javafx.fxml;
    exports com.st1.components;
    opens com.st1.scene to javafx.fxml;
}