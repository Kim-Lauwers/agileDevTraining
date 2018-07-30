package be.kunlabora.refactoring.renamemethod;

public class Customer {
    private final String firstName;
    private final String secondName;

    public Customer(final String firstName, final String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFN() {
        return firstName;
    }

    public String getSN() {
        return secondName;
    }
}
