package lab23;

// первый добавленный элемент входит первый,
// элементы добавляются в конец удаляются из начала

public interface queue {
    void enqueue(Object element); // добавление элемента в конец
    Object element(); // получение 1 элемента
    Object dequeue(); // удалить и вернуть первый элемент
    int size();
    boolean isEmpty();
    void clear();
}
