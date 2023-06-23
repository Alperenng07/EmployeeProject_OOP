
public class Invoice implements Payable{
    private String partNumber;
    private String partDescription;
    private double quantity;
    private double pricePerItem;

    public Invoice(String partNumber,String partDescription,double quantity,double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setQuantity(double quantity) {
        if(quantity<0){
            System.out.println("Quantity can not be lower than 0 !!!!!!\n Could not upload...");
            System.exit(1);
        }
        else {
        this.quantity = quantity;}
    }
    public double getQuantity() {
        return quantity;
    }
    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem<=0){
            System.out.println("Price per item  can not be equals to 0 and lower than 0 !!!!!!\n Could not upload...");
            System.exit(1);
        }
        else {
        this.pricePerItem = pricePerItem;}
    }
    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    @Override
    public String toString() {
        return "Invoice"+"\nPart Number:" + partNumber +
                "(" + partDescription +")" +
                "\nQuantity=" + quantity +
                "\nPrice Per Item=" + pricePerItem
                ;
    }

    @Override
    public double getPaymentAmount() {
        return pricePerItem*quantity;
    }
}
