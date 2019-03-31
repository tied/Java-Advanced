import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class GridInitializer {
    private static Random rnd = new Random();

    // Recursively draw Mondrian art.  You need to fill in the code for this method.
    public void drawMondrianTile(GraphicsContext gc, int x, int y, int width, int height) {
        gc.setFill(Color.rgb(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
        gc.fillRect(x, y, width, height);

        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        gc.strokeRect(x, y, width, height);

    }

}
