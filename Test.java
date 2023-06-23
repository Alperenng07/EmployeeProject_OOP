public class Test {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployees= new SalariedEmployee("Alperen","GUDUK","787-787-787",12000);
        HourlyEmployee  hourlyEmployees=new HourlyEmployee("Talha","BOZDAG","787-331--522",12,20);
        CommissionEmploye commissionEmployes= new CommissionEmploye("Metin","BAYAR","357-757-787",150000,0.2);
        BasePlusCommisionEmployee baseSalariedCommisionEmployees=new BasePlusCommisionEmployee("Feyyaz","ÇETIN","787-121-678",10000,0.3,3000);
        Invoice invoice=new Invoice("202005041","Medical",10000,180);


        Payable payableObjects[] = new Payable[ 6 ];
        payableObjects[ 0 ] = new Invoice("202005041","Medical",10000,180);
        payableObjects[ 1 ] = new Invoice("202105053","car",100000,12);
        payableObjects[ 2 ] = new SalariedEmployee("Alperen","GUDUK","787-787-787",12000);
        payableObjects[ 3 ] = new HourlyEmployee("Talha","BOZDAG","787-331--522",12,20);
        payableObjects[ 4 ] = new CommissionEmploye("Metin","BAYAR","357-757-787",150000,0.2);
        payableObjects[ 5 ] = new BasePlusCommisionEmployee("Feyyaz","ÇETIN","787-121-678",10000,0.3,3000);

        System.out.println("--------Invoices and Employee Array Processed Polymorphically----------");
        double newgetPaymentAmount=baseSalariedCommisionEmployees.getPaymentAmount()+baseSalariedCommisionEmployees.getBaseSalary()*1 / 10;
        for (Payable i:payableObjects) {
            if (i instanceof BasePlusCommisionEmployee) {
                System.out.println(i);
                System.out.println("New Base Salary with %10 inreases is " + baseSalariedCommisionEmployees.getBaseSalary()*11 / 10 );

                System.out.println("Payment Amount:"+newgetPaymentAmount+"\n");
            } else {
                System.out.println(i);
                System.out.println("Payment Amount:"+i.getPaymentAmount()+"\n");

            }
        }
        for (int j=0;j<6;j++) {
            System.out.println("Payable "+ j +" is  a/an " +  payableObjects[j].getClass().getName());
        }
    }
}
