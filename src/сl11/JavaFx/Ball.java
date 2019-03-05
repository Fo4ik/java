package сl11.JavaFx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;
import java.util.Random;

public class Ball extends Abs {
    public int ballx;
    public int bally;

    public Ball(GraphicsContext gc, double x, double y, List<Shape> shapes) {
        super(gc, x, y, shapes);
    }

    public void draw() {
        DIAMETR =30;
        gc.setFill(Color.RED);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);

        gc.fillOval(x, y, DIAMETR, DIAMETR);
        gc.strokeOval(x, y, DIAMETR, DIAMETR);
    }


}



