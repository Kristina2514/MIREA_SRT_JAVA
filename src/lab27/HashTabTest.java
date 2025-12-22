package lab27;

import java.util.Scanner;

public class HashTabTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashTab hashtab = new HashTab();
        hashtab.hashtabInit(10);

        hashtab.hashtabAdd("key1", 100);
        hashtab.hashtabAdd("key2", 200);
        hashtab.hashtabAdd("key3", 300);
        hashtab.hashtabAdd("key4", 400);
        hashtab.hashtabAdd("key5", 500);
        hashtab.hashtabAdd("key6", 600);
        hashtab.hashtabAdd("key7", 700);
        hashtab.hashtabAdd("key8", 800);
        hashtab.hashtabAdd("key9", 900);
        hashtab.hashtabAdd("key10", 1000);
        hashtab.hashtabAdd("key11", 1100);

        while (true) {
            System.out.println("1. Найти элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите номер элемента: ");
                    String number = scanner.nextLine();
                    String key = "key" + number;
                    System.out.println(key + ": " + hashtab.hashtabLookup(key));
                    break;
                case 2:
                    System.out.println("Введите номер элемента: ");
                    String number_1 = scanner.nextLine();
                    String key_1 = "key" + number_1;
                    hashtab.hashtabDelete(key_1);
                    break;
                case 3:
                    System.out.println("Выход из программы");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
}
