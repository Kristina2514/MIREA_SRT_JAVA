package lab4.lab4_1;

// Класс Person
class Person {
    // Поля
    private String fullName;
    private int age;

    // Конструкторы
    public Person() {
        this.fullName = "Неизвестно";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Методы
    public void move() {
        System.out.println(fullName + " двигается");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    // Геттеры и сеттеры
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
