package сl11.JavaFx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Square extends Abs  {


    public Square(GraphicsContext gc, double x, double y) {
        super(gc, x, y);
    }


    public void draw() {
        DIAMETR =30;
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);

        gc.fillRect(x, y, DIAMETR, DIAMETR);
        gc.strokeRect(x, y, DIAMETR, DIAMETR);
    }

}
