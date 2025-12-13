package lab17;

import java.io.*;
import java.util.Scanner;

public class KolcevSpis {
    private DvusvSpisk tail;

    public KolcevSpis() {
        tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void clear() {
        tail = null;
        System.out.println("Список очищен.");
    }

    public void add(DvusvSpisk newNode) {
        if (isEmpty()) {
            tail = newNode;
            tail.setNext(tail);
        } else {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
        System.out.println("Элемент добавлен.");
    }

    public void remove(String name) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        DvusvSpisk current = tail.getNext(); // head
        DvusvSpisk prev = tail;

        do {
            if (current.getName().equalsIgnoreCase(name)) {
                if (current == current.getNext()) { // единственный элемент
                    tail = null;
                } else {
                    prev.setNext(current.getNext());
                    if (current == tail) { // если удаляем tail
                        tail = prev;
                    }
                }
                System.out.println("Элемент удален.");
                return;
            }
            prev = current;
            current = current.getNext();
        } while (current != tail.getNext());

        System.out.println("Элемент не найден.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        DvusvSpisk current = tail.getNext();
        do {
            current.display();
            current = current.getNext();
        } while (current != tail.getNext());
    }

    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            if (!isEmpty()) {
                DvusvSpisk current = tail.getNext();
                do {
                    writer.println(current.getName() + ";" + current.getAge());
                    current = current.getNext();
                } while (current != tail.getNext());
            }
            System.out.println("Данные сохранены в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    add(new DvusvSpisk(name, age));
                }
            }
            System.out.println("Данные загружены из файла.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
