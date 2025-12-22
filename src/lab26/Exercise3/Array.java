package lab26.Exercise3;

import java.util.Arrays;
import java.util.Iterator;

class Array<T> implements SimpleList<T> {
    private Object[] data;
    private int size;

    public Array() {
        data = new Object[10];
        size = 0;
    }

    @Override
    public void add(T item) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    @Override
    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new MyIterator<>(this);
    }
}
