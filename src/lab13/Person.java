package lab13;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder result = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            result.append(lastName);
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (result.length() > 0) result.append(" ");
            result.append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            result.append(middleName.charAt(0)).append(".");
        }

        return result.toString();
    }

    public String getLastName() {return lastName;}
    public String getFirstName() {return firstName;}
    public String getMiddleName() {return middleName;}

}
