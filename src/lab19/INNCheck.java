package lab19;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class INNCheck {
    public static boolean isValidINN(String inn) throws InvalidINNException {
        if (inn == null || inn.trim().isEmpty()) {
            throw new InvalidINNException("ИНН не может быть пустым", inn);
        }

        if (inn.length() != 12) {
            throw new InvalidINNException("ИНН должен содержать 12 цифр. Введено: " + inn.length(), inn);
        }

        if (!inn.matches("\\d{12}")) {
            throw new InvalidINNException("ИНН должен содержать только цифры", inn);
        }

        return true;
    }

        public static boolean isINNValidForClient(String inn, Client client) throws InvalidINNException {
            if (!isValidINN(inn)) {
                return false;
            }
            return true;
        }
    }

