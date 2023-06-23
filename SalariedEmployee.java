public class SalariedEmployee extends Employee {



    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN,double weeklySalary) {
        super(firstName, lastName, SSN);
        if(weeklySalary<0){
            System.out.println("Weekly Salary can not be lower than 0 !!! \n Could not upload... ");
            System.exit(1);
        }else {
            this.weeklySalary = weeklySalary;}
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary<0){
            System.out.println("Weekly Salary can not be lower than 0 !!! \n Could not upload... ");
            System.exit(1);
        }
        else {
            this.weeklySalary = weeklySalary;}
    }



    @Override
    public String toString() {
        String weeklySalaray="Weekly Salary:"+this.weeklySalary;

        return "SalariedEmployee\n"+super.toString()+"\n"+weeklySalaray;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }
}
