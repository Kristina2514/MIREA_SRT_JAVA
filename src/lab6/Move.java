package lab6;

public class Move {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 4, 3);
        System.out.println("Положение точки 1: " + point);

        point.moveDown();
        point.moveRight();
        System.out.println("Положение точки 2: " + point);

        MovableCircle circle = new MovableCircle(3, 3, 4, 4, 7);
        System.out.println("Положение круга 1: " + circle);

        circle.moveUp();
        circle.moveLeft();
        System.out.println("Положение круга 2: " + circle);

        // 2 задача
        System.out.println();
        System.out.println("Задача 2");
        MovableRectangle rect = new MovableRectangle(0, 10, 5, 0, 2, 3);
        System.out.println("Создан квадрат. " + rect);
        System.out.println("Одинаковая скорость: " + rect.NotSameSpeed());

        rect.moveUp();
        rect.moveRight();
        System.out.println("Положение квадрата после движения: " + rect);

    }
}
