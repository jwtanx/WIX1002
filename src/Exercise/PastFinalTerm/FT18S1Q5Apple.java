/*
 * 5. Design an Apple class that extends the Fruit class. The Apple class has the following members:
 A field for the quantity of apple. 
 A constructor. 
 A totalPrice method that returns the total price of the apple purchased. The price of a Green apple is RM1.20, while the price of a Red apple is RM1.80.  
 A toString method that return the quantity and total price of the apple purchased.
 */
package Exercise.PastFinalTerm;

public class FT18S1Q5Apple extends FT18S1Q5Fruit{
    
    private int quantity;
    
    public FT18S1Q5Apple(int quantity, String type, String name) {
        super(name, type);
        this.quantity = quantity;
    }
    
    public double totalPrice(){
        switch (type) {
            case "Green":
                return quantity * 1.2;
            case "Red":
                return quantity * 1.8;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - " + quantity + " = RM " + totalPrice();
    }
}
