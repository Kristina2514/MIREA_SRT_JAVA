package lab26.Exercise2;

interface List<T> extends Iterable<T> {
    void add(T item);
    T get(int index);
    int size();
}
