package lab11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        Date currentDate = new Date();
        System.out.println("Текущая системная дата и время: " + dateFormat.format(currentDate));

        try {
            System.out.print("Введите дату и время в формате dd.MM.yyyy HH:mm:ss: ");
            String userInput = scanner.nextLine();

            Date userDate = dateFormat.parse(userInput);

            System.out.println("Результаты сравнения:");
            System.out.println("Введенная дата: " + dateFormat.format(userDate));
            System.out.println("Текущая дата: " + dateFormat.format(currentDate));

            int comparator = userDate.compareTo(currentDate);

            if (comparator < 0) {
                System.out.println("Введенная дата уже прошла");
            } else if (comparator > 0) {
                System.out.println("Введенная дата еще не наступила");
            } else {
                System.out.println("Даты совпадают");
            }

            long difference = userDate.getTime() - currentDate.getTime();
            long differenceInSeconds = Math.abs(difference) / 1000;
            long differenceInMinutes = differenceInSeconds / 60;
            long differenceInHours = differenceInMinutes / 60;
            long differenceInDays = differenceInHours / 24;

            System.out.println("Разница во времени:");
            System.out.println("В секундах: " + differenceInSeconds + " сек");
            System.out.println("В минутах: " + differenceInMinutes + " мин");
            System.out.println("В часах: " + differenceInHours + " ч");
            System.out.println("В днях: " + differenceInDays + " д");

        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
        } finally {
            scanner.close();
        }
    }
}