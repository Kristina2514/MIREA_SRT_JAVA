package lab17;

import java.util.Scanner;

public class Tester23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DvusvSpisList dll = new DvusvSpisList();
        KolcevSpis cll = new KolcevSpis();

        int choice;
        do {
            System.out.println("1. Работа с двусвязным списком");
            System.out.println("2. Работа с кольцевым списком");
            System.out.println("3. Выход");
            System.out.print("Выберите опцию: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> handleListMenu(scanner, dll, "Двусвязный список");
                case 2 -> handleListMenu(scanner, cll, "Кольцевой список");
                case 3 -> System.out.println("Выход");
                default -> System.out.println("Неверный выбор.");
            }
        } while (choice != 3);
        scanner.close();
    }

    public static void handleListMenu(Scanner scanner, Object list, String listName) {
        int choice;
        do {
            System.out.println("\n--- " + listName + " ---");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Вывести все элементы");
            System.out.println("4. Очистить список");
            System.out.println("5. Сохранить в файл");
            System.out.println("6. Загрузить из файла");
            System.out.println("7. Назад");
            System.out.print("Выберите опцию: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    DvusvSpisk newSpis = new DvusvSpisk();
                    newSpis.readfromCons();
                    if (list instanceof DvusvSpisList) {
                        ((DvusvSpisList) list).add(newSpis);
                    } else if (list instanceof KolcevSpis) {
                        ((KolcevSpis) list).add(newSpis);
                    }
                }
                case 2 -> {
                    System.out.print("Введите имя для удаления: ");
                    String name = scanner.nextLine();
                    if (list instanceof DvusvSpisList) {
                        ((DvusvSpisList) list).remove(name);
                    } else if (list instanceof KolcevSpis) {
                        ((KolcevSpis) list).remove(name);
                    }
                }
                case 3 -> {
                    if (list instanceof DvusvSpisList) {
                        ((DvusvSpisList) list).display();
                    } else if (list instanceof KolcevSpis) {
                        ((KolcevSpis) list).display();
                    }
                }
                case 4 -> {
                    if (list instanceof DvusvSpisList) {
                        ((DvusvSpisList) list).clear();
                    } else if (list instanceof KolcevSpis) {
                        ((KolcevSpis) list).clear();
                    }
                }
                case 5 -> {
                    System.out.print("Введите имя файла для сохранения: ");
                    String saveFile = scanner.nextLine();
                    if (list instanceof DvusvSpisList) {
                        ((DvusvSpisList) list).savetoFile(saveFile);
                    } else if (list instanceof KolcevSpis) {
                        ((KolcevSpis) list).saveToFile(saveFile);
                    }
                }
                case 6 -> {
                    System.out.print("Введите имя файла для загрузки: ");
                    String loadFile = scanner.nextLine();
                    if (list instanceof DvusvSpisList) {
                        ((DvusvSpisList) list).readfromFile(loadFile);
                    } else if (list instanceof KolcevSpis) {
                        ((KolcevSpis) list).loadFromFile(loadFile);
                    }
                }
                case 7 -> System.out.println("Возврат в главное меню...");
                default -> System.out.println("Неверный выбор.");
            }
        } while (choice != 7);
    }

}
