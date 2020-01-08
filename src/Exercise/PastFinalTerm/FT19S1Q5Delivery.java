/*
 * 5a. Package delivery services offer a number of different shipping options, each with specific costs associated. Write a program to represent the delivery packages. Design a Delivery class that consists of the following members: 
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
 */
package Exercise.PastFinalTerm;

public class FT19S1Q5Delivery {
    private String sender, recipient;
    private double kg;

    public FT19S1Q5Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.kg = weight;
    }
    
    public double totalCost(){
        
        if(kg <= 5){
            return kg * 2.8;  
        } else if (kg > 5 && kg <= 20){
            return (5 * 2.8) + ((kg - 5) * 5.2);
        } else if (kg > 20 && kg <= 50){
            return (5 * 2.8) + (15 * 5.2) + ((kg - 20) * 7.0);
        } else if (kg > 50){
            return (5 * 2.8) + (15 * 5.2) + (30 * 7.0) + ((kg - 50) * 8.6);
        } else {
            return 0;
        }
        
    }

    public String toString() {
        return "From: " + sender + " To: " + recipient + 
               "\nWeight of Package : " + kg + " kg" + 
               "\nShipping Cost : RM" + String.format("%.2f\n", totalCost());
    }
    
}
