package lab14;

import java.util.regex.*;

public class CorrectPassw {

    public static boolean isStrongPassword(String password) {
        // Проверка длины
        if (password.length() < 8) {
            return false;
        }
        // Проверка допустимых символов
        if (!password.matches("[a-zA-Z0-9_]+")) {
            return false;
        }
        // Проверка наличия хотя бы одной заглавной буквы
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        // Проверка наличия хотя бы одной строчной буквы
        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        // Проверка наличия хотя бы одной цифры
        if (!password.matches(".*[0-9].*")) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // Тестовые примеры
        String[] testPasswords = {
                "F032_Password",
                "TrySpy12",
                "smart_pass",
                "A007",
        };

        for (String password : testPasswords) {
            boolean isValid = isStrongPassword(password);
            System.out.printf("'%s' -> %s%n", password,
                    isValid ? "ПРАВИЛЬНО" : "НЕПРАВИЛЬНО");
        }
    }
}
