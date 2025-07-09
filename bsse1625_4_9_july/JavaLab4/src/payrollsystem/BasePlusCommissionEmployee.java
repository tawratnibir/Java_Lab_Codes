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
        return String.format("%s%nType: Base Plus Commission Employee%nGross Sales: $%.2f%nCommission Rate: %.2f%%%nBase Salary: $%.2f",
                super.toString(), getGrossSales(), getCommissionRate() * 100, getBaseSalary());
    }

}
