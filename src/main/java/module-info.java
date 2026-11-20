module dev.skystone {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires hu.szit.resclient;

    opens dev.skystone to javafx.fxml;
    exports dev.skystone;
}
