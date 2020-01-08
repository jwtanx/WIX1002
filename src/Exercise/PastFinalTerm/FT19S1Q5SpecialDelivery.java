/*
 * 5b. Design a SpecialDelivery class that extends the Delivery class. The SpecialDelivery class has the following members: 
- A field for the weekend delivery. The value is either true or false. 
- A field for the nighttime delivery. The value is either true or false.
- A constructor. 
- A totalCost method that returns the total shipping cost. The shipping cost is similar to normal delivery, with extra charges of RM50 for weekend delivery. Besides, an extra 20% of the total shipping cost if the package is delivered at night. 
- A toString method that returns the weekend and nighttime delivery.

Mutu is planning to deliver the following package in Table 2. Write a tester class that create the suitable objects and then determine the total shipping cost for each package delivered and the grand total of shipping cost. 

Table 2: Package Delivery 
Sender      Recipient   weight of package in kilogram   Weekend Delivery    Night Time Delivery 
Ali         Ahmad       4.4                             No                  No 
Ah Chong    Fatimah     63.1                            No                  No
FSKTM, UM   FK, UM      32.5                            Yes                 No
Ang         Liew        19.0                            Yes                 Yes
 */
package Exercise.PastFinalTerm;

public class FT19S1Q5SpecialDelivery extends FT19S1Q5Delivery{
    
    boolean weekendDelivery, nighttimeDelivery;

    public FT19S1Q5SpecialDelivery(String sender, String recipient, double weight, boolean wd, boolean nd) {
        super(sender, recipient, weight);
        weekendDelivery = wd;
        nighttimeDelivery = nd;
    }
    
    public double totalCost(){
        
        if(weekendDelivery){
            if(nighttimeDelivery){
                return (super.totalCost() + 50) * 1.2;
            } else {
                return super.totalCost() + 50;
            }
        } else if (nighttimeDelivery){
            return super.totalCost() * 1.2;
        } else {
            return super.totalCost();
        }
        
    }

    public String toString() {
        
        if(weekendDelivery && nighttimeDelivery){
            return super.toString() + "Weekend Delivery Night Time Delivery\n";
        } else if (weekendDelivery){
            return super.toString() + "Weekend Delivery\n";
        } else if (nighttimeDelivery){
            return super.toString() + "Night Time Delivery\n";
        } else {
            return super.toString();
        }
    }
    
    
    
    
}
