package lab19;

public class Client {
    private String fullName;
    private String expectedINN;

    public Client(String fullName, String expectedINN) {
        this.fullName = fullName;
        this.expectedINN = expectedINN;
    }

    public String getFullName() {
        return fullName;
    }

    public String getExpectedINN() {
        return expectedINN;
    }

    public void makePurchase(String enteredINN) throws InvalidINNException {
        System.out.println("Клиент: " + fullName);
        System.out.println("Ожидаемый ИНН: " + expectedINN);
        System.out.println("Введенный ИНН: " + enteredINN);

        if (INNCheck.isINNValidForClient(enteredINN, this)) {
            System.out.println("ИНН прошел проверку.");
        }
    }
}
