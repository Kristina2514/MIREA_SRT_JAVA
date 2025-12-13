package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student[] lst1 = {
                new Student("Дмитрий", "Петров", "Информатика", 4, "КВБО-12", 4.8),
                new Student("Иван", "Николаев", "Физика", 2, "КРБО-15", 3.9),
                new Student("Катя", "Иванова", "Математика", 1, "КТСО-21", 4.5)};

        Student[] lst2 = {
                new Student("Михаил", "Симолов", "Информатика", 3, "КВБО-16", 4.1),
                new Student("Иван", "Васильев", "Физика", 5, "КРБО-51", 4.9),
                new Student("Ольга", "Львова", "Химия", 1, "КТСО-11", 4.3)
        };

        SortingStudentByGPA sorter = new SortingStudentByGPA();

        System.out.println("Список 1: ");
        sorter.setArray(lst1);
        sorter.outArray();

        System.out.println("Список 2: ");
        sorter.setArray(lst2);
        sorter.outArray();

        System.out.println("Объединение списков: ");
        List<Student> combinedList = new ArrayList<>();
        combinedList.addAll(Arrays.asList(lst1));
        combinedList.addAll(Arrays.asList(lst2));

        sorter.setArray(combinedList);
        sorter.outArray();

        System.out.println("Быстрая сортировка: ");
        sorter.quicksort();
        sorter.outArray();

        System.out.println("Сортировка слиянием: ");
        sorter.setArray(combinedList);
        sorter.mergeSort();
        sorter.outArray();

        System.out.println("Сортировка по имени: ");
        sorter.setArray(combinedList);
        sorter.sortByName();
        sorter.outArray();
    }
}

