package lab11;

import java.util.*;
import java.text.SimpleDateFormat;

class Student {
    private String name;
    private int age;
    private Date birthDate; // Добавляем поле даты рождения

    public Student(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    // Метод для форматированного вывода даты рождения
    public String getFormattedBirthDate(String formatType) {
        SimpleDateFormat dateFormat = switch (formatType.toLowerCase()) {
            case "short" -> new SimpleDateFormat("dd.MM.yy");
            case "medium" -> new SimpleDateFormat("dd MMM yyyy");
            case "full" -> new SimpleDateFormat("dd MMMM yyyy 'г.' EEEE");
            default -> new SimpleDateFormat("dd.MM.yyyy");
        };

        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return String.format("%s %d %s",
                name, age, dateFormat.format(birthDate));
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
}
