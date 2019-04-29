package ar.com.javacuriosities.mvc;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model = new Model();
            View view = new View();

            model.addObserver(view);

            Controller controller = new Controller(model, view);

            controller.initializeModel(10);

            view.addController(controller);
        });
    }
}
