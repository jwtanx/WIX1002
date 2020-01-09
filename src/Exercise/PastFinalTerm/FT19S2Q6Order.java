/*
 * 6. Define a class named Order that performs the order processing of a product and its subclass, ShippedOrder that calculates the product price including shipping costs. The Order class contains: 
- two String data fields named customer name and customer ID. 
- int data field named quantity ordered. 
- one double data field named unit price. 
- no-argument constructor with appropriate default values. 
- constructor that creates Order with the specified data values. 
- accessor and mutator methods for the data fields 
- a method computeTotalPrice() that returns: 
    totalPrice = quantity * unit price 
- a method toString() that returns a string description for the Order.
 */
package Exercise.PastFinalTerm;

public class FT19S2Q6Order {
    private String customerName;
    private String customerID;
    private int quantity;
    private double unitPrice;

    public FT19S2Q6Order() {
        customerName = "Customer1";
        customerID = "000";
        quantity = 0;
        unitPrice = 0;
    }

    public FT19S2Q6Order(String customerName, String customerID, int quantity, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double computeTotalPrice(){
        double totalPrice = quantity * unitPrice;
        
        return totalPrice;
    }

    public String toString() {
        return "Order record" +
               "\nCustomer Name : " + customerName + 
               "\nCustomer Id : " + customerID + 
               "\nQuantity ordered : " + quantity + 
               "\nUnit Price : " + unitPrice +
               "\nTotal Price : " + computeTotalPrice();
    }
    
    
    
}
