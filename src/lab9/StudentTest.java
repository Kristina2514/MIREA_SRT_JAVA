package lab9;


public class StudentTest {
    public static void SortVst(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int pred = i - 1;

            while (pred >= 0 && arr[pred].getId() > key.getId()) {
                arr[pred + 1] = arr[pred];
                pred--;
            }
            arr[pred + 1] = key;
        }
    }

    public static void prtArr(Student[] arr) {
        for (Student student : arr) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void  main(String[] args) {
        Student[] students = {new Student("Иван", 3),
                new Student("Мария", 1),
                new Student("Кирилл", 4),
                new Student("Катя", 2),
                new Student("Миша", 5)
        };

        System.out.println("Список студентов до сортировки: ");
        prtArr(students);
        SortVst(students);
        System.out.println("Список студентов после сортировки: ");
        prtArr(students);
    }

}
