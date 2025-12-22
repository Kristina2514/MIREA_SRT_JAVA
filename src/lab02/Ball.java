package lab02;

public class Ball {
    private double x;
    private double y;
    //установка переданных значений
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //установка начальной позиции
    public Ball() {
        this(0.0, 0.0);
    }
    // геттер, возвращение х
    public double getX() {
        return x;
    }
    // сеттер, для присваиванию нового значения х
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xn, double yn) {
        this.x += xn;
        this.y += yn;
    }

    public String toString() {
        return "Мяч: (" + x + ", " + y + ")";
    }
}

