package ar.com.javacuriosities.mvp;

import javax.swing.*;

public class Main {
    public static void main(String... args) {
        SwingUtilities.invokeLater(() -> {
            View view = new View();
            Model model = new Model();
            new Presenter(view, model);
        });
    }
}
