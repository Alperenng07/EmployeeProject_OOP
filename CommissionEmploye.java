
public class CommissionEmploye extends Employee {
    private double grossSales;
    private double commissionRate;
    public CommissionEmploye(String firstName, String lastName, String SSN,double grossSales,double commissionRate) {
        super(firstName, lastName, SSN);
        if(grossSales>=0){
            this.grossSales =grossSales;}
        else {
            System.out.println("Gross Sales can not be lower than 0 !!! \n Could not upload... ");
            System.exit(1);
        }
        if(commissionRate>0&&commissionRate<1){
            this.commissionRate =commissionRate;}
        else {
            System.out.println("Commission Rate must be between to 0-1 !!! \n Could not upload... ");
            System.exit(1);
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate>0&&commissionRate<1){
            this.commissionRate =commissionRate;}
        else {
            System.out.println("Commission Rate must be between to 0-1 !!! \n Could not upload... ");
            System.exit(1);
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales>=0){
            this.grossSales =grossSales;}
        else {
            System.out.println("Gross Sales can not be lower than 0 !!! \n Could not upload... ");
            System.exit(1);
        }
    }



    @Override
    public String toString() {
        String grossSales="Gross Sales:"+this.grossSales;
        String commissionRate="Commission Rate:"+this.commissionRate;
        return "Commission Employee\n"+super.toString()+"\n"+grossSales+"-"+commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return grossSales*commissionRate;
    }
}
