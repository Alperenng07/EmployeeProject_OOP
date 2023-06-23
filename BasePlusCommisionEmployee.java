
public class BasePlusCommisionEmployee extends CommissionEmploye {
    private double baseSalary;
    public BasePlusCommisionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, SSN,grossSales,commissionRate);
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Base Salary can not be lower than 0 !!! \n Could not upload... ");
            System.exit(1);
        }
    }

    public double getBaseSalary() {

        return this.baseSalary ;
    }

    public void setBaseSalary(double baseSalary){
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Base Salary can not be lower than 0 !!! \n Could not upload... ");
            System.exit(1);
        }
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount()+baseSalary;
    }

    @Override
    public String toString() {
        String baseSalary="Base Salary:"+this.baseSalary;
        return "BasePlusCommisionEmployee\n"+super.toString()+"\n"+baseSalary;
    }
}
