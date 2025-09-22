package lab2;

public class TestBall {
    public static void main(String[] args) {
        System.out.println("            Тестирование класса Ball           ");

        System.out.println("Создаем мяч с координатами (5.0, 3.0):");
        Ball ball2 = new Ball(5.0, 3.0);
        System.out.println("Мяч 2: " + ball2);

        System.out.println("Тестируем геттеры:");
        System.out.println("Коорд X мяча 2: " + ball2.getX());
        System.out.println("Коорд Y мяча 2: " + ball2.getY());

        System.out.println("Тестируем сеттеры:");
        ball2.setX(10.0);
        ball2.setY(7.5);
        System.out.println("Измененные коорд: " + ball2);

        System.out.println("Тестируем setXY:");
        ball2.setXY(15.0, 12.0);
        System.out.println("Одновременно измененные коорд: " + ball2);

        System.out.println("Тестируем движение мяча:");
        System.out.println("Начальная позиция: " + ball2);
        ball2.move(3.0, 2.0);
        System.out.println("Мяч теперь в позиции " + ball2);
    }
}