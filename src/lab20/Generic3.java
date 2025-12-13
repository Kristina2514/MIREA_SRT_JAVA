package lab20;

import java.io.Serializable;

public class Generic3<
    T extends Comparable<T>,
    V extends Animal & Serializable,
    K> {

        private T comparableValue;
        private V animalValue;
        private K anyValue;

    public Generic3(T first, V second, K third) {
            this.comparableValue = first;
            this.animalValue = second;
            this.anyValue = third;
        }

        public T getComparable() {
            return comparableValue;
        }

        public V getAnimal() {
            return animalValue;
        }

        public K getAny() {
            return anyValue;
        }

        public void compareWith(T other) {
            int result = comparableValue.compareTo(other);
            System.out.println("Сравнение: " + comparableValue + " с " + other + " = " + result);
        }

        public void printInfo() {
            System.out.println("T (Comparable): " + comparableValue);
            System.out.println("V (Animal): " + animalValue.getName());
            System.out.println("K (Any): " + anyValue);
        }
    }

