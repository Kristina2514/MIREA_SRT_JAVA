package lab21;

import java.util.Arrays;

public class ArrDif<T> {
    private T[] data;

    public ArrDif(T[] arr) {
        this.data = arr;
    }

    public T get(int i) {
        return data[i];
    }

    public void set(int i, T value) {
        data[i] = value;
    }
}

