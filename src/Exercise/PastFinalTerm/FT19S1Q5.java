/*
 * 5. Package delivery services offer a number of different shipping options, each with specific costs associated. Write a program to represent the delivery packages. Design a Delivery class that consists of the following members: 
- A field for the sender. 
- A field for the recipient. 
- A field for the weight of package in kilogram. 
- A constructor that contains the sender, recipient and weight of package in kilogram. 
- A totalCost method that returns the total shipping cost based on the Table 1 below. A 7 kilogram package cost RM24.40 (RM2.80*5 + RM5.20*2).
- A toString method that returns the sender, recipient, the weight of package in kilogram and total shipping cost. 

Table 1: Delivery Cost 
Weight of package in kilogram                   Cost per kilogram (RM)
Less than or equal to 5                         2.80
Greater than 5 and less than or equal to 20     5.20
Greater than 20 and less than or equal to 50    7.00
Greater than 50                                 8.60

Design a SpecialDelivery class that extends the Delivery class. The SpecialDelivery class has the following members: 
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
    
Sample output: 
From: Ali To: Ahmad 
Weight of Package : 4.4 kg 
Shipping Cost : RM12.32 

From : Ah Chong To: Fatimah 
Weight of Package : 63.1 kg 
Shipping Cost : RM414.66 

From : PSKTM, UM To: FK, UM 
Weight of Package : 32.5 kg 
Shipping Cost : RM229.5 
Weekend Delivery 

From : Ang To: Liew 
Weight of Package : 19.0 kg 
Shipping Cost : RM164.16 
Weekend Delivery Night Time Delivery 

The total shipping cost is RM 820.64 
 */
package Exercise.PastFinalTerm;

public class FT19S1Q5 {
    public static void main(String[] args) {
        
        FT19S1Q5SpecialDelivery a[] = new FT19S1Q5SpecialDelivery[4];
        
        a[0] = new FT19S1Q5SpecialDelivery("Ali", "Ahmad", 4.4, false, false);
        a[1] = new FT19S1Q5SpecialDelivery("Ah Chong", "Fatimah", 63.1, false, false);
        a[2] = new FT19S1Q5SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false);
        a[3] = new FT19S1Q5SpecialDelivery("Ang", "Liew", 19.0, true, true);
        
        double total = 0;
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i].toString());
            total += a[i].totalCost();
        }
        
        System.out.println("The total shipping cost is RM " + total);
        
    }
}
