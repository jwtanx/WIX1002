
/*
a) Design a CreditCard class that consists of the following members:
- A field for the name of the cardholder.
- A field for the number of the card. (16 digits)
- A field for the type of the card. (Cash Rebate / Point Reward)
- A constructor that contains all the above fields.
- A field for the total cash reward in RM.
- An accessor and mutator method for total reward.
- A toString method that returns the above information.
*/

package Exercise.PastFinalTerm;

public class FT16S1Q5CreditCard {
    
    private String name;
    private String cardNumber;
    private String cardType;
    private double totalReward;

    public FT16S1Q5CreditCard(String name, String cardNumber, String cardType) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    public double getTotalReward() {
        return totalReward;
    }

    public void setTotalReward(double totalReward) {
        this.totalReward = totalReward;
    }

    @Override
    public String toString() {
        return "Name: " + name + " (" + cardNumber + ")" +
               "\nCard Type : " + cardType +
               "\nTotal Reward : " + totalReward;
    }
    
}
