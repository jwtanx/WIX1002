/*
1. cont. Derived a class BulkDiscount from DiscountPolicy. It has a constructor that has two parameters minimum and discount rate. It has a method computeDiscount that compute the discount base on discount rate if the number of item more than minimum. Otherwise, no discount given.
 */
package Tutorial.T10;

public class Q1BulkDiscount extends Q1DiscountPolicy{
    
    private double minimum, discountRate;
    
    public Q1BulkDiscount(double minimum, double discountRate) {
        this.minimum = minimum;
        this.discountRate = discountRate;
    }
    
    public double computeDiscount(int count, double itemCost){
        
        if(count >= minimum){
            
            discount += discountRate * itemCost;
            return discountRate * itemCost;
            
        }
        
        return 0;
    }
    
}
