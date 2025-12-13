package lab14;

public class StringSovpad {

    public static boolean isValidString(String input) {
        return input.matches("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {
        // Тестовые примеры
        String[] testStrings = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340"
        };

        System.out.println("Проверка строк на соответствие c 'abcdefghijklmnopqrstuv18340':");
        for (String test : testStrings) {
            boolean isValid = isValidString(test);
            System.out.printf("'%s' -> %s%n", test, isValid ? "ПРАВИЛЬНО" : "НЕПРАВИЛЬНО");
        }
    }
}
