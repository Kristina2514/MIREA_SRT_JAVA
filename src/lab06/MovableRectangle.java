package lab06;

public class MovableRectangle implements Movable {
    private MovablePoint pointl;
    private MovablePoint pointr;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        this.pointl = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.pointr = new MovablePoint(x2, y2, xSpeed, ySpeed);

        if (!NotSameSpeed()) {
            System.out.println("Точки с разной скоростью");
        }

    }

    public boolean NotSameSpeed() {
        return pointl.getXSpeed() == pointr.getXSpeed() && pointr.getYSpeed() == pointl.getYSpeed();
    }

    @Override
    public void moveUp() {
        pointl.moveUp();
        pointr.moveUp();
    }

    @Override
    public void moveDown() {
        pointl.moveDown();
        pointr.moveDown();
    }

    @Override
    public void moveLeft() {
        pointl.moveLeft();
        pointr.moveLeft();
    }

    @Override
    public void moveRight() {
        pointl.moveRight();
        pointr.moveRight();
    }

    @Override
    public String toString() {
        return "Верхняя левая точка - " + pointl +
                ", Нижняя правая точка - " + pointr;
    }

    public MovablePoint getLeft() {
        return pointl;
    }

    public MovablePoint getRight() {
        return pointr;
    }

    public void setLeft(MovablePoint pointl) {
        this.pointl = pointl;
        if (!NotSameSpeed()) {
            System.out.println("Cкорости точек различаются!");
        }
    }

    public void setRight(MovablePoint pointr) {
        this.pointr = pointr;
        if (!NotSameSpeed()) {
            System.out.println("Предупреждение: скорости точек различаются!");
        }
    }

    public void setSpeed(int xSpeed, int ySpeed) {
        pointl.setXSpeed(xSpeed);
        pointl.setYSpeed(ySpeed);
        pointr.setXSpeed(xSpeed);
        pointr.setYSpeed(ySpeed);
    }
}
