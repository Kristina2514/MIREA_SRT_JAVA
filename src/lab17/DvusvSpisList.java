package lab17;

import java.io.*;
import java.util.Scanner;

public class DvusvSpisList {
    private DvusvSpisk head;
    private DvusvSpisk tail;

    public DvusvSpisList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(DvusvSpisk newSpis) {
        if (isEmpty()) {
            head = newSpis;
            tail = newSpis;
        } else {
            tail.setNext(newSpis);
            newSpis.setPrev(tail);
            tail = newSpis;
        }
        System.out.println("Элемент добавлен.");
    }

    public void remove(String name) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        DvusvSpisk current = head;
        while (current != null) {
            if (current.getName().equalsIgnoreCase(name)) {
                if (current == head) {
                    head = head.getNext();
                    if (head != null) head.setPrev(null);
                } else if (current == tail) {
                    tail = tail.getPrev();
                    tail.setNext(null);
                } else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }
                System.out.println("Элемент удален.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Элемент не найден.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        DvusvSpisk current = head;
        while (current != null) {
            current.display();
            current = current.getNext();
        }
    }

    public void clear() {
        head = null;
        tail = null;
        System.out.println("Список очищен.");
    }

    public void savetoFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            DvusvSpisk curr = head;
            while (curr != null) {
                writer.println(curr.getName() + "," + curr.getAge());
                curr = curr.getNext();
            }
            System.out.println("Данные сохранены.");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла.");
        }
    }

    public void readfromFile(String filename) {
        clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    add(new DvusvSpisk(name, age));
                }
            }
            System.out.println("Данные выгружены из файла.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла.");
        }
    }
}
