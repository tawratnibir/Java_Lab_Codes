package payrollsystem;

public class BasePlusCommissionEmployee extends CommisionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }
    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    protected double getBaseSalary() {
        return this.baseSalary;
    }
    protected void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    //setter was used for definite purpose, manipulating field from main function by increasing base salary to 110%
    @Override
    public double earnings(){
        return this.getBaseSalary() + super.earnings();
    }
    @Override
    public String toString() {
        return ("First name: " + super.getFirstName() + "\nLast name: " + super.getLastName() + "\nSocial Security Number: " +
                super.getssn() + "\nType: Commission\n" +
                "\nBase Salary: " +getBaseSalary() +
                "\nGross Sales: " + getGrossSales() +
                "\nCommission Rate: " + getCommissionRate() +
                "\nSalary: " + this.earnings() + "\n");
    }
}
