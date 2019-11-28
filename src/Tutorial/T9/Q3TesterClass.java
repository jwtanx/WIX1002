/*
3. Define a class PaySystem. The class consists of the payrate per hour and the number of hours. The class also contains a method to return the total pay for a given amount of hours and a method to display the total payment. Derive a class RegularPay from PaySystem that has a constructor and did not override any base methods. Derived a class SpecialPay from PaySystem that override the base method and return the total pay plus 30% commission
 */
package Tutorial.T9;

import java.util.Random;

public class Q3TesterClass {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        double pRate = Math.round(r.nextDouble()*10000.0)/100.0;
        int h = 1 + r.nextInt(100);
        
        Q3RegularPay staff1 = new Q3RegularPay(pRate, h);
        staff1.display();
        
        Q3SpecialPay staff1SpecialPay = new Q3SpecialPay(pRate, h);
        System.out.printf("\nSpecial pay : RM %.2f\n", staff1SpecialPay.calTotalPay());
        
    }
}
