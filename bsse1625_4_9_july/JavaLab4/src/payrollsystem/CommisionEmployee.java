package payrollsystem;

public class CommisionEmployee extends Employee{
    private final double grossSales;
    private final double commissionRate;
    public CommisionEmployee() {
        super();
        this.grossSales = 0;
        this.commissionRate = 0;
    }
    public CommisionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    protected double getGrossSales() {
        return this.grossSales;
    }

    protected double getCommissionRate() {
        return this.commissionRate;
    }
    //no setters used as fields kept private final for risk-free data manipulations
    @Override
    public double earnings(){
        return this.grossSales * this.commissionRate / 100;
    }
    @Override
    public String toString() {
        return String.format("%s%nType: Commission Employee%nGross Sales: $%.2f%nCommission Rate: %.2f%%",
                super.toString(), getGrossSales(), getCommissionRate() * 100);
    }

}
