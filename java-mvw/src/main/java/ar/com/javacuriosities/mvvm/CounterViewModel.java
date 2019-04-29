package ar.com.javacuriosities.mvvm;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CounterViewModel {

    private final IntegerProperty counter;

    public CounterViewModel() {
        counter = new SimpleIntegerProperty(0);
    }

    public Integer getCounter() {
        return counter.get();
    }

    public void setCounter(Integer counter) {
        this.counter.set(counter);
    }

    public IntegerProperty counterProperty() {
        return counter;
    }
}
