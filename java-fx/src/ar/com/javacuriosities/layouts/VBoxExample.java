package ar.com.javacuriosities.layouts;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("VBox Example");

        Button button1 = new Button("Happy");
        Button button2 = new Button("Sad");

        VBox vBox = new VBox(button1, button2);

        vBox.setSpacing(20); // Tambien es configurable en el constructor
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}