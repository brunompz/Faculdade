package com.example.exemplo2_javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Exemplo1 extends Application {
    public static void main(String[] args){
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception{
        Label lbl1 = new Label("Teste");
        lbl1.setFont(new Font("Arial", 24));
        lbl1.setAlignment(Pos.CENTER);
        Scene scene = new Scene(lbl1, 500, 100);
        stage.setScene(scene);
        stage.show();
    }

}
