package person;

public class Fio extends Param {
    private final String firstName;
    private final String lastName;
    private final String middleName;

    public Fio(final String firstName, final String lastName, final String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public final String toString() {
        return firstName + " " + lastName + " " + middleName;
    }
}
