package ar.com.javacuriosities.basics;

import ar.com.javacuriosities.utils.Bill;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;

public class Lesson05Bindings {

    public static void main(String[] args) {
        observableProperty();

        unidirectionalBinding();

        bidirectionalBinding();

        highLevelBinding();

        lowLevelBinding();

        invalidationListener();
    }

    private static void observableProperty() {
        System.out.println("*** Observable Property ***");

        Bill electricBill = new Bill();

        electricBill.amountDueProperty().addListener((ChangeListener) (o, oldVal, newVal) -> System.out.println("Electric bill has changed!"));

        electricBill.setAmountDue(100.00);
    }

    private static void unidirectionalBinding() {
        System.out.println("*** Unidirectional Binding ***");
        StringProperty property1 = new SimpleStringProperty();
        StringProperty property2 = new SimpleStringProperty();
        property2.bind(property1);

        property1.set("First Value");

        System.out.println(property2.get());
    }

    private static void bidirectionalBinding() {
        System.out.println("*** Bidirectional Binding ***");
        StringProperty property1 = new SimpleStringProperty();
        StringProperty property2 = new SimpleStringProperty();
        property2.bindBidirectional(property1);

        property2.set("First Value");
        property1.set("Second Value");

        System.out.println(property2.get());
    }

    private static void highLevelBinding() {
        System.out.println("*** High Level Binding ***");

        IntegerProperty length = new SimpleIntegerProperty(10);
        IntegerProperty width = new SimpleIntegerProperty(15);
        NumberBinding area = length.multiply(width);
        NumberBinding per = Bindings.add(length, width).multiply(2);
        NumberBinding twiceTheArea = area.multiply(2);

        System.out.println(area.getValue());
        System.out.println(per.getValue());
        System.out.println(twiceTheArea.getValue());
    }

    private static void lowLevelBinding() {
        System.out.println("*** Low Level Binding ***");

        DoubleProperty radius = new SimpleDoubleProperty(15);
        DoubleBinding volumeBinding = new DoubleBinding() {
            {
                super.bind(radius);
            }

            @Override
            protected double computeValue() {
                return (4 / 3 * Math.PI * Math.pow(radius.get(), 3));
            }
        };

        System.out.println(volumeBinding.getValue());
    }

    private static void invalidationListener() {
        System.out.println("*** Invalidation Listener ***");

        Bill bill1 = new Bill();
        Bill bill2 = new Bill();
        Bill bill3 = new Bill();

        NumberBinding total =
                Bindings.add(bill1.amountDueProperty().add(bill2.amountDueProperty()),
                        bill3.amountDueProperty());
        total.addListener(o -> System.out.println("The binding is now invalid."));

        // First call makes the binding invalid
        bill1.setAmountDue(200.00);

        // The binding is now invalid
        bill2.setAmountDue(100.00);
        bill3.setAmountDue(75.00);

        // Make the binding valid...
        System.out.println(total.getValue());

        // Make invalid...
        bill3.setAmountDue(150.00);

        // Make valid...
        System.out.println(total.getValue());
    }
}
