module com.example.responsible_cr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.responsible_cr to javafx.fxml;
    exports com.example.responsible_cr;
}