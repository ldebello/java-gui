package ar.com.javacuriosities.mvc;

/*
 * El Controller trabaja como Listener de View
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void increment() {
        model.incrementValue();
    }

    public void initializeModel(int x) {
        model.setValue(x);
    }
}
