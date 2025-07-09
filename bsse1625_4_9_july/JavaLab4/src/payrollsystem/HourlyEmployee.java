package payrollsystem;

public class HourlyEmployee extends Employee{
    private final double hourlySalary;
    private final double hoursWorked;
    public HourlyEmployee() {
        super();
        this.hourlySalary = 0;
        this.hoursWorked = 0;
    }
    public HourlyEmployee(String firstName, String lastName, String ssn, double hourlySalary, double hoursWorked) {
        super(firstName, lastName, ssn);
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }
    protected double getHourlySalary() {
        return this.hourlySalary;
    }
    protected double getHoursWorked() {
        return this.hoursWorked;
    }
    //no setters used as fields kept private final for risk-free data manipulations
    @Override
    public double earnings() {
        if(this.hoursWorked > 40) {
            return (this.hoursWorked - 40) * this.hourlySalary * 1.5 + this.hourlySalary * 40;
        }
        else{
            return this.hourlySalary * this.hoursWorked;
        }
    }
    @Override
    public String toString() {
        return ("First name: " + super.getFirstName() + "\nLast name: " + super.getLastName() + "\nSocial Security Number: " + super.getssn() + "\nType: Hourly\n" + "Salary: " + this.earnings() + "\n");
    }
}
