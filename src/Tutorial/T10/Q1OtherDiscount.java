/*
1. cont.
Derived a class OtherDiscount that compute the discount base on the table below

N (number of Item) 1 – 2    3 – 5   6 – 8   >8 
Discount             0       10%     20%    30%
 */
package Tutorial.T10;

public class Q1OtherDiscount extends Q1DiscountPolicy{

    public Q1OtherDiscount() {
        
    }
    
    public double computeDiscount(int count, double itemCost){
        
        if(count >= 3 && count <= 5){
            discount += 0.10 * itemCost;
            return 0.10 * itemCost;
        }
        else if(count >= 6 && count <= 8){
            discount += 0.20 * itemCost;
            return 0.20 * itemCost;
        }
        else if(count > 8){
            discount += 0.30 * itemCost;
            return 0.30 * itemCost;
        }
        
        return 0;
    }
    
}
