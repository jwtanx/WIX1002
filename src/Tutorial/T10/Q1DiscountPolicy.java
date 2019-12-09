/*
1. Create an abstract class DiscountPolicy. It has a single abstract method computeDiscount that return the discount for the purchase of a given number of item. The method has two parameters count and itemCost. Derived a class BulkDiscount from DiscountPolicy. It has a constructor that has two parameters minimum and discount rate. It has a method computeDiscount that compute the discount base on discount rate if the number of item more than minimum. Otherwise, no discount given. Derived a class OtherDiscount that compute the discount base on the table below

N (number of Item) 1 – 2    3 – 5   6 – 8   >8 
Discount             0       10%     20%    30%

Derived a class combineDiscount from DiscountPolicy. It has two parameters of type DiscountPolicy It has a method computeDiscount that return the maximum value returned by the computeDiscount for the two discount policies. Create a Tester class to test the program
 */
package Tutorial.T10;

public abstract class Q1DiscountPolicy {
    
    protected static double discount;
    
    public Q1DiscountPolicy() {
    }
    
    public abstract double computeDiscount(int count, double itemCost);
    
}
