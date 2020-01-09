/*
 * 6b) Define the ShippedOrder subclass. It contains:
- a method computeTotalPrice() that overrides compute TotalPrice by adding a shipping and handling charge of $4.00. 
- a method toString() that returns a string description for the ShippedOrder.
 */
package Exercise.PastFinalTerm;

public class FT19S2Q6ShippedOrder extends FT19S2Q6Order{

    public FT19S2Q6ShippedOrder(String customerName, String customerID, int quantity, double unitPrice) {
        super(customerName, customerID, quantity, unitPrice);
    }
    
    @Override
    public double computeTotalPrice(){
        return super.computeTotalPrice() + 4;
    }

    public String toString() {
        return "Shipped\n" + super.toString();
    }
    
}
