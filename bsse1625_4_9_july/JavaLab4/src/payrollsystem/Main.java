package payrollsystem;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new SalariedEmployee("Thomas", "Muller", "111", 5000);
        Employee e2 = new HourlyEmployee("Robert", "Lewandowski", "222", 500, 46);
        Employee e3 = new CommisionEmployee("Manuel", "Neuer", "333", 45000, 0.5);
        Employee e4 = new BasePlusCommissionEmployee("Lionel", "Messi", "444", 57000, 0.6, 1500);

        Employee[] arr = {e1, e2, e3, e4};

        for(Employee emp: arr) {

            if(emp instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee empl = (BasePlusCommissionEmployee) emp;
                empl.setBaseSalary(((BasePlusCommissionEmployee) emp).getBaseSalary() * 1.10);
            }

            System.out.println(emp);
            System.out.println();
        }
    }
}
