//// практическая 1 номер 3
package lab1;

//public class lab1 {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
//        float s = (float) sum/arr.length;
//        System.out.println(sum);
//        System.out.println(s);
//    }
//}


////1.4
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        int i = 0;
//        int sm1 = 0;
//        do {
//            arr[i] = sc.nextInt();
//            sm1 += arr[i];
//            i++;
//        } while (i < 5);
//
//        int j = 0;
//        int sm2 = 0;
//        while (j < arr.length) {
//            sm2 += arr[j];
//            j++;
//        }
//
//        int mx = -1000000000;
//        int k = 0;
//        while (k < arr.length) {
//            if (arr[k] > mx) {
//                mx = arr[k];
//            }
//            k++;
//        }
//
//        int mn = 100000000;
//        int f = 0;
//        do {
//            if (arr[f] < mn) {
//                mn = arr[f];
//            }
//            f++;
//        } while (f < arr.length);
//    System.out.println(sm1);
//    System.out.println(sm2);
//    System.out.println(mx);
//    System.out.println(mn);
//    }
//}

////1.5 - ПЕРЕДЕЛАТЬ ! (с аргументами)

//public class lab1 {
//    public static void main(String[] args) {
//        for (int i=0; i < args.length; i++) {
//            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
//        }
//    }
//}

////1.6
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Вывод первых 10 чисел гармонического ряда");
//        for (int n = 1; n <= 10; n++) {
//            double num = (1.0) / n;
//            System.out.println(n + " число: " + num);
//        }
//    }
//}

////1.7
//import java.util.Scanner;
//
//public class Main {
//    public static long calc(int num) {
//        long fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        }
//        return fact;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ТЕСТИРОВАНИЕ МЕТОДА");
//        System.out.println("Ввести целое неотрицательное число:");
//        int number = sc.nextInt();
//        long factor = calc(number);
//        System.out.println(number + ": " + factor);
//    }
//}

