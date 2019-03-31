import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Mondrian extends Application {
    private GridInitializer gridInitializer = new GridInitializer();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.UNDECORATED);
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(350, 350);

        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 0, 0, 150, 10);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 0, 10, 150, 165);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 150, 0, 180, 175);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 300, 0, 80, 25);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 300, 25, 80, 125);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 300, 150, 80, 25);

        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 0, 175, 40, 175);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 40, 175, 110, 110);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 40, 285, 110, 60);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 40, 335, 210, 15);

        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 150, 175, 150, 160);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 300, 175, 80, 180);
        gridInitializer.drawMondrianTile(canvas.getGraphicsContext2D(), 250, 335, 50, 15);

        root.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mondrian Art");
        primaryStage.show();
    }
}