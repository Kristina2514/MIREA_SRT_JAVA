package lab20;

public class Generic1<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Generic1(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void printClassNames() {
        System.out.println("Тип T (first): " + first.getClass().getName());
        System.out.println("Тип V (second): " + second.getClass().getName());
        System.out.println("Тип K (third): " + third.getClass().getName());
    }

    @Override
    public String toString() {
        return "TripleGeneric{" +
                "first=" + first + " (" + first.getClass().getSimpleName() + "), " +
                "second=" + second + " (" + second.getClass().getSimpleName() + "), " +
                "third=" + third + " (" + third.getClass().getSimpleName() + ")}";
    }

}
