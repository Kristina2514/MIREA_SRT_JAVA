package lab19;

public class InvalidINNException extends Exception {
    private String inn;

    public InvalidINNException(String message) {
        super(message);
    }

    public InvalidINNException(String message, String inn) {
        super(message);
        this.inn = inn;
    }

    public InvalidINNException(String message, String inn, Throwable cause) {
        super(message, cause);
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }

    @Override
    public String getMessage() {
        if (inn != null) {
            return super.getMessage() + " [ИНН: " + inn + "]";
        }
        return super.getMessage();
    }
}
