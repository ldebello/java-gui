package ar.com.javacuriosities.layouts;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneExample extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TilePane Example");

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        TilePane tilePane = new TilePane();

        tilePane.getChildren().add(button1);
        tilePane.getChildren().add(button2);
        tilePane.getChildren().add(button3);
        tilePane.getChildren().add(button4);
        tilePane.getChildren().add(button5);
        tilePane.getChildren().add(button6);

        tilePane.setHgap(10);
        tilePane.setVgap(10);

        tilePane.setPrefColumns(3);
        tilePane.setTileAlignment(Pos.TOP_LEFT);

        Scene scene = new Scene(tilePane, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}