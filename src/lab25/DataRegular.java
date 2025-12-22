package lab25;


import java.util.regex.Pattern;

public class DataRegular {
    public static boolean inValidDate(String date) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([1-9][0-9]{3})$";
        if (!Pattern.matches(regex, date)) {
            return false;
        }

        String[] parts = date.split("/");
        int d = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);

        if (y < 1900 || y > 9999) return false;

        if (m == 2) {
            boolean leap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
            return leap ? d <= 29 : d <= 28;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return d <= 30;
        }
        return d <= 31;
    }

    public static void main(String[] args) {
        String[] tests = {
                "29/02/2000",
                "30/04/2003",
                "01/01/1900",
                "1/1/2003",
                "29/02/2001",
                "30-04-2003"};
        for (String date : tests) {
            System.out.printf("%-12s -> %s%n", date, inValidDate(date) ? "Корректная" : "Неправильная");
        }

    }
}
