package hometask.two;

public final class Customer extends Person {
    private int budget;
    private String username;

    public Customer(String firstName, String lastName, long phoneNumber, String mailAddress) {
        super(firstName, lastName, phoneNumber, mailAddress);
        setBudget(budget);
        this.username = firstName + lastName;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String showFullName(String firstName, String lastName) {
        return "dear customer " + firstName + " " + lastName;

    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {

        return budget;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", budget: " + budget +
                "} ";
    }

    @Override
    public void showId() {
        System.out.println(username);
    }
}