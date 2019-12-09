/*
1. cont. Derived a class combineDiscount from DiscountPolicy. It has two parameters of type DiscountPolicy It has a method computeDiscount that return the maximum value returned by the computeDiscount for the two discount policies.
 */
package Tutorial.T10;

public class Q1CombineDiscount extends Q1DiscountPolicy{
    
    public Q1CombineDiscount(){
        
    }
    
    public double computeDiscount(int count, double discountRate){
        
        return discount;
        
    }
    
}
