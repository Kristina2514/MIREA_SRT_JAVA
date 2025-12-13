package lab8;

public class sumDigN {
    public static int sumDigNch(int n) {
        if (n < 10) {
            return n;
        }
        return (n%10) + sumDigNch(n / 10);
    }

    public static void main(String[] args) {
        int a = 342;
        int sum = sumDigNch(a);
        System.out.println("Сумма цифр числа " + a + " = " + sum);
    }
}
