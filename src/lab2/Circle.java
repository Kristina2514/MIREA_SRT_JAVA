package lab2;

public class Circle {
    private Point center;
    private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        this.center = new Point(x, y);
        this.r = r;
    }

    public Circle() {
        this(new Point(0.0, 0.0), 1.0);
    }

    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return r;
    }
    public void setRadius(double radius) {
        if (radius > 0) {
            this.r = radius;
        } else {
            System.out.println("Радиус должен быть положительным");
        }
    }

    public String toString() {
        return "O=" + center + ", R=" + r;
    }
}