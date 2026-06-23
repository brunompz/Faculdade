package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage palco) {
        VBox layoutPrincipal = new VBox(30);
        layoutPrincipal.setAlignment(Pos.CENTER);

        Button btn = new Button("Botão");

        layoutPrincipal.getChildren().addAll(btn);

        Scene cenaPrincipal = new Scene(layoutPrincipal, 400, 300);

        palco.setScene(cenaPrincipal);
        palco.show();
    }
}




