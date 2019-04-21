package ar.com.javacuriosities.utils;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class BasicController implements Initializable {

    @FXML
    private TextField message;

    @FXML
    private Button button;

    public Button getButton() {
        return button;
    }

    @FXML
    public void buttonClicked(Event e) {
        System.out.println("Button clicked");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        message.setText("Initial Message");
    }
}
