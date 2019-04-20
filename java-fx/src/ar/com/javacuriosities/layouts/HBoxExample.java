package ar.com.javacuriosities.layouts;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("HBox Example");

        Button button1 = new Button("Happy");
        Button button2 = new Button("Sad");

        HBox hBox = new HBox(button1, button2);

        hBox.setSpacing(20); // Tambien es configurable en el constructor

        Scene scene = new Scene(hBox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}