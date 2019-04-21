package ar.com.javacuriosities.basics;

import ar.com.javacuriosities.utils.BasicController;
import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Un evneto representa la ocurrencia de algo de interes para
 * la aplicacion, como puede ser el mouse moviendose o el presionar
 * una tecla.
 *
 * Cuando un evento es procesado sucede lo que se llama Event Processing
 * que consiste de 4 pasos
 *
 * - Target Selection (Se marca el elemento objectivo)
 * - Rout Construction (Se traza el recorrido)
 * - Event Capturing (El evento va hasta desde el root hasta el componente)
 * - Event Bubbling (El evento va hasta desde el componente hasta el root)
 *
 * Los EventFilter se ejecutan en el Event Capturing
 * Los EventHandler se ejecutan en el Event Bubbling
 */
public class Lesson06Events extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lesson04.fxml"));
        HBox box = loader.load();
        BasicController controller = loader.getController();
        Button button = controller.getButton();

        button.addEventFilter(Event.ANY, event -> {
            System.out.println("Event Filter: " + event.getEventType());
            if (MouseEvent.MOUSE_MOVED == event.getEventType()) {
                event.consume();
            }
        });

        button.addEventHandler(Event.ANY, event -> {
            System.out.println("Event Handler: " + event.getEventType());
        });

        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}