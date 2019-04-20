package ar.com.javacuriosities.controls;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * JavaFX utiliza la clase Stage para representar a single Window en una aplicacion.
 *
 * Podemos construir un Stage de forma simple con
 *
 * Stage stage = new Stage();
 *
 * y luego hacer mostrarlo con show() o showAndWait().
 *
 * Caracteristicas:
 *
 * - Top level container.
 * - Al menos un stage por app.
 * - El stage primario es creado al inicio.
 * - Container para scenes.
 * - Apariciencia y funcionalidad varian en base al OS.
 */
public class Lesson01Stage extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello JavaFX");

        stage.setResizable(false);
        // stage.setFullScreen(true);
        // stage.setAlwaysOnTop(true); // Deja el stage siempre on top

        // stage.setX(50);
        // stage.setY(50);
        // stage.setWidth(600);
        // stage.setHeight(400);

        Stage secondStage = new Stage();
        secondStage.setTitle("Second Stage");

        // secondStage.initModality(Modality.APPLICATION_MODAL); // Modal a la aplicacion
        // secondStage.initModality(Modality.WINDOW_MODAL); // Modal a la ventana asignada como owner

        secondStage.initOwner(stage); // Window owner

        // secondStage.initStyle(StageStyle.DECORATED); // Default windows con OS decorations (Barra de titulo, minimizar, maximizar y boton cerrar) con fondo blanco.
        // secondStage.initStyle(StageStyle.UNDECORATED); // Sin OS decorations con fondo blanco
        // secondStage.initStyle(StageStyle.TRANSPARENT); // Como UNDECORATED pero con fondo transparente
        // secondStage.initStyle(StageStyle.UNIFIED); // Como DECORATED pero sin borde entre la decoracion y el area de contenido
        // secondStage.initStyle(StageStyle.UTILITY); // Decorated windows pero estas son minimas

        stage.initStyle(StageStyle.DECORATED);

        stage.show();

        secondStage.showAndWait();
    }

}
