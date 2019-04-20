package ar.com.javacuriosities.layouts;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * El Group es un container que no aplica ningun layout a sus componentes, todos
 * son posicionados a la posicion (0,0)
 */
public class GroupExample extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Group Example");

        Group g = new Group();
        Button b1 = new Button("First");
        Button b2 = new Button("Second");

        g.getChildren().addAll(b1, b2);

        b2.setLayoutX(0);
        b2.setLayoutY(150);

        Scene scene = new Scene(g, 300, 400);

        stage.setScene(scene);

        stage.show();
    }
}