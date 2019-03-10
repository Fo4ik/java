package cl10;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class EasyGame extends Application {


    private static final int BOARD_WIDTH = 1000;
    private static final int BOARD_HEIGHT = 1000;

    private int x = 10;
    private int y = 10;
    private GraphicsContext gc;
    private int movex;
    private int movey;
    private Random random = new Random();
    private boolean alltrue = true;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Move");
        Canvas canvas = new Canvas();
        canvas.setWidth(BOARD_WIDTH);
        canvas.setHeight(BOARD_HEIGHT);
        BorderPane group = new BorderPane(canvas);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.show();
        gc = canvas.getGraphicsContext2D();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            if (event.getCode() == KeyCode.RIGHT) {
                    System.out.println("RIGHT");
                    if (x < gc.getCanvas().getWidth() - 30) {
                        x = x + 5;
                    }
                }
                if (event.getCode() == KeyCode.DOWN) {
                    System.out.println("Down");
                    if (y < gc.getCanvas().getHeight() - 30) {
                        y = y + 5;
                    }
                }
                if (event.getCode() == KeyCode.UP) {
                    System.out.println("Up");
                    if (y < gc.getCanvas().getHeight() + 30) {
                        y = y - 5;
                    }
                }

            }
        });

    }




    private void clear() {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }

    private void draw() {
        gc.setLineWidth(2);
        gc.setStroke(Color.BLACK);
        gc.strokeOval(x, y, 30, 30);
        gc.setFill(Color.RED);
        gc.fillOval(x, y, 30, 30);
    }
}




