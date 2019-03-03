package сl11.JavaFx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Ball extends Abs {

    private static double DIAMETER = 30;

    private GraphicsContext gc;
    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;

    public Ball(GraphicsContext gc, double x, double y) {
        super(gc, x, y);
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



