module com.example.mid001 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mid001 to javafx.fxml;
    exports com.example.mid001;
}