package сl11.JavaFx;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private GraphicsContext gc;

    private List<Shape> shapes = new ArrayList<>();

    public Board(GraphicsContext gc) {
        this.gc = gc;
        shapes.add(new Ball(gc, 10, 20, shapes));
        shapes.add(new Ball(gc, 104, 240, shapes));
        shapes.add(new Ball(gc, 4, 250, shapes));
        shapes.add(new Square(gc, 25, 300, shapes));
        shapes.add(new Square(gc, 295, 303, shapes));
        shapes.add(new Figure(gc, 4,56, shapes));

    }

    public void move() {
        for (Shape shape : shapes) {
            shape.move();
        }
    }

    public void draw() {
        clean();
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    private void clean() {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }

}
