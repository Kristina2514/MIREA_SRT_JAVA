package lab14;

import java.util.regex.*;
import java.util.*;

public class CeniCorrect {

    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 100 RUB, 44 ERR, 0.004 EU";
        extractCorrect(text);
    }

    public static void extractCorrect(String text) {
        Pattern pattern = Pattern.compile("(\\d+\\.?\\d*)\\s*(USD|RUB|EU)\\b");
        Matcher matcher = pattern.matcher(text);

        List<String> prices = new ArrayList<>();

        while (matcher.find()) {
            String amountStr = matcher.group(1);

            try {
                double amount = Double.parseDouble(amountStr);
                if (amount > 0.01) {
                    prices.add(matcher.group());
                }
            } catch (NumberFormatException _) {

            }
        }
        if (prices.isEmpty()) {
            System.out.println("Цены не найдены");
        } else {
            for (String price : prices) {
                System.out.println("  " + price);
            }
        }
    }
}