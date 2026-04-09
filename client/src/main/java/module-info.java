module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.voyevotskiy.client to javafx.base;
    exports org.voyevotskiy.client;
}