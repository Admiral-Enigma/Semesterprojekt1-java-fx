module com.st1.semesterprojekt1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.st1 to javafx.fxml;
    exports com.st1.ui.controllers;
    opens  com.st1.ui.controllers to  javafx.fxml;
    exports com.st1.ui.components to  javafx.fxml;
    opens com.st1.ui.components;
    exports com.st1.inventory.items;

    exports com.st1;
}