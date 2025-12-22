package lab03;
import java.util.Scanner;

public class ConverterValuta {
    private static final double USD = 97.50;
    private static final double EUR = 104.20;
    private static final Scanner scanner = new Scanner(System.in);
    //конвертер валют
    public static double convert(double value, String fromC, String toC){
        double usdV = toRubles(value, fromC);
        return FromRubles(usdV, toC);
    }
    public static double FromRubles(double Rubles, String valuta) {
        return switch (valuta.toUpperCase()) {
            case "USD" -> Rubles / USD;
            case "EUR" -> Rubles / EUR;
            default -> Rubles;
        };
    }

    private static double toRubles(double Ruble, String valuta) {
        return switch (valuta.toUpperCase()) {
            case "USD" -> Ruble*USD;
            case "EUR" -> Ruble*EUR;
            default -> Ruble;
        };
    }

    private static String correct() {
        while (true) {
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("USD") || input.equals("RUB") || input.equals("EUR")) {
                return input;
            }

            System.out.print("Неверная валюта! Введите USD, EUR, RUB: ");
        }
    }

    private static double provDouble() {
        while (true) {
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (number >= 0) {
                    return number;
                } else {
                    System.out.print("Число не может быть отрицательным! Введите снова: ");
                }
            } catch (Exception e){
                System.out.print("Это не число! Введите снова: ");
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите сумму: ");
        double value = provDouble();

        System.out.print("Из валюты(USD/EUR/RUB): ");
        String from = correct();

        System.out.print("В валюту(USD/EUR/RUB): ");
        String to = correct();

        double result = convert(value, from, to);
        System.out.printf("Результат: %.2f %s = %.2f %s%n",
                value, from.toUpperCase(), result, to.toUpperCase());
    }



}

