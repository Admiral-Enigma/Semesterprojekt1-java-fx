module com.st1.semesterprojekt1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.st1 to javafx.fxml;
    exports com.st1;
    exports com.st1.ui.controllers;
    exports com.st1.inventory;

    opens com.st1.ui.components to javafx.fxml;
    opens com.st1.ui.controllers to javafx.fxml;
    opens com.st1.inventory to javafx.fxml;
    exports com.st1.ui.components;
    exports com.st1.core;
    opens com.st1.core to javafx.fxml;
}