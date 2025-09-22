package lab2;

import java.util.Scanner;

public class Shop {
    private Computer[] computers;
    private int c;
    private Scanner scanner;

    public Shop(int maxSize) {
        computers = new Computer[maxSize];
        c = 0;
        scanner = new Scanner(System.in);
    }

    public void addComputer() {
        if (c >= computers.length) {
            System.out.println("Нельзя добавить больше компьютеров.");
            return;
        }

        System.out.println("     Добавление нового компьютера    ");

        System.out.print("Введите производителя: ");
        String brand = scanner.nextLine();

        System.out.print("Введите цену: ");
        double price = scanner.nextDouble();

        System.out.print("Введите объем хранилища (GB): ");
        int storage = scanner.nextInt();

        scanner.nextLine();

        // Создаем и добавляем компьютер
        Computer computer = new Computer(brand, price, storage);
        computers[c] = computer;
        c++;

        System.out.println("Компьютер успешно добавлен!");
    }

    public void removeComputer() {
        if (c == 0) {
            System.out.println("Магазин и так пуст");
            return;
        }

        listComputers();
        System.out.print("Введите номер компьютера для удаления: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();  // Очистка буфера

        if (index < 0 || index >= c) {
            System.out.println("Такого компьютера нет");
            return;
        }

        for (int i = index; i < c - 1; i++) {
            computers[i] = computers[i + 1];
        }

        computers[c - 1] = null;
        c--;
        System.out.println("Компьютер удален!");
    }

    public void findComputers() {
        if (c == 0) {
            System.out.println("Магазин пуст");
            return;
        }

        System.out.println("     Поиск компьютеров    ");
        System.out.println("Введите критерии поиска:");

        System.out.print("Производитель: ");
        String brand = scanner.nextLine();

        Integer maxPrice = null;
        Integer minStorage = null;

        System.out.print("Максимальная цена: ");
        String priceInput = scanner.nextLine();
        if (!priceInput.isEmpty()) {
            maxPrice = Integer.parseInt(priceInput);
        }

        System.out.print("Минимальный объем хранилища: ");
        String storageInput = scanner.nextLine();
        if (!storageInput.isEmpty()) {
            minStorage = Integer.parseInt(storageInput);
        }

        // Поиск подходящих компьютеров
        boolean found = false;
        System.out.println("Результаты поиска:");

        for (int i = 0; i < c; i++) {
            Computer computer = computers[i];
            if (computer.matches(brand, maxPrice, minStorage)) {
                System.out.println((i + 1) + ". " + computer);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Компьютеры по заданным критериям не найдены.");
        }
    }

    public void listComputers() {
        if (c == 0) {
            System.out.println("Магазин пуст");
            return;
        }

        System.out.println("     Список компьютеров в магазине     ");
        for (int i = 0; i < c; i++) {
            System.out.println((i + 1) + ". " + computers[i]);
        }
    }

    public void closeScanner() {
        scanner.close();
    }

    public int getComputerCount() {
        return c;
    }

    public int getCapacity() {
        return computers.length;
    }

}