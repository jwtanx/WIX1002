/*
1. Create an abstract class DiscountPolicy. It has a single abstract method computeDiscount that return the discount for the purchase of a given number of item. The method has two parameters count and itemCost. Derived a class BulkDiscount from DiscountPolicy. It has a constructor that has two parameters minimum and discount rate. It has a method computeDiscount that compute the discount base on discount rate if the number of item more than minimum. Otherwise, no discount given. Derived a class OtherDiscount that compute the discount base on the table below

N (number of Item) 1 – 2    3 – 5   6 – 8   >8 
Discount             0       10%     20%    30%

Derived a class combineDiscount from DiscountPolicy. It has two parameters of type DiscountPolicy It has a method computeDiscount that return the maximum value returned by the computeDiscount for the two discount policies. Create a Tester class to test the program
 */
package Tutorial.T10;

import java.util.Scanner;

public class Q1TesterClass {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of item purchased: ");
        int num = s.nextInt();
        s.nextLine();
        
        System.out.print("Enter total cost: $ ");
        double cost = s.nextDouble();
        
        // BulkDiscount, let minimum = 20, then the discount rate is 10%
        Q1BulkDiscount a = new Q1BulkDiscount(20, 0.10);
        System.out.print("BulkDiscount Policy Discount: $ ");
        displayDiscount(a, num, cost);
        
        // OtherDiscount
        Q1OtherDiscount b = new Q1OtherDiscount();
        System.out.print("OtherDiscount Policy Discount: $ ");
        displayDiscount(b, num, cost);
        
        Q1CombineDiscount c = new Q1CombineDiscount();
        System.out.print("\nCombined Discount: $ ");
        displayCombineDiscount(c);
    }
    
    public static void displayDiscount(Q1DiscountPolicy dis, int num, double cost) {
        System.out.printf("%.2f\n", dis.computeDiscount(num, cost));
    }
    
    // NOT SURE HERE
    public static void displayCombineDiscount(Q1DiscountPolicy dis){
        System.out.printf("%.2f\n", dis.computeDiscount(0, 0));
    }
    
}
