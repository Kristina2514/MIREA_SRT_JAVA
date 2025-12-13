package lab11;

import java.util.Calendar;
import java.util.Date;

public class StudentTest {
    public static void main(String[] args) {
        // Создаем студента с датой рождения
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.MAY, 15);
        Date birthDate = cal.getTime();

        Student student = new Student("Иван", 20, birthDate);

        System.out.println("Информация о студенте:");
        System.out.println(student);

        System.out.println("\nДата рождения в разных форматах:");
        System.out.println("Короткий: " + student.getFormattedBirthDate("short"));
        System.out.println("Средний: " + student.getFormattedBirthDate("medium"));
        System.out.println("Полный: " + student.getFormattedBirthDate("full"));
    }
}