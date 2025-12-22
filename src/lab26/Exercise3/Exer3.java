package lab26.Exercise3;

import java.util.Iterator;

public class Exer3 {
    public static void main(String[] args) {
        Array<String> list = new Array<>();

        list.add("Собака");
        list.add("Кошка");
        list.add("Попугай");
        list.add("Хомяк");
        System.out.println("Питомцы:");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String pets = iterator.next();
            System.out.println("- " + pets);
        }

        System.out.println("\nПодсчет элементов:");
        iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        System.out.println("Всего элементов: " + count);
    }
}
