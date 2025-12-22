package lab05;
import java.awt.*;


abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;

    }

    public abstract void draw(Graphics g);

    public Color getColor() { return color; }
    public int getX() { return x; }
    public int getY() { return y; }

}
