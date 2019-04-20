package ar.com.javacuriosities.basics;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BasicController {

    @FXML
    private TextField message;

    public void initialize() {
        message.setText("Initial Message");
    }
}
