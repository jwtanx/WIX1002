/*
3. Define a class PaySystem. The class consists of the payrate per hour and the number of hours. The class also contains a method to return the total pay for a given amount of hours and a method to display the total payment. Derive a class RegularPay from PaySystem that has a constructor and did not override any base methods. Derived a class SpecialPay from Q3PaySystem that override the base method and return the total pay plus 30% commission
 */
package Tutorial.T9;

public class Q3PaySystem {
    
    private double payrate;
    private int hours;
    
    public Q3PaySystem(){
        payrate = 0.0;
        hours = 0;
    }

    public Q3PaySystem(double payrate, int hours) {
        this.payrate = payrate;
        this.hours = hours;
    }
    
    public double calTotalPay(){
        double totalPay = payrate * hours;
        return totalPay;
    }

//    @Override
    public void display() {
        System.out.printf("\nPayrate : RM " + payrate + " per hour\nHours : " + hours + "\nTotal Pay : RM %.2f", calTotalPay());
    }
    
    
    
}
