package lab18;

import java.util.Scanner;

public class excep4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("ERROR!");
        }
        finally {
            exceptionDemo();
        }
    }

    public static void main(String[] args) {
        excep4 obj = new excep4();
        obj.exceptionDemo();
    }
}
