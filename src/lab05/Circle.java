package lab05;

import java.awt.*;

public class Circle extends Shape {
    private final int r;

    public Circle(Color color, int x, int y, int r) {
        super(color, x, y);
        this.r = r;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x-r, y-r, r*2, r*2);

    }
}
