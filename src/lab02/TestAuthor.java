package lab02;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Кристина", "rodkina.kristina", 'Ж');

        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        System.out.println("...Изменение почты...");
        author.setEmail("rodkina.kr");
        System.out.println("Новая почта: " + author.getEmail());

        System.out.println("Информация о пользователе:");
        System.out.println(author.toString());
        //неявный вызов, т.е. вывод этого метода у объекта автоматом
        System.out.println("Вызов toString(): ");
        System.out.println(author);
    }
}
