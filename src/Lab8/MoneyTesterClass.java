/*
 * 7. Define class money. The class is used to calculate the number of note and coins for a given amount of money. The available notes are RM100, RM50, RM10, RM5 and RM1. The available coins are 50cent, 20cent, 10cent and 5 cent. The class needs to round up the amount according to the table below. The class also contains addition and subtraction method to add or subtract two objects. 

Before Rounding                 After Rounding 
10.11, 10.12                    10.10
10.13, 10.14, 10.16, 10.17      10.15
10.18, 10.19                    10.20 

 */
package Lab8;

import java.util.Scanner;

// UNDONE

public class MoneyTesterClass {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter an amount: RM ");
        double amount = s.nextDouble();
        Money user = new Money(amount);
        
        user.roundOff();
        user.calculateAmount();
        System.out.println(user.toString());
        
        System.out.println("\nTest 1");
        user.addition(123.32, 66.67);
        
        System.out.println("\nTest 2");
        user.subtraction(123.23, 22.01);
        
        System.out.println("\nTest 3");
        user.subtraction(13.23, 222.01);
        
    }
}
