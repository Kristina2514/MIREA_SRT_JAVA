package lab4.lab4_1;

// Демонстрация класса Person
class Person_Test {
    public static void main(String[] args) {
        // Создание объектов разными конструкторами
        Person person1 = new Person(); // Конструктор по умолчанию
        Person person2 = new Person("Иван Иванов", 20); // Конструктор с параметрами

        // Вызов методов
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}