package lab14;

import java.util.regex.*;

public class DigitPlus {
    public static boolean hasDigitsWithoutPlus(String text) {
        Pattern pattern = Pattern.compile("\\d\\s*\\+");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public static void main(String[] args) {
        String[] testTexts = {
                "(1 + 8) – 9 / 4",
                "6 / 5 – 2 * 9",
        };

        for (String text : testTexts) {
            boolean hasDigitsWithoutPlus = hasDigitsWithoutPlus(text);
            System.out.printf("'%s' -> %s%n", text,
                    hasDigitsWithoutPlus ? "ПРАВИЛЬНО" : "НЕПРАВИЛЬНО");
        }
    }
}