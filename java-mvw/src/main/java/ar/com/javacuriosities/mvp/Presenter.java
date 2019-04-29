package ar.com.javacuriosities.mvp;

public class Presenter implements ViewListener {
    private final View view;
    private final Model model;

    public Presenter(final View view, final Model model) {
        this.view = view;
        view.addListener(this);
        this.model = model;
    }

    @Override
    public void onButtonClicked() {
        // Update the model (ie. the state of the application)
        model.incrementValue();

        // Update the view
        view.setLabelText(String.valueOf(model.getCounter()));
    }
}