package lab17;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String position;
    private double salary;
    private Employee next; //ссылка на след элемент

    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.next = null;
    }

    public void readConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        this.name = scanner.nextLine();

        System.out.println("Введите возраст: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите должность: ");
        this.position = scanner.nextLine();

        System.out.println("Введите зарплату: ");
        this.salary = scanner.nextDouble();
        scanner.nextLine();
    }

    public void display() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + position);
        System.out.println("Зарплата: " + salary);
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public Employee getNext() { return next; }
    public void setNext(Employee next) { this.next = next; }
}
