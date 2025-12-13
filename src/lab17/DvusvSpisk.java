package lab17;

import java.util.Scanner;

public class DvusvSpisk {
    private String name;
    private int age;
    private DvusvSpisk next;
    private DvusvSpisk prev;

    public DvusvSpisk() {
        this.name = name;
        this.age = age;
        this.next = null;
        this.prev = null;
    }

    public DvusvSpisk(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
        this.prev = null;
    }

    //ввод данных
    public void readfromCons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
    }

    //вывод данных
    public void display() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public DvusvSpisk getNext() { return next; }

    public void setNext(DvusvSpisk next) { this.next = next; }

    public DvusvSpisk getPrev() { return prev; }

    public void setPrev(DvusvSpisk prev) { this.prev = prev; }
}
