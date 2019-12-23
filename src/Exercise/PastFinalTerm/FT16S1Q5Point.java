/*
c) A point reward card provides 1 point for each RM1 spend. If the cardholder spends RM42.75, the cardholder will get 42 points. Each point can be converted into cash. (1 point RM0.01) The point reward card also provides double reward points for any spending on Friday, triple reward points for any spending on Saturday, and quadruple reward points for any spending on Sunday. Design a Point class that extends the CreditCard class. The Point class must have the following members:
- A constructor
- A getReward method that computes the total cash reward.
 */
package Exercise.PastFinalTerm;

public class FT16S1Q5Point extends FT16S1Q5CreditCard{
    
    private double reward;
    
    public FT16S1Q5Point(String name, String cardNumber) {
        super(name, cardNumber, "Point Reward");
    }

    public void getReward(String day, double spend) {
        
        int point = (int) spend;
        
        switch(day){
            
            case "Friday":
                point *= 2;
                break;
            case "Saturday":
                point *= 3;
                break;
            case "Sunday":
                point *= 4;
                break;
            default:
                point *= 1;
        }
        
        reward += point / 100.0;
        
    }
    
    public void sendTotalReward(){
        super.setTotalReward(reward);
    }
}
