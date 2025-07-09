package payrollsystem;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String ssn;
    public Employee() {
        this.firstName = "<first name>";
        this.lastName = "<last name>";
        this.ssn = "<ss number>";
    }
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    protected String getFirstName() {return this.firstName;}
    protected String getLastName() {return this.lastName;}
    protected String getssn() {return this.ssn;}
    //no setters used as fields kept private final for risk-free data manipulations
    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("Employee: %s %s%nssn: %s",
                getFirstName(), getLastName(), getssn());
    }
}
