import javax.swing.*;
import java.awt.*;

public class primer1 extends Canvas {
    public static void main(String[] args){
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new primer1();
        canvas.setSize(450,300);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(50, 150, 150, 150);
        g.drawRect(75, 200, 50, 50);
        g.drawLine(25, 300, 450, 300);
        g.drawLine(25, 175, 125, 75);
        g.drawLine(125, 75, 225, 175);
        g.drawLine(150, 100, 150, 75);
        g.drawLine(150, 75, 175, 75);
        g.drawLine(175, 75, 175, 125);
        g.drawLine(340, 300, 340, 250);
        g.drawLine(360, 300, 360, 250);
        g.drawArc(275, 50, 150, 200, 278, 345);
    }
}

