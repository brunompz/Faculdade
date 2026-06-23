module com.example.exemplo1_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exemplo1_javafx to javafx.fxml;
    exports com.example.exemplo1_javafx;
}