module com.example.textanalyse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textanalyse to javafx.fxml;
    exports com.example.textanalyse;
}