package ar.com.javacuriosities.controls;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * La Scene es el root node graph, en otras palabras es el componente
 * que contiene todos los componentes de UI.
 *
 * Caracteristicas:
 *
 * - Contenido por el Stage.
 * - Es un contenedor para los elementos de la scene.
 * - Forma un Scene Graph.
 */
public class Lesson02Scene extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello JavaFX");

        Group root = new Group(new Label("Hello world"));
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);

        stage.setScene(scene);

        stage.show();

    }

}
