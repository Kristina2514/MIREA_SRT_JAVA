package lab9;

import java.util.Comparator;
import java.util.List;

public class SortStudent implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return Double.compare(s2.getGpa(), s1.getGpa()); //сравнение в порядке убывания, 1 больше - отриц
    }

    //т
    public void quickSort(List<Student2> students) {
        if (students == null || students.size() <= 1) {
            return;
        }
        quickSort(students, 0, students.size()-1);
    }

    private void quickSort(List<Student2> students, int low, int high) {
        if (low < high) { // проверка базового случая, если >= условие останавливает рекурсию
            int ind = partition(students, low, high); // опорная переменная
            quickSort(students, low, ind -1);
            quickSort(students, ind + 1, high);
        }
    }

    private int partition(List<Student2> students, int low, int high) {
        Student2 ind = students.get(high);
        int i = low - 1; // индекс элементов которые больше опорного
        for (int j = low; j < high; j++) {
            if (compare(students.get(j), ind) <= 0) { // проверка больше или равен опорному
                i++; // для больших увеличиваем индекс
                swap(students, i, j); // и ставим больший элемент влево
            }
        }

        swap(students, i + 1, high); // ставим опорный элемент на правильное место
        return i + 1; // возвращаем индекс опорного
    }
    // Метод для обмена элементов
    private void swap(List<Student2> students, int i, int j) {
        Student2 temp = students.get(i);
        students.set(i, students.get(j)); // копируем значение из второго элемента в первый
        students.set(j, temp); // и первый элемент вставляем во второй
    }
}

