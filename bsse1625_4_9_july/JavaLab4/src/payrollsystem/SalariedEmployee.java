package payrollsystem;

public class SalariedEmployee extends Employee{
    private final double weeklySalary;
    public SalariedEmployee(){
        super();
        this.weeklySalary = 0;
    }
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    protected double getWeeklySalary() {
        return this.weeklySalary;
    }
    //no setters used as fields kept private final for risk-free and unwanted data manipulations
    @Override
    public double earnings(){
        return this.weeklySalary;
    }
    @Override
    public String toString() {
        return ("First name: " + super.getFirstName() + "\nLast name: " + super.getLastName() + "\nSocial Security Number: " + super.getssn() + "\nType: Salaried\n" + "Salary: " + this.earnings() + "\n");
    }
}
