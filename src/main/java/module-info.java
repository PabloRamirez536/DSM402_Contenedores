module org.utleon.dsm402_contenedores {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.utleon.dsm402_contenedores to javafx.fxml;
    exports org.utleon.dsm402_contenedores;
    exports org.utleon.dsm402_contenedores.model;
    opens org.utleon.dsm402_contenedores.model to javafx.fxml;
}