module com.example.exemplo3_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exemplo3_javafx to javafx.fxml;
    exports com.example.exemplo3_javafx;
}