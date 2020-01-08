/*
 * 2. Write a probram that accepts from the user the unit weight of a bag of coffee in kg and the number of bags sold. Display the total price of the sale, computed as

        totalPrice = unitWeight * numberOfBags * 5.99;
        totalPriceWithTax = totalPrice + totalPrice * 0.0725;
    where 5.99 is the cost per kg and 0.0725 is the sales tax.

Sample output:

Enter the number of bas sold : 32
Enter the weight per bag (kilograms) : 5

Price per kilogram  : $5.99
Sales tax           : 7.25%
Total price         : $1027.88

 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT19S2Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of bas sold : ");
        int numberOfBags = s.nextInt();
        
        System.out.print("Enter the weight per bag (kilograms) : ");
        int unitWeight = s.nextInt();
        
        double totalPrice = unitWeight * numberOfBags * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        
        System.out.println("Price per kilogram:\t$5.99");
        System.out.println("Sales tax:\t\t7.25%");
        System.out.printf("Total price:\t\t$%.2f\n",totalPriceWithTax);
        
        
    }
}
