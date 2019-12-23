/*
A credit card is a payment card issued to cardholders as a method of payment. There are two popular types of credit card namely the cash rebate card and the point reward card. Write a program to determine the best card to use. The program will invlude the following:

a) Design a CreditCard class that consists of the following members:
- A field for the name of the cardholder.
- A field for the number of the card. (16 digits)
- A field for the type of the card. (Cash Rebate / Point Reward)
- A constructor that contains all the above fields.
- A field for the total cash reward in RM.
- An accessor and mutator method for total reward.
- A toString method that returns the above information.

b) A cash rebate card provides 8% cashback on fuel, 5% cashback on utility bill payment, 2% cashback for grocery and 0.2% cashback for other. If the cardholder spends RM100 for fuel, the cardholder will get RM8 cashback. Design a Rebate class that extends the CreditCard class. The Rebate class must have the following members: 
- A constructor
- A getReward method that computes the fotal cash rebate.

v

d) Create a Main class using the code below to test the program. Complete the program to determine the best card to use based on the spending in table below. Assume that only one type of card can be used for all the spending. 

public static void main(String() args){
    Rebate r = new Rebate("John Lim", "1111222233334444");
    Point p = new Point("John Lim", "5555666677778888");
    // Complete the program 

No  Type        Day         Total (RM)
1   Grocery     Saturday    124.80
2   Other       Friday      64.60 
3   Fuel        Sunday      95.40
4   Utility     Friday      100.00
5   Other       Tuesday     220.00

Sample
Credit Card : John Lim (1111222233334444)
Card Type : Cash Rebate
Total Cash Reward : 15.6972
Credit Card : John Lim (5555666677778888)
Card Type : Point Reward
Total Cash Reward : 13.0
The best card is Cash Rebate Card

 */
package Exercise.PastFinalTerm;

public class FT16S1Q5 {
    public static void main(String[] args) {
        
        FT16S1Q5Rebate r = new FT16S1Q5Rebate("John Lim", "1111222233334444");
        FT16S1Q5Point p = new FT16S1Q5Point("John Lim", "5555666677778888");
        
        r.getReward("Grocery", 124.80);
        r.getReward("Other", 64.60);
        r.getReward("Fuel", 95.40);
        r.getReward("Utility", 100.00);
        r.getReward("Other", 220.00);
        r.sendTotalReward();
        System.out.println(r.toString());
        
        p.getReward("Saturday", 124.80);
        p.getReward("Friday", 64.60);
        p.getReward("Sunday", 95.40);
        p.getReward("Friday", 100.00);
        p.getReward("Tuesday", 220.00);
        p.sendTotalReward();
        System.out.println(p.toString());
        
        System.out.print("The best card is ");
        
        if(p.getTotalReward() > r.getTotalReward()){
            System.out.println("Point Reward Card");
        } else {
            System.out.println("Cash Rebate Card");
        }
        
        
    }
}
