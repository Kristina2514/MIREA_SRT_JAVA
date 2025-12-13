package lab20;

public class TestGeneric3 {
    public static void main(String[] args) {
        Generic3<String, Dog, Integer> example1 =
                new Generic3<>(
                        "Hello",    // String implements Comparable
                        new Dog("Шарик"), // Dog extends Animal
                        100         // Integer
                );

        example1.printInfo();
        example1.compareWith("World");

        Generic3<Double, Animal, String> example3 =
                new Generic3<>(
                        99.9,       // Double implements Comparable
                        new Animal("Кот"),
                        "Текст"    // String
                );

        example3.printInfo();
        example3.compareWith(50.0);
    }
}
