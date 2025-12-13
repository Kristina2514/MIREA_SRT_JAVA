package lab20;

public class TestGeneric1 {
    public static void main(String[] args) {
        Generic1<String, Integer, Double> triple1 =
                new Generic1<>("Hello", 123, 45.67);

        System.out.println("Значения:");
        System.out.println("first: " + triple1.getFirst());
        System.out.println("second: " + triple1.getSecond());
        System.out.println("third: " + triple1.getThird());

        System.out.println("\nИмена классов:");
        triple1.printClassNames();
        System.out.println("\n" + triple1);

        Generic1<Integer, String, Boolean> triple2 =
                new Generic1<>(999, "World", true);

        System.out.println(triple2);
        triple2.printClassNames();

        class Person {
            String name;
            Person(String name) { this.name = name; }
            @Override public String toString() { return name; }
        }

        class Car {
            String model;
            Car(String model) { this.model = model; }
            @Override public String toString() { return model; }
        }

        Generic1<Person, Car, Integer> triple3 =
                new Generic1<>(new Person("Иван"), new Car("Toyota"), 2023);

        System.out.println(triple3);
    }
}
