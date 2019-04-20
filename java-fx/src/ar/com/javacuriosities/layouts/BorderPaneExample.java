package ar.com.javacuriosities.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("BorderPane Example");

        Button top = new Button("Top");
        Button bottom = new Button("Bottom");
        Button left = new Button("Left");
        Button right = new Button("Right");
        Button center = new Button("Center");

        BorderPane borderPane = new BorderPane();

        borderPane.setTop(top);
        borderPane.setBottom(bottom);
        borderPane.setLeft(left);
        borderPane.setRight(right);
        borderPane.setCenter(center);

        Scene scene = new Scene(borderPane, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}