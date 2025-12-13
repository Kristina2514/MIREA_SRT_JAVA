package lab13;

public class PhoneNumb {
    public static String formatPhoneNumb(String phoneNumb) {
        String cleaned = phoneNumb.replaceAll("[^\\d+]", "");

        if (cleaned.length() < 11) {
            throw new IllegalArgumentException("Номер некорректный: " + phoneNumb);
        }

        String countryCode;
        String numbPart;

        if (cleaned.startsWith("8")) {
            countryCode = "7";
            numbPart = cleaned.substring(1);
        }

        else if (cleaned.startsWith("+")) {
            int countryCodelen = cleaned.length() - 10 - 1;
            countryCode = cleaned.substring(1, 1+countryCodelen);
            numbPart = cleaned.substring(1+countryCodelen);
        }

        else if (cleaned.length() == 11 && cleaned.startsWith("7")) {
            countryCode = "7";
            numbPart = cleaned.substring(1);
        }

        else {
            throw new IllegalArgumentException("Неверный формат номера: " + phoneNumb);
        }

        if (numbPart.length() != 10 || !numbPart.matches("\\d{10}")) {
            throw new IllegalArgumentException("Номер должен быть из 10 цифр: " + phoneNumb);
        }

        String formattedNumb = "+" + countryCode + numbPart.substring(0, 3) + "-" + numbPart.substring(3, 6) + numbPart.substring(6);

        return formattedNumb;
    }
}
