package ar.com.javacuriosities.mvc;

import java.util.Observable;

/*
 * El modelo es Observable
 */
public class Model extends Observable {

    private int counter;

    public Model() {
    }

    public void setValue(int value) {
        this.counter = value;

        setChanged();
        // Push Model
        notifyObservers(counter);

        // Pull Model
        // notifyObservers();

    }

    public void incrementValue() {
        ++counter;

        setChanged();

        // Push Model
        notifyObservers(counter);

        // Pull Model
        // notifyObservers();

    }
}
