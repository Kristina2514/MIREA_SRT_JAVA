package lab17;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeList employeeList = new EmployeeList();

        while (true) {
            displayMenu();
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    // Добавление сотрудника
                    Employee newEmployee = new Employee("", 0, "", 0);
                    newEmployee.readConsole();
                    employeeList.addEmployee(newEmployee);
                    break;

                case 2:
                    // Удаление сотрудника
                    System.out.print("Введите имя сотрудника для удаления: ");
                    String nameToRemove = scanner.nextLine();
                    employeeList.delEmployee(nameToRemove);
                    break;

                case 3:
                    // Просмотр всех сотрудников
                    employeeList.displayAll();
                    break;

                case 4:
                    // Очистка картотеки
                    employeeList.clear();
                    break;

                case 5:
                    // Проверка на пустоту
                    if (employeeList.isEmpty()) {
                        System.out.println("Картотека пуста.");
                    } else {
                        System.out.println("В картотеке есть сотрудники.");
                    }
                    break;

                case 6:
                    // Сохранение в файл
                    System.out.print("Введите имя файла для сохранения: ");
                    String saveFilename = scanner.nextLine();
                    employeeList.savetoFile(saveFilename);
                    break;

                case 7:
                    // Загрузка из файла
                    System.out.print("Введите имя файла для загрузки: ");
                    String loadFilename = scanner.nextLine();
                    employeeList.loadFile(loadFilename);
                    break;

                case 8:
                    // Количество сотрудников
                    System.out.println("Количество сотрудников в картотеке: " + employeeList.getSize());
                    break;

                case 0:
                    // Выход
                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }

            System.out.println("\nНажмите Enter для продолжения...");
            scanner.nextLine();
        }
    }

    private static void displayMenu() {

        System.out.println("1. Добавить сотрудника");
        System.out.println("2. Удалить сотрудника");
        System.out.println("3. Просмотреть всех сотрудников");
        System.out.println("4. Очистить картотеку");
        System.out.println("5. Проверить пустоту картотеки");
        System.out.println("6. Сохранить в файл");
        System.out.println("7. Загрузить из файла");
        System.out.println("8. Количество сотрудников");
        System.out.println("0. Выход");
    }
}
