package lab02;

public class Tester {
    private Circle[] circles;
    private int c;

    public Tester(int size) {
        circles = new Circle[size];
        c = 0;
    }
    //задаем размер массива
    public Tester() {
        this(10);
    }

    public void addCircle(Circle circle) {
        if (c < circles.length) {
            circles[c] = circle;
            c++;
        }
    }

    public void printAllCircles() {
        System.out.println(c + " шт окружностей ");
        for (int i = 0; i < c; i++) {
            System.out.println((i + 1) + ". " + circles[i]);
        }
    }

    public int getCount() {
        return c;
    }
    public int getCapacity() {
        return circles.length;
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        tester.addCircle(new Circle(new Point(2.0, 3.0), 5.0));
        tester.addCircle(new Circle(1.0, 1.0, 3.0));
        tester.addCircle(new Circle());

        tester.printAllCircles();
        System.out.println("Заполнено: " + tester.getCount() + " из " + tester.getCapacity());
    }
}