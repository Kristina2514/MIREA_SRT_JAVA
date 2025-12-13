package lab19;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client("Иванов Иван Иванович", "773620754311");
        try {
            System.out.print("\nВведите ваш ИНН (12 цифр): ");
            String enteredINN = scanner.nextLine().trim();

            client.makePurchase(enteredINN);

        } catch (InvalidINNException e) {
            System.out.println("\nОШИБКА ОФОРМЛЕНИЯ ЗАКАЗА:");
            System.out.println(e.getMessage());
            System.out.println("Заказ не может быть оформлен. Неверный ИНН.");
        } finally {
            System.out.println("\nВсе введено корректно.");
            scanner.close();
        }
    }
}
