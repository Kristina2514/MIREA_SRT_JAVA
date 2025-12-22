package lab26.Exercise3;

import java.util.Iterator;
import java.util.NoSuchElementException;

class MyIterator<T> implements Iterator<T> {
    private final SimpleList<T> list;
    private int currentIndex;

    public MyIterator(SimpleList<T> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(currentIndex++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
