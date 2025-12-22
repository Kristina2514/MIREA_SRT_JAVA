package lab09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("Ivan", 3.8));
        students.add(new Student2("Maria", 4.5));
        students.add(new Student2("Petr", 3.2));

        System.out.println("Список до сортировки: ");
        for (Student2 student : students) {
            System.out.println(student);
        }

        SortStudent sorter = new SortStudent();
        sorter.quickSort(students);

        System.out.println("После сортировки: ");
        for (Student2 student : students) {
            System.out.println(student);
        }


    }
}
