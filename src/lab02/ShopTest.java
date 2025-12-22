package lab02;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите максимальное количество компьютеров в магазине: ");
        int maxSize = scanner.nextInt();
        scanner.nextLine();

        Shop shop = new Shop(maxSize);

        System.out.println("    Магазин компьютеров (вместимость: " + maxSize + ")    ");

        boolean running = true;
        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Показать все компьютеры");
            System.out.println("5. Показать сколько есть/нет свободных мест");
            System.out.println("6. Выйти");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    shop.addComputer();
                    break;
                case 2:
                    shop.removeComputer();
                    break;
                case 3:
                    shop.findComputers();
                    break;
                case 4:
                    shop.listComputers();
                    break;
                case 5:
                    System.out.println("Компьютеров в магазине: " + shop.getComputerCount());
                    System.out.println("Свободных мест: " + (shop.getCapacity() - shop.getComputerCount()));
                    break;
                case 6:
                    running = false;
                    System.out.println("Готово.");
                    break;
                default:
                    System.out.println("Такого варианта нет");
            }
        }

        scanner.close();
        shop.closeScanner();
    }
}