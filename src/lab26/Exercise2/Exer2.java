package lab26.Exercise2;

import java.util.Iterator;

public class Exer2 {
    public static void main(String[] args) {
        List<String> list = new Array<>();

        list.add("Первый");
        list.add("Второй");
        list.add("Третий");

        System.out.println("Элементы списка:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nЧерез for-each:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
