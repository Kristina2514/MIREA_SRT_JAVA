package lab17;

import java.io.*;

public class EmployeeList {
    private Employee head;
    private int size;

    public EmployeeList() {
        head = null;
        size = 0;
    }

    public void addEmployee(Employee emp) {
        if (head == null) {
            head = emp;
        } else {
            Employee current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(emp);
        }
        size++;
        System.out.println("Сотрудник добавлен");
    }

    public boolean delEmployee(String name) {
        if (head == null) {
            return false;
        }

        if (head.getName().equalsIgnoreCase(name)) {
            head = head.getNext();
            size--;
            System.out.println("Сотрудник " + name + " удален");
            return true;
        }

        Employee current = head;
        while (current.getNext() != null) {
            if (current.getNext().getName().equalsIgnoreCase(name)) {
                current.setNext(current.getNext().getNext());
                size--;
                System.out.println("Сотрудник " + name + " удален");
                return true;
            }
            current = current.getNext();
        }

        System.out.println("Сотрудник " + name + " не найден");
        return false;
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }

        Employee current = head;
        int count = 1;
        while (current != null) {
            System.out.println("Cотрудник " + count + ": ");
            current.display();
            current = current.getNext();
            count++;
        }
    }

    public void clear() {
        head = null;
        size = 0;
        System.out.println("Картотека очищена");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void savetoFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            Employee current = head;
            while (current != null) {
                writer.println(current.getName() + "," +
                        current.getAge() + "," +
                        current.getPosition() + "," +
                        current.getSalary());
                current = current.getNext();
            }
            System.out.println("Данные сохранены в файл: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
    }

    public void loadFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String name = data[0];
                    int age = Integer.parseInt(data[1]);
                    String position = data[2];
                    double salary = Double.parseDouble(data[3]);

                    Employee emp = new Employee(name, age, position, salary);
                    addEmployee(emp);
                }
            }
            System.out.println("Данные загружены из файла: " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }
    }

    public int getSize() {
        return size;
    }
}
