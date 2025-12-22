package lab24.Task2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Magic");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on magic chair");
    }
}
