import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Map;

public class Lesson02HelloWorldArgs extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello JavaFX");

        Map<String, String> named = getParameters().getNamed();

        Integer width = Integer.parseInt(named.get("width"));
        Integer height = Integer.parseInt(named.get("height"));

        Group root = new Group(new Label("Hello world"));

        Scene scene = new Scene(root, width, height);
        stage.setScene(scene);

        stage.show();
    }
}
