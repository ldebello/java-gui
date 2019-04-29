package ar.com.javacuriosities.mvvm;

import javafx.beans.binding.Bindings;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField message;

    private CounterViewModel viewModel = new CounterViewModel();

    @FXML
    public void buttonClicked(Event e) {
        viewModel.setCounter(viewModel.getCounter() + 1);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Bindings.bindBidirectional(message.textProperty(),
                viewModel.counterProperty(),
                new NumberStringConverter());
    }
}
