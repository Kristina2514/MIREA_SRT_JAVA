package lab24.Task2;

public class FunctialChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on functial chair");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
