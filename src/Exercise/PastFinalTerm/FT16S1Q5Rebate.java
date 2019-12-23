/*
b) A cash rebate card provides 8% cashback on fuel, 5% cashback on utility bill payment, 2% cashback for grocery and 0.2% cashback for other. If the cardholder spends RM100 for fuel, the cardholder will get RM8 cashback. Design a Rebate class that extends the CreditCard class. The Rebate class must have the following members: 
- A constructor
- A getReward method that computes the total cash rebate.
 */
package Exercise.PastFinalTerm;

public class FT16S1Q5Rebate extends FT16S1Q5CreditCard{
    
    private double reward;
    
    public FT16S1Q5Rebate(String name, String cardNumber) {
        super(name, cardNumber, "Cash Rebate");
    }

    public void getReward(String type, double spend) {
        
        switch(type){
            case "Fuel":
                reward += (spend * 0.08);
                break;
            case "Utility":
                reward += (spend * 0.05);
                break;
            case "Grocery":
                reward += (spend * 0.02);
                break;
            case "Other":
                reward += (spend * 0.002);
                break;
        }
        
        super.setTotalReward(reward);
    }

    public void sendTotalReward(){
        super.setTotalReward(reward);
    }
    
}
