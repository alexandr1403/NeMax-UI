module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires java.sql;
    requires java.naming;

    opens org.example.demo to javafx.fxml;
    exports org.example.demo;
    exports connection;
    exports network;
    exports cli;
    exports utils;
    exports utils.kt;
    exports cli.utils;

    opens connection to javafx.fxml;
}
