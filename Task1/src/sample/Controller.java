package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import model.Draw;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {



    public Canvas canvas;
    public GraphicsContext gc ;
    public Button btn1;
    public Rectangle wh;
    public Rectangle gr;
    public Rectangle bl;
    public Rectangle red;
    public ColorPicker color;
    public Circle pol;
    public Circle pol1;
    public Circle pol2;
    public Circle pol3;
    public Circle pol4;
    public Circle pol5;
    public Circle pol6;
    public Circle pol7;
    public Rectangle rect;



    public void btn1(ActionEvent actionEvent) {
        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.setLineWidth(4);
        gc.strokeRoundRect(193, 45, 127, 245, 1, 1);
        gc.strokeOval(204, 53, 50, 50);
        gc.strokeOval(204, 108, 50, 50);
        gc.strokeOval(204, 169, 50, 50);
        gc.strokeOval(204, 230, 50, 50);
        gc.strokeOval(262, 53, 50, 50);
        gc.strokeOval(262, 108, 50, 50);
        gc.strokeOval(262, 169, 50, 50);
        gc.strokeOval(262, 230, 50, 50);



    }

    public void Col1(MouseEvent mouseEvent) {color.setValue((Color) wh.getFill());

    }

    public void Col2(MouseEvent mouseEvent) {color.setValue((Color) gr.getFill());
    }

    public void Col3(MouseEvent mouseEvent) {color.setValue((Color) bl.getFill());
    }

    public void Col4(MouseEvent mouseEvent) {color.setValue((Color) red.getFill());
    }

    public void rect(MouseEvent mouseEvent) {
        rect.setOpacity(1);
        rect.setFill((Color)color.getValue());
        pol.setOpacity(1);
        pol1.setOpacity(1);
        pol2.setOpacity(1);
        pol3.setOpacity(1);
        pol4.setOpacity(1);
        pol5.setOpacity(1);
        pol6.setOpacity(1);
        pol7.setOpacity(1);

    }

    public void pol(MouseEvent mouseEvent) {
        pol.setOpacity(1);
        pol.setFill((Color)color.getValue());
    }
    public void pol1(MouseEvent mouseEvent) {
        pol1.setOpacity(1);
        pol1.setFill((Color)color.getValue());
    }
    public void pol2(MouseEvent mouseEvent) {
        pol2.setOpacity(1);
        pol2.setFill((Color)color.getValue());
    }
    public void pol3(MouseEvent mouseEvent) {
        pol3.setOpacity(1);
        pol3.setFill((Color)color.getValue());
    }
    public void pol4(MouseEvent mouseEvent) {
        pol4.setOpacity(1);
        pol4.setFill((Color)color.getValue());
    }
    public void pol5(MouseEvent mouseEvent) {
        pol5.setOpacity(1);
        pol5.setFill((Color)color.getValue());
    }
    public void pol6(MouseEvent mouseEvent) {
        pol6.setOpacity(1);
        pol6.setFill((Color)color.getValue());
    }
    public void pol7(MouseEvent mouseEvent) {
        pol7.setOpacity(1);
        pol7.setFill((Color)color.getValue());
    }


}
