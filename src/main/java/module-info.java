module com.st1.semesterprojekt1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.st1 to javafx.fxml;
    exports com.st1;
    exports com.st1.controllers;
    opens com.st1.controllers to javafx.fxml;
}