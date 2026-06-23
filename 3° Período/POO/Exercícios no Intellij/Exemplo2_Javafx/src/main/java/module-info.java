module com.example.exemplo2_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exemplo2_javafx to javafx.fxml;
    exports com.example.exemplo2_javafx;
}