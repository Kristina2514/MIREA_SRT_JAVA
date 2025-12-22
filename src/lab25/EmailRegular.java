package lab25;

import java.util.regex.Pattern;

public class EmailRegular {
    private static final String emailreg =
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+(?:\\.[a-zA-Z]{2,})?$";

    public static boolean isValidEmail(String email) {
        return Pattern.matches(emailreg, email);
    }

    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String."};
        System.out.println("Проверка email адресов:");
        for (String email : emails) {
            System.out.printf("%-30s -> %s%n",
                    email,
                    isValidEmail(email) ? "Корректный" : "Неправильный"
            );
        }
    }
}