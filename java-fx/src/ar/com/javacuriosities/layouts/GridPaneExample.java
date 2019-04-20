package ar.com.javacuriosities.layouts;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("GridPane Example");

        Button b1 = new Button("First Button");
        Button b2 = new Button("Second Button");
        Button b3 = new Button("Third Button");
        Button b4 = new Button("Fourth Button");

        GridPane.setConstraints(b1, 0, 0);
        GridPane.setConstraints(b2, 0, 1);
        GridPane.setConstraints(b3, 1, 0);
        GridPane.setConstraints(b4, 1, 1);

        GridPane gridPane = new GridPane();

        gridPane.setGridLinesVisible(true);

        gridPane.getChildren().add(b1);
        gridPane.getChildren().add(b2);
        gridPane.getChildren().add(b3);
        gridPane.getChildren().add(b4);

        Scene scene = new Scene(gridPane, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}