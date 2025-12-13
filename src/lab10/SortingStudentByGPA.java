package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingStudentByGPA implements Comparator<Student> {
    private List<Student> iDNumber;

    public SortingStudentByGPA() {
        this.iDNumber = new ArrayList<>();
    }
//принимает на вход уже готовый список и создает новый на основе переданного
    public void setArray(List<Student> students) {
        this.iDNumber = new ArrayList<>(students);
    }
//принимает массив Студент и создает обертку списка
    public void setArray(Student[] students) {
        this.iDNumber = new ArrayList<>(Arrays.asList(students));
    }

    public void addStudent(Student student) {
        iDNumber.add(student);
    }

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA());
    }

    public void quicksort() {
        if (iDNumber.size() <= 1) return;
        quicksort(0, iDNumber.size()-1);
    }

    private void quicksort(int low, int high) {
        if (low < high) {
            int ind = pertition(low, high);
            quicksort(low, ind -1);
            quicksort(ind + 1, high);
        }
    }

    private int pertition(int low, int high) {
        Student ind = iDNumber.get(high); // опорный элемент
        int i = low - 1;
        for (int j = low; j < high; j ++) {
            if (compare(iDNumber.get(j), ind) <= 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i+1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Student c = iDNumber.get(i);
        iDNumber.set(i, iDNumber.get(j));
        iDNumber.set(j, c);
    }

    public void mergeSort() {
        if (iDNumber.size() <= 1) return;
        iDNumber = mergeSort(iDNumber);
    }

    private List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) return list; //базовый случай

        int mid = list.size() / 2;
        List<Student> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
        List<Student> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));
        //объединение двух отсортированных половин
        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0; //индексы для левого и правого

        while (i < left.size() && j < right.size()) {
            if (compare(left.get(i), right.get(j)) <= 0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    public void sortByName() {
        iDNumber.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(iDNumber);
    }
}

