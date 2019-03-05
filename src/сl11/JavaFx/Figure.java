package сl11.JavaFx;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Figure extends Abs {


    public Figure(GraphicsContext gc, double x, double y, List<Shape> shapes) {
        super(gc, x, y, shapes);
    }

    @Override
    public void draw() {
        DIAMETR = 60;

        gc.setFill(Color.BROWN);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);

        double[] xDouble = {x + 30, x + 60, x + 50, x + 50, x + 10, x + 10, x};
        double[] yDouble = {y, y + 30, y + 30, y + 60, y + 60, y + 30, y + 30};

        gc.fillPolygon(xDouble, yDouble, 7);

        gc.setFill(Color.BLUE);
        gc.fillPolygon(xDouble, yDouble, 5);
        gc.fillRect(x + 18, y + 40, 7, 7);
        gc.fillRect(x + 38, y + 40, 7, 7);
    }
}
