package lab13;

public class TestPhoneNumb {
    public static void main(String[] args) {
        String[] testNumbers = {
                "+79175655655",
                "+104289652211",
                "89175655655",
                "79175655655",
                "+441632960123",
                "+74951234567"};
        for (String number : testNumbers) {
            try {
                String formatted = PhoneNumb.formatPhoneNumb(number);
                System.out.printf("%-12s → %s%n", number, formatted);
            } catch (Exception e) {
                System.out.printf("%-12s → ОШИБКА: %s%n", number, e.getMessage());
            }
        }

        String[] invalidNumb = {"12345", "abcdef", "+791756556", ""};
        for (String number : invalidNumb) {
            try {
                String formatted = PhoneNumb.formatPhoneNumb(number);
                System.out.printf("%-12s → %s%n", number, formatted);
            } catch (Exception e) {
                System.out.printf("%-12s → ОШИБКА: %s%n", number, e.getMessage());
            }
        }
    }
}
