package ar.com.javacuriosities.basics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Lesson03LifeCycle extends Application {

    public static void main(String[] args) {
        System.out.println("1- Main entry point");
        Application.launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("2- Init Application");
        super.init();
    }

    @Override
    public void start(Stage stage) {
        System.out.println("3- Start Application");

        stage.setTitle("Hello JavaFX");

        System.out.println("4- Show Stage");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("5- Stop Application");
        super.stop();
    }
}
