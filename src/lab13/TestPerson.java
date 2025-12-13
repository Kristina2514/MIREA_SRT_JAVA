package lab13;

public class TestPerson {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Иванов", "Иван", "Иванович"),
                new Person("Викторов", "Виктор", null),
                new Person("Ковалев", null, null),
                new Person(null, null, null),
                new Person(null, "Игорь", "Валерьевич")};
        for (Person person : persons) {
            System.out.println(person.getFullName());
        }

        Person testPerson = new Person("Родкина", "Кристина", "Максимовна");
        int iter = 1000;
        long strTime = System.nanoTime();
        for (int i = 0; i < iter; i++) {
            testPerson.getFullName();
        }
        long endTime = System.nanoTime();
        System.out.printf("Время выполнения программы с %d итерациями: %.2f мс%n", iter, (endTime - strTime) / 1000000.0);

    }
}