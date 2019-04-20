package ar.com.javacuriosities.basics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Lesson01HelloWorld extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello JavaFX");

        Group root = new Group(new Label("Hello world"));
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);

        stage.show();
    }
}
