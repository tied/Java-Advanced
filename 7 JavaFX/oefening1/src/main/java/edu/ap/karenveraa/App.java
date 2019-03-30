package edu.ap.karenveraa;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {
    Button btn;
    ProcessViewer pv;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ProcessViewer");

        btn = new Button();
        btn.setText("Klik hihi");

        StackPane layout = new StackPane();
        layout.getChildren().add(pv.getItems());
        layout.getChildren().add(btn);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
