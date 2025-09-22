package lab2;

public class Author {
    private String name;
    private String email;
    private char gender;

    // создание объектов класса
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
        //геттеры, выдают значения
        public String getName() {
            return name;
        }
        public String getEmail() {
            return email;
        }
        public char getGender() {
            return gender;
        }
        //сеттер, установка значения нового
        public void setEmail (String email){
            this.email = email;
        }
        //представление объектов в виде строки
        public String toString () {
            return name + " (" + gender + "): " + email;
        }


}
