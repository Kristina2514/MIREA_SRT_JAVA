package lab21;

import java.util.*;

public class SimpleConverter {
    public static <T> List<T> arrayToList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (T item : arr) {
            list.add(item);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana"};
        List<String> fruitList = arrayToList(fruits);
        System.out.println("Фрукты: " + fruitList);

        Integer[] numbers = {1, 2, 3};
        List<Integer> numberList = arrayToList(numbers);
        System.out.println("Числа: " + numberList);

        System.out.println("\nДемонстрация стирания типов:");
        System.out.println("fruitList класс: " + fruitList.getClass());
        System.out.println("numberList класс: " + numberList.getClass());
        System.out.println("Одинаковые? " +
                (fruitList.getClass() == numberList.getClass()));
    }
}