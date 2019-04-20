package ar.com.javacuriosities.layouts;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("FlowPane Example");

        Button button1 = new Button("Number 1");
        Button button2 = new Button("Number 2");
        Button button3 = new Button("Number 3");

        FlowPane flowpane = new FlowPane();

        flowpane.getChildren().add(button1);
        flowpane.getChildren().add(button2);
        flowpane.getChildren().add(button3);

        flowpane.setHgap(10);
        flowpane.setVgap(20);

        flowpane.setOrientation(Orientation.VERTICAL);

        Scene scene = new Scene(flowpane, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}