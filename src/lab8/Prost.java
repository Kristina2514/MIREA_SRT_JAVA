package lab8;

public class Prost {
    public static boolean isProst(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n%2 == 0) return false;
        return isProstRec(n, 3);
    }

    private static boolean isProstRec(int n, int del) {
        if (del*del > n) {
            return true;
        }
        if (n%del == 0) {
            return false;
        }
        return isProstRec(n, del+2);
    }

    public static void main(String[] args) {
        int a = 17;
        boolean res = isProst(a);
        System.out.println(a + " - " + (res ? "Простое" : "Составное"));
    }
}
