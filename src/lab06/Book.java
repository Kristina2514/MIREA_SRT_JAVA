package lab06;

public class Book implements Printable {
    private String title;
    private String author;
    private int year;
    private int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title + ", Автор: " + author + ", Год издания: " + year + ", Количество страниц: " + pages);
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public int getPages() { return pages; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYear(int year) { this.year = year; }
    public void setPages(int pages) { this.pages = pages; }
}
