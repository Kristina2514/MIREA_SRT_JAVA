    package lab27;

    public class HashTab {
        static class Node {
            String key;
            int value;
            Node next;

            Node(String key, int value) {
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }

        private Node[] table;
        private int size;
        private int capacity;

        // вычисление индекса по ключу
        private int hashtabHash(String key) {
            return Math.abs(key.hashCode()) % capacity;
        }

        // создание таблицы
        public void hashtabInit(int capacity) {
            this.capacity = capacity;
            this.table = new Node[capacity];
            this.size = 0;
        }

        // добавление элемента
        public void hashtabAdd(String key, int value) {
            int index = hashtabHash(key);

            Node current = table[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }

            Node newNode = new Node(key, value);
            newNode.next = table[index];
            table[index] = newNode;
            size++;
        }

        // поиск значения по ключу
        public Integer hashtabLookup(String key) {
            int index = hashtabHash(key);
            Node current = table[index];

            while (current != null) {
                if (current.key.equals(key)) {
                    return current.value;
                }
                current = current.next;
            }

            return null;
        }

        // удаление по ключу
        public void hashtabDelete(String key) {
            int index = hashtabHash(key);
            Node current = table[index];
            Node prev = null;

            while (current != null) {
                if (current.key.equals(key)) {
                    if (prev == null) {
                        table[index] = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    size--;
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
    }
