package сl11.JavaFx;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public abstract class Abs implements Shape{
    protected static double DIAMETR;

    protected GraphicsContext gc;
    protected double x;
    protected double y;

    private double xSpeed;
    private double ySpeed;

    public Abs(GraphicsContext gc, double x, double y) {
        this.gc = gc;
        this.x = x;
        this.y = y;

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


    }

    @Override
    public abstract void draw();
}
