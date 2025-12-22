package lab08;

public class SumDig {
    public static int CNumb(int k, int s) {
        if (k <= 0 || s < 0) return 0;
        if (k==1) return (s >= 0 && s <= 9) ? 1 : 0;

        return RecursiveCounter(k, s, 0, true);
    }

    private static int RecursiveCounter(int k, int s, int leng, boolean isFirst) {
        // Базовый случай - если выбраны все цифры
        if (leng == k) {
            return (s==0) ? 1 : 0;
        }

        //Сумма стала отрицательной, возвращаем 0
        if (s<0) return 0;

        int c = 0;
        for (int dig = 0; dig <= 9; dig++) {
            if (isFirst && dig == 0) continue;
            c += RecursiveCounter(k, s-dig, leng + 1, false);
        }
        return c;

    }

    public static void main(String[] args) {
        int a=3, b=5;
        int res = CNumb(a, b);
        System.out.println(a + "-значные числа с суммой цифр " + b + ": " + res);
    }

}
