package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Draw {


    public void draw(GraphicsContext gc) {

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);

    }
}
