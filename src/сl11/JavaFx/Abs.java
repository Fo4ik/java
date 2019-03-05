package сl11.JavaFx;

import javafx.scene.canvas.GraphicsContext;

import java.util.List;
import java.util.Random;

public abstract class Abs implements Shape {
    protected static double DIAMETR;

    protected GraphicsContext gc;
    protected double x;
    protected double y;
    protected List<Shape> shapes;

    private double xSpeed;
    private double ySpeed;

    public Abs(GraphicsContext gc, double x, double y, List<Shape> shapes) {
        this.gc = gc;
        this.x = x;
        this.y = y;
        this.shapes = shapes;

        Random random = new Random();
        xSpeed = 2 + random.nextInt(5);
        ySpeed = 2 + random.nextInt(5);
    }

    @Override
    public void move() {
        x += xSpeed;
        y += ySpeed;

        if (x + DIAMETR > gc.getCanvas().getWidth()) {
            xSpeed = -xSpeed;
        }

        if (y + DIAMETR > gc.getCanvas().getHeight()) {
            ySpeed = -ySpeed;
        }

        if (x < 0) {
            xSpeed = -xSpeed;
        }

        if (y < 0) {
            ySpeed = -ySpeed;
        }

        Check();
    }

    private void Check() {
        for (int i = 0; i < shapes.size(); i++) {
            Abs abs = (Abs) shapes.get(i);

            double x1 = x + DIAMETR / 2;
            double y1 = y + DIAMETR / 2;
            double x2 = abs.x + abs.DIAMETR / 2;
            double y2 = abs.y + abs.DIAMETR / 2;

            double distanceBetweenFigures = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

            if (distanceBetweenFigures < ((DIAMETR + abs.DIAMETR) / 2)) {
                xSpeed = -xSpeed;
                ySpeed = -ySpeed;
                abs.xSpeed = -abs.xSpeed;
                abs.ySpeed = -abs.ySpeed;
            }
        }
    }

    @Override
    public abstract void draw();
}
