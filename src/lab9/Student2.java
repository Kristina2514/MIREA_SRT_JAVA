package lab9;

import java.util.Comparator;
import java.util.List;

public class Student2 {
    private String name;
    private double gpa;

    public Student2(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return String.format("Студент: Имя '%s', GPA %.2f}", name, gpa);
    }
}
