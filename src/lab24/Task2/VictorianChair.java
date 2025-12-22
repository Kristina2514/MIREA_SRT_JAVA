package lab24.Task2;

public class VictorianChair implements Chair {
    private int age;
    public VictorianChair(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println(age);
    }
}
