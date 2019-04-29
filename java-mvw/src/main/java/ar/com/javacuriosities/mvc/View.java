package ar.com.javacuriosities.mvc;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/*
 * La vista es un Observer
 */
public class View implements Observer {

    private JButton btnPressMe;
    private JTextField txtCounter;

    public View() {
        JFrame frame = new JFrame("MVC Example");
        frame.setSize(200, 100);

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.add("North", new JLabel("Counter:"));


        txtCounter = new JTextField();
        frame.add("Center", txtCounter);

        JPanel panel = new JPanel();
        btnPressMe = new JButton("Press Me");
        panel.add(btnPressMe);

        frame.add("South", panel);

        frame.setLocation(100, 100);
        frame.setVisible(true);
    }

    @Override
    public void update(Observable obs, Object obj) {
        // Push Model
        txtCounter.setText("" + ((Integer) obj).intValue());

        // Pull Model read data from Model
    }

    public void addController(Controller controller) {
        btnPressMe.addActionListener((e) -> controller.increment());
    }
}
