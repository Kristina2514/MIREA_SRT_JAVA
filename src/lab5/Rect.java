package lab5;

import javax.swing.*;
import java.awt.*;

public class Rect extends Shape {
    private final int width;
    private final int height;

    public Rect(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
