public class HourlyEmployee extends  Employee {
    private double wage;
    private double hour;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        if(hour>=0&&hour<=168){
            this.hour = hour;}
        else {
            System.out.println("Hour can not be lower than 0 and upper than 168 !!! \n Could not upload... ");
            System.exit(1);
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage>=0){
            this.wage = wage;}
        else {
            System.out.println("Wage can not be lower than 0 !!! \n Could not upload... ");
            System.exit(1);
        }
    }

    public HourlyEmployee(String firstName, String lastName, String SSN,double wage,double hour) {
        super(firstName, lastName, SSN);
        if(wage>=0){
            this.wage = wage;}
        else {
            System.out.println("Wage can not be lower than 0 !!! \n Could not upload... ");
            System.exit(1);
        }
        if(hour>=0&&hour<=168){
            this.hour = hour;}
        else {
            System.out.println("Hour can not be lower than 0 and upper than 168 !!! \n Could not upload... ");
            System.exit(1);
        }
    }



    @Override
    public String toString() {
        String wage ="Hourly Wage:"+ this.wage;
        String hour="Hours Worked:"+ this.hour;
        return "Hourly Employee\n"+super.toString()+"\n"+wage+"-"+hour;
    }

    @Override
    public double getPaymentAmount() {
        if (hour > 40) {
            return (40 * wage)+((hour-40) * 3 / 2);
        } else {
            return hour * wage;
        }
    }
}
