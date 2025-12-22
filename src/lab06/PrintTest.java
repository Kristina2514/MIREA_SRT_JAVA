package lab06;

public class PrintTest {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", "Лев Толстой", 1869, 1225);
        Shop shop = new Shop("Читай город", "ул. Ленина, 15", "Книжный");

        book.print();
        shop.print();
    }
}