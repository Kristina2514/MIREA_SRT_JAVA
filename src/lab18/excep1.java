package lab18;

public class excep1 {
    public void exceptionDemo() {
        try {
            System.out.println( 2.0 / 0.0 );
        }
        catch (ArithmeticException e ) {
            System.out.println("Деление на ноль!");
        }

    }

    public static void main(String[] args) {
        excep1 obj = new excep1();
        obj.exceptionDemo();
    }

}
